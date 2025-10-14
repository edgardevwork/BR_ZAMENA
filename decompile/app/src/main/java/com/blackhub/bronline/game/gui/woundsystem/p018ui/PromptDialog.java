package com.blackhub.bronline.game.gui.woundsystem.p018ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentStateManager;
import com.blackhub.bronline.databinding.WoundSystemDialogInfoBinding;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PromptDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/woundsystem/ui/PromptDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anim", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "binding", "Lcom/blackhub/bronline/databinding/WoundSystemDialogInfoBinding;", "dialogResultListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "action", "", "getDialogResultListener", "()Lkotlin/jvm/functions/Function1;", "setDialogResultListener", "(Lkotlin/jvm/functions/Function1;)V", "ifPlayersAction", "", "initClickListeners", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "setStyleForDialogsText", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class PromptDialog extends DialogNoNavBar {
    public static final int $stable = 8;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final WoundSystemDialogInfoBinding binding;

    @NotNull
    public final Context context;
    public Function1<? super Integer, Unit> dialogResultListener;
    public boolean ifPlayersAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        WoundSystemDialogInfoBinding woundSystemDialogInfoBindingInflate = WoundSystemDialogInfoBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(woundSystemDialogInfoBindingInflate, "inflate(...)");
        this.binding = woundSystemDialogInfoBindingInflate;
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$anim$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(this.this$0.context, R.anim.button_click);
            }
        });
    }

    private final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @NotNull
    public final Function1<Integer, Unit> getDialogResultListener() {
        Function1 function1 = this.dialogResultListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogResultListener");
        return null;
    }

    public final void setDialogResultListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.dialogResultListener = function1;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.binding.getRoot());
        setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setStyleForDialogsText();
        initClickListeners();
    }

    public final void setStyleForDialogsText() {
        TextView textView = this.binding.textDoctor;
        Useful useful = Useful.INSTANCE;
        String string = this.context.getString(R.string.wound_system_prompt_dialog_title_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
        TextView textView2 = this.binding.textFriends;
        String string2 = this.context.getString(R.string.wound_system_prompt_dialog_title_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        textView2.setText(useful.getTextWithHtmlStyles(string2));
    }

    public final void initClickListeners() {
        this.binding.closeWsDialog.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromptDialog.initClickListeners$lambda$1(this.f$0, view);
            }
        });
        this.binding.textSubinfoDialog.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromptDialog.initClickListeners$lambda$2(this.f$0, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PromptDialog.initClickListeners$lambda$3(this.f$0, dialogInterface);
            }
        });
    }

    public static final void initClickListeners$lambda$1(final PromptDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation anim = this$0.getAnim();
        Intrinsics.checkNotNullExpressionValue(anim, "<get-anim>(...)");
        AnyExtensionKt.setActionOnAnimationEnd(anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$initClickListeners$1$1
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
                this.this$0.ifPlayersAction = true;
                this.this$0.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initClickListeners$lambda$2(final PromptDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation anim = this$0.getAnim();
        Intrinsics.checkNotNullExpressionValue(anim, "<get-anim>(...)");
        AnyExtensionKt.setActionOnAnimationEnd(anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.ui.PromptDialog$initClickListeners$2$1
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
                this.this$0.ifPlayersAction = true;
                this.this$0.getDialogResultListener().invoke(3);
                this.this$0.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    public static final void initClickListeners$lambda$3(PromptDialog this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.ifPlayersAction) {
            this$0.getDialogResultListener().invoke(9);
        }
    }
}
