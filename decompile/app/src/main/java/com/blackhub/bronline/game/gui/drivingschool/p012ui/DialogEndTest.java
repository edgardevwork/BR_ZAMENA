package com.blackhub.bronline.game.gui.drivingschool.p012ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.databinding.DrivingSchoolEndTestBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DialogEndTest.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/ui/DialogEndTest;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolEndTestBinding;", "resultDialogClickListener", "Lkotlin/Function0;", "", "getResultDialogClickListener", "()Lkotlin/jvm/functions/Function0;", "setResultDialogClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getContentView", "Landroid/view/View;", "initListeners", "showResultDialog", "statusTest", "", "correctAnswers", "allQuestions", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DialogEndTest extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final DrivingSchoolEndTestBinding binding;
    public Function0<Unit> resultDialogClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogEndTest(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DrivingSchoolEndTestBinding drivingSchoolEndTestBindingInflate = DrivingSchoolEndTestBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(drivingSchoolEndTestBindingInflate, "inflate(...)");
        this.binding = drivingSchoolEndTestBindingInflate;
    }

    @NotNull
    public final Function0<Unit> getResultDialogClickListener() {
        Function0<Unit> function0 = this.resultDialogClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resultDialogClickListener");
        return null;
    }

    public final void setResultDialogClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.resultDialogClickListener = function0;
    }

    public final void showResultDialog(int statusTest, int correctAnswers, int allQuestions) {
        DrivingSchoolEndTestBinding drivingSchoolEndTestBinding = this.binding;
        if (statusTest == 0) {
            drivingSchoolEndTestBinding.iconResultFace.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.img_emoji_crying, null));
            drivingSchoolEndTestBinding.titleResultTest.setText(getContext().getText(R.string.driving_school_title_if_not_gud));
            drivingSchoolEndTestBinding.textResultTest.setText(getContext().getText(R.string.driving_school_text_if_not_gud));
            drivingSchoolEndTestBinding.valueResultTest.setText(getContext().getString(R.string.driving_school_value_correct_answers_in_end_test, Integer.valueOf(correctAnswers), Integer.valueOf(allQuestions)));
        } else if (statusTest == 1) {
            drivingSchoolEndTestBinding.iconResultFace.setImageDrawable(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.img_emoji_positive, null));
            drivingSchoolEndTestBinding.titleResultTest.setText(getContext().getText(R.string.common_congratulation));
            drivingSchoolEndTestBinding.textResultTest.setText(getContext().getText(R.string.driving_school_text_if_gud));
            drivingSchoolEndTestBinding.valueResultTest.setText(getContext().getText(R.string.driving_school_text_for_additional_info_if_gud));
        }
        show();
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        this.binding.buttonStartPractice.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.DialogEndTest$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                DialogEndTest.initListeners$lambda$2(this.f$0, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.DialogEndTest$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogEndTest.initListeners$lambda$3(this.f$0, dialogInterface);
            }
        });
    }

    public static final void initListeners$lambda$2(final DialogEndTest this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.setEnabled(false);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this$0.getContext(), R.anim.button_click);
        Intrinsics.checkNotNull(animationLoadAnimation);
        AnyExtensionKt.setActionOnAnimationEnd(animationLoadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.DialogEndTest$initListeners$1$anim$1$1
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
            }
        });
        view.startAnimation(animationLoadAnimation);
    }

    public static final void initListeners$lambda$3(DialogEndTest this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.resultDialogClickListener != null) {
            this$0.getResultDialogClickListener().invoke();
        }
    }
}
