package com.blackhub.bronline.game.common;

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

/* compiled from: TwoButtonsAndTextWithDescriptionDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0012H\u0014J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#J\u000e\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m7105d2 = {"Lcom/blackhub/bronline/game/common/TwoButtonsAndTextWithDescriptionDialog;", "Landroid/app/Dialog;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME, "Landroid/view/animation/Animation;", "getAnimation", "()Landroid/view/animation/Animation;", "animation$delegate", "Lkotlin/Lazy;", "buttonCancel", "Landroid/widget/Button;", "buttonOk", "effectShadowView", "Landroid/view/View;", "onCancelButtonClickListener", "Lkotlin/Function0;", "", "getOnCancelButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnCancelButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onOkButtonClickListener", "getOnOkButtonClickListener", "setOnOkButtonClickListener", "textViewDescription", "Landroid/widget/TextView;", "textViewTitle", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onStop", "setBtnCancelText", "text", "", "setBtnOkText", "setCancelable", "flag", "", "setDescription", "", "setTitle", "setVisibilityOfOKButton", "visibility", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTwoButtonsAndTextWithDescriptionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoButtonsAndTextWithDescriptionDialog.kt\ncom/blackhub/bronline/game/common/TwoButtonsAndTextWithDescriptionDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes.dex */
public final class TwoButtonsAndTextWithDescriptionDialog extends Dialog {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy animation;

    @Nullable
    public Button buttonCancel;

    @Nullable
    public Button buttonOk;

    @Nullable
    public View effectShadowView;
    public Function0<Unit> onCancelButtonClickListener;
    public Function0<Unit> onOkButtonClickListener;

    @Nullable
    public TextView textViewDescription;

    @Nullable
    public TextView textViewTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoButtonsAndTextWithDescriptionDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        this.animation = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$animation$2
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
        Object value = this.animation.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @NotNull
    public final Function0<Unit> getOnOkButtonClickListener() {
        Function0<Unit> function0 = this.onOkButtonClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onOkButtonClickListener");
        return null;
    }

    public final void setOnOkButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onOkButtonClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnCancelButtonClickListener() {
        Function0<Unit> function0 = this.onCancelButtonClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onCancelButtonClickListener");
        return null;
    }

    public final void setOnCancelButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCancelButtonClickListener = function0;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setContentView(R.layout.launcher_dialog_with_two_buttons_title_description);
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
        this.textViewTitle = (TextView) findViewById(R.id.text_view_title);
        this.textViewDescription = (TextView) findViewById(R.id.text_view_description);
        Button button = (Button) findViewById(R.id.button_ok);
        this.buttonOk = button;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TwoButtonsAndTextWithDescriptionDialog.onCreate$lambda$1(this.f$0, view);
                }
            });
        }
        Button button2 = (Button) findViewById(R.id.button_no);
        this.buttonCancel = button2;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TwoButtonsAndTextWithDescriptionDialog.onCreate$lambda$2(this.f$0, view);
                }
            });
        }
        this.effectShadowView = findViewById(R.id.bg_effect_shadow);
    }

    public static final void onCreate$lambda$1(final TwoButtonsAndTextWithDescriptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnimation(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$onCreate$2$1
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
                this.this$0.getOnOkButtonClickListener().invoke();
            }
        });
        view.startAnimation(this$0.getAnimation());
    }

    public static final void onCreate$lambda$2(final TwoButtonsAndTextWithDescriptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnimation(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$onCreate$3$1
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
                this.this$0.getOnCancelButtonClickListener().invoke();
            }
        });
        view.startAnimation(this$0.getAnimation());
    }

    public final void setTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.textViewTitle;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setDescription(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.textViewDescription;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setVisibilityOfOKButton(int visibility) {
        Button button = this.buttonOk;
        if (button == null) {
            return;
        }
        button.setVisibility(visibility);
    }

    public final void setBtnOkText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Button button = this.buttonOk;
        if (button == null) {
            return;
        }
        button.setText(text);
    }

    public final void setBtnCancelText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Button button = this.buttonCancel;
        if (button == null) {
            return;
        }
        button.setText(text);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean flag) {
        View view;
        super.setCancelable(flag);
        if (!flag || (view = this.effectShadowView) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TwoButtonsAndTextWithDescriptionDialog.setCancelable$lambda$3(this.f$0, view2);
            }
        });
    }

    public static final void setCancelable$lambda$3(TwoButtonsAndTextWithDescriptionDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        this.textViewTitle = null;
        this.textViewDescription = null;
        this.buttonCancel = null;
        this.buttonOk = null;
        this.effectShadowView = null;
    }
}
