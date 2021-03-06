/**
 * Java Level 3. Lesson 3. Homework 3.
 * @author Maya Plieva
 * @version Jan 28 2019
 */

//Controller.java

// ...

    private ChatLog chatLog;
    final static int CHAT_LOG_SIZE = 100;
    final static String CHAT_FILE_NAME = "chatlog.txt";

// ...

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setAuthorized(false);
        clientsList = FXCollections.observableArrayList();
        clientsView.setItems(clientsList);
        network = new Network();
        chatLog = new ChatLog(CHAT_FILE_NAME, CHAT_LOG_SIZE);
        String[] strs = chatLog.getStrings();
        for (String str : strs) {
            mainTextArea.appendText(str + "\n");
        }
    }

// ...

    public void sendAuth(ActionEvent actionEvent) {
        if (network.isntConnected()) {
            network.connect(
                    argsGetMessage -> {
                        mainTextArea.appendText((String) argsGetMessage[0]);
                        if(!chatLog.writeString((String) argsGetMessage[0]))
                            showAlert("Couldn't add a log msg");
                    },

// ...

//ChatLog.java

import java.io.*;
import java.util.ArrayList;

public class ChatLog {
    private BufferedReader chatLogReader;
    private FileWriter chatLogWriter;
    private ArrayList<String> chatlog;
    private String chatFileName;

    public ChatLog (String chatFileName, int chatLogSize) {
        chatlog = new ArrayList<>();
        this.chatFileName = chatFileName;

        try {
            chatLogReader = new BufferedReader(new FileReader(this.chatFileName));
            String str;
            while((str = chatLogReader.readLine()) != null) {
                chatlog.add(str);
                if(chatlog.size() > chatLogSize) chatlog.remove(0);
            }
            chatLogReader.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getStrings() {
        String[] strings = new String[chatlog.size()];
        chatlog.toArray(strings);
        return strings;
    }

    public boolean writeString(String str) {
        try(FileWriter chatLogWriter = new FileWriter(chatFileName, true)) {
            chatLogWriter.write(str);
        } catch (IOException e) {
            //e.printStackTrace();
            return false;
        }
        return true;
    }
}