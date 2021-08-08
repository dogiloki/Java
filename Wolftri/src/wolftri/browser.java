package wolftri;

/**
 *
 * @author Julio César Villanueva Ontiveros
 */

import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class browser extends JFXPanel{
    
    private WebEngine engine;
    
    public browser(){
        Platform.runLater(new Runnable(){
           @Override
           public void run(){
               WebView view=new WebView();
               engine=view.getEngine();
               setScene(new Scene(view));
           }
        });
        setVisible(true);
    }
    
    public void loadURL(final String url){
        Platform.runLater(new Runnable(){
            @Override
            public void run(){
                String tmp=toURL(url);
                if(tmp==null){
                    tmp=toURL(url);
                }
                engine.load(tmp);
            }
        });
    }
    
    public String toURL(String str){
        try{
            return new URL(str).toExternalForm();
        }catch(MalformedURLException ex){
            return null;
        }
    }
    
}