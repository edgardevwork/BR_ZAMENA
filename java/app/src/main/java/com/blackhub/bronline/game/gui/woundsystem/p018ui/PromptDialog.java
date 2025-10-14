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

