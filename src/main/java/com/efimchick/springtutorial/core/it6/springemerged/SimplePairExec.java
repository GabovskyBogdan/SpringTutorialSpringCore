package com.efimchick.springtutorial.core.it6.springemerged;

public class SimplePairExec implements BusinessFunction {

    final MessageProvider provider;
    final MessageSender sender;

    public SimplePairExec(final MessageProvider provider,
                          final MessageSender sender) {
        this.provider = provider;
        this.sender = sender;
    }

    @Override
    public void exec() {
        sender.send(provider.getMessage());
    }
}
