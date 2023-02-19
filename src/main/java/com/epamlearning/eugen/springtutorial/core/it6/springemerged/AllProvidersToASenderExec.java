package com.epamlearning.eugen.springtutorial.core.it6.springemerged;

import java.util.List;

public class AllProvidersToASenderExec implements BusinessFunction {

    List<MessageProvider> providers;
    MessageSender sender;

    public AllProvidersToASenderExec(final List<MessageProvider> providers) {
        this.providers = providers;
    }

    public AllProvidersToASenderExec(final List<MessageProvider> providers,
                                     final MessageSender sender) {
        this.providers = providers;
        this.sender = sender;
    }

    @Override
    public void exec() {
        for (MessageProvider provider : providers) {
            sender.send(provider.getMessage());
        }
    }
}
