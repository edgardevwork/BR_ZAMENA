package androidx.compose.p003ui.platform;

import androidx.annotation.RestrictTo;
import androidx.compose.p003ui.InternalComposeUiApi;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0007\u001a\u00020\b*\u00020\t2'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0002\u0010\u0010\"$\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m7105d2 = {"LocalPlatformTextInputMethodOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;", "getLocalPlatformTextInputMethodOverride$annotations", "()V", "getLocalPlatformTextInputMethodOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "establishTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes3.dex */
public final class PlatformTextInputModifierNodeKt {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> LocalPlatformTextInputMethodOverride = CompositionLocalKt.staticCompositionLocalOf(new Function0<PlatformTextInputSessionHandler>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final PlatformTextInputSessionHandler invoke() {
            return null;
        }
    });

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", m7120f = "PlatformTextInputModifierNode.kt", m7121i = {}, m7122l = {101}, m7123m = "establishTextInputSession", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 */
    public static final class C19911 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C19911(Continuation<? super C19911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
        }
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getLocalPlatformTextInputMethodOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object establishTextInputSession(@NotNull PlatformTextInputModifierNode platformTextInputModifierNode, @NotNull Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> function2, @NotNull Continuation<?> continuation) throws Throwable {
        C19911 c19911;
        if (continuation instanceof C19911) {
            c19911 = (C19911) continuation;
            int i = c19911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19911.label = i - Integer.MIN_VALUE;
            } else {
                c19911 = new C19911(continuation);
            }
        }
        Object obj = c19911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!platformTextInputModifierNode.getNode().getIsAttached()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node".toString());
            }
            PlatformTextInputSessionHandler platformTextInputSessionHandlerRequireOwner = (PlatformTextInputSessionHandler) DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode).getCompositionLocalMap().get(LocalPlatformTextInputMethodOverride);
            if (platformTextInputSessionHandlerRequireOwner == null) {
                platformTextInputSessionHandlerRequireOwner = DelegatableNodeKt.requireOwner(platformTextInputModifierNode);
            }
            c19911.label = 1;
            if (platformTextInputSessionHandlerRequireOwner.textInputSession(function2, c19911) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> getLocalPlatformTextInputMethodOverride() {
        return LocalPlatformTextInputMethodOverride;
    }
}
