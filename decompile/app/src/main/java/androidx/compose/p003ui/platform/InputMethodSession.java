package androidx.compose.p003ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p003ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.p003ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0006R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "onConnectionClosed", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/jvm/functions/Function0;)V", Http2ExchangeCodec.CONNECTION, "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "disposed", "", "isActive", "()Z", "lock", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "dispose", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,157:1\n35#2:158\n35#2:159\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n129#1:158\n149#1:159\n*E\n"})
/* loaded from: classes3.dex */
public final class InputMethodSession {

    @Nullable
    public NullableInputConnectionWrapper connection;
    public boolean disposed;

    @NotNull
    public final Object lock = new Object();

    @NotNull
    public final Function0<Unit> onConnectionClosed;

    @NotNull
    public final PlatformTextInputMethodRequest request;

    public InputMethodSession(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest, @NotNull Function0<Unit> function0) {
        this.request = platformTextInputMethodRequest;
        this.onConnectionClosed = function0;
    }

    public final boolean isActive() {
        return !this.disposed;
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        synchronized (this.lock) {
            try {
                if (this.disposed) {
                    return null;
                }
                NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
                if (nullableInputConnectionWrapper != null) {
                    nullableInputConnectionWrapper.disposeDelegate();
                }
                NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(outAttrs), this.onConnectionClosed);
                this.connection = NullableInputConnectionWrapper;
                return NullableInputConnectionWrapper;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
                if (nullableInputConnectionWrapper != null) {
                    nullableInputConnectionWrapper.disposeDelegate();
                }
                this.connection = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
