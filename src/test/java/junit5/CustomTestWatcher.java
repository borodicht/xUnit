package junit5;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class CustomTestWatcher implements TestWatcher {

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("SUCCESS: " + context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("FAILED: " + context.getDisplayName());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("DISABLED: " + context.getDisplayName() + ", причина: " + reason.orElse("не указана"));
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("ABORTED: " + context.getDisplayName());
    }
}
