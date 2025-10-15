package com.blackhub.bronline.game.gui.legacy;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentStateManager;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrChooseServerErrorAlertDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/legacy/BrChooseServerErrorAlertDialog;", "Landroid/app/Dialog;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME, "Landroid/view/animation/Animation;", "getAnimation", "()Landroid/view/animation/Animation;", "animation$delegate", "Lkotlin/Lazy;", "onCreate", "", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBrChooseServerErrorAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrChooseServerErrorAlertDialog.kt\ncom/blackhub/bronline/game/gui/legacy/BrChooseServerErrorAlertDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: classes2.dex */
public final class BrChooseServerErrorAlertDialog extends Dialog {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy com.bumptech.glide.load.engine.executor.GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME java.lang.String;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrChooseServerErrorAlertDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        this.com.bumptech.glide.load.engine.executor.GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME java.lang.String = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.legacy.BrChooseServerErrorAlertDialog$animation$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.button_click);
            }
        });
    }

    @NotNull
    public final Animation getAnimation() {
        Object value = this.com.bumptech.glide.load.engine.executor.GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME java.lang.String.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setContentView(R.layout.launcher_dialog_not_enough_space);
        setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        UsefulKt.hideSystemUI(window3 != null ? window3.getDecorView() : null);
        ((TextView) findViewById(R.id.text_view_not_enough_space_title)).setText(getContext().getText(R.string.common_error));
        ((TextView) findViewById(R.id.text_view_need_to_free)).setText(getContext().getText(R.string.loading_error_description_new));
        ((Button) findViewById(R.id.button_no)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.legacy.BrChooseServerErrorAlertDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrChooseServerErrorAlertDialog.onCreate$lambda$1(this.f$0, view);
            }
        });
    }

    public static final void onCreate$lambda$1(final BrChooseServerErrorAlertDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnimation(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.legacy.BrChooseServerErrorAlertDialog$onCreate$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.dismiss();
                Activity ownerActivity = this.this$0.getOwnerActivity();
                if (ownerActivity != null) {
                    ownerActivity.finishAffinity();
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        });
        view.startAnimation(this$0.getAnimation());
    }
}
