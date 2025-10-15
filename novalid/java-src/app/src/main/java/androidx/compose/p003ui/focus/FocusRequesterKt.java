package androidx.compose.p003ui.focus;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusRequester.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m7105d2 = {"FocusRequesterNotInitialized", "", "getFocusRequesterNotInitialized$annotations", "()V", "InvalidFocusRequesterInvocation", "getInvalidFocusRequesterInvocation$annotations", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FocusRequesterKt {

    @NotNull
    private static final String FocusRequesterNotInitialized = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";

    @NotNull
    private static final String InvalidFocusRequesterInvocation = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";

    private static /* synthetic */ void getFocusRequesterNotInitialized$annotations() {
    }

    private static /* synthetic */ void getInvalidFocusRequesterInvocation$annotations() {
    }
}
