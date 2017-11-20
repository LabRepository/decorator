package eu.jpereira.trainings.designpatterns.structural.decorator.channel.decorator;

import eu.jpereira.trainings.designpatterns.structural.decorator.channel.SocialChannel;

public class WordCensor extends SocialChannelDecorator {
    private String censoredWord;
    private final String sfw = "###";
    public WordCensor(String censoredWord, SocialChannel delegate) {
        this.censoredWord = censoredWord;
        this.delegate = delegate;
    }
    public WordCensor(String censoredWord){
        this.censoredWord = censoredWord;
    }
    @Override
    public void deliverMessage(String message) {
        String newMessage = message.replaceAll(censoredWord,sfw);
        delegate.deliverMessage(newMessage);
    }


}
