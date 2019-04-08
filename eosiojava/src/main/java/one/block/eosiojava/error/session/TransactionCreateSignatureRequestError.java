package one.block.eosiojava.error.session;

import org.jetbrains.annotations.NotNull;

/**
 * Error would come out of TransactionProcessor#CreateSignatureRequest
 */
public class TransactionCreateSignatureRequestError extends TransactionProcessorError {

    public TransactionCreateSignatureRequestError() {
    }

    public TransactionCreateSignatureRequestError(@NotNull String message) {
        super(message);
    }

    public TransactionCreateSignatureRequestError(@NotNull String message,
            @NotNull Exception exception) {
        super(message, exception);
    }

    public TransactionCreateSignatureRequestError(@NotNull Exception exception) {
        super(exception);
    }
}
