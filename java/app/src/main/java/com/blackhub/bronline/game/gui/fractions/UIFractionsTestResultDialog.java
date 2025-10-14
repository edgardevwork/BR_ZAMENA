package com.blackhub.bronline.game.gui.fractions;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.databinding.FractionsTestingResultLayoutBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingResult;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIFractionsTestResultDialog.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class UIFractionsTestResultDialog {
    public static final int $stable = 8;

    @NotNull
    public FractionsTestingResultLayoutBinding binding;
    public boolean blockedSpam;

    @Nullable
    public PopupWindow dialogTestResult;

    @NotNull
    public final FractionsDocumentsViewModel documentsViewModel;

    public UIFractionsTestResultDialog(@NotNull Context context, @NotNull FractionsDocumentsViewModel documentsViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentsViewModel, "documentsViewModel");
        this.documentsViewModel = documentsViewModel;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        FractionsTestingResultLayoutBinding fractionsTestingResultLayoutBindingInflate = FractionsTestingResultLayoutBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(fractionsTestingResultLayoutBindingInflate, "inflate(...)");
        this.binding = fractionsTestingResultLayoutBindingInflate;
        PopupWindow popupWindow = new PopupWindow((View) this.binding.getRoot(), -1, -1, false);
        this.dialogTestResult = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.binding.buttonNext.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestResultDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                UIFractionsTestResultDialog._init_$lambda$1(this.f$0, view);
            }
        });
        PopupWindow popupWindow2 = this.dialogTestResult;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestResultDialog$$ExternalSyntheticLambda1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() throws JSONException {
                    UIFractionsTestResultDialog._init_$lambda$2(this.f$0);
                }
            });
        }
    }

    public static final void _init_$lambda$1(final UIFractionsTestResultDialog this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this$0.binding.getRoot().getContext(), R.anim.button_click);
        Intrinsics.checkNotNull(animationLoadAnimation);
        AnyExtensionKt.setActionOnAnimationEnd(animationLoadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestResultDialog$1$anim$1$1
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
                this.this$0.closeDialog();
            }
        });
        view.startAnimation(animationLoadAnimation);
    }

    public static final void _init_$lambda$2(UIFractionsTestResultDialog this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.documentsViewModel.sendButtonPressed(6, 12);
        this$0.documentsViewModel.setTestingResult(null);
        this$0.unsubscribeFromViewModel();
    }

    public final void setViewModelObservers() {
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LifecycleOwner lifecycleOwner = OtherExtensionKt.lifecycleOwner(context);
        if (lifecycleOwner != null) {
            this.documentsViewModel.getTestingResultLiveData().observe(lifecycleOwner, new UIFractionsTestResultDialog$sam$androidx_lifecycle_Observer$0(new Function1<FractionsTestingResult, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestResultDialog$setViewModelObservers$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FractionsTestingResult fractionsTestingResult) {
                    invoke2(fractionsTestingResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable FractionsTestingResult fractionsTestingResult) {
                    if (fractionsTestingResult != null) {
                        this.this$0.setData(fractionsTestingResult);
                    }
                }
            }));
        }
    }

    public final void unsubscribeFromViewModel() {
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LifecycleOwner lifecycleOwner = OtherExtensionKt.lifecycleOwner(context);
        if (lifecycleOwner != null) {
            this.documentsViewModel.getTestingResultLiveData().removeObservers(lifecycleOwner);
        }
    }

    public final void closeDialog() {
        PopupWindow popupWindow = this.dialogTestResult;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void showDialog() {
        setViewModelObservers();
        PopupWindow popupWindow = this.dialogTestResult;
        if (popupWindow != null) {
            popupWindow.showAtLocation(this.binding.getRoot(), 17, 0, 0);
        }
        Useful.INSTANCE.closeAndroidsInterface(this.dialogTestResult);
    }

    public final void setData(FractionsTestingResult testResult) {
        if (testResult.getTestingResult() == 1) {
            setupPositiveResult(testResult);
        } else {
            setupSetupNegativeResult(testResult);
        }
    }

    public final void setupPositiveResult(FractionsTestingResult testResult) {
        FractionsTestingResultLayoutBinding fractionsTestingResultLayoutBinding = this.binding;
        fractionsTestingResultLayoutBinding.imageViewSun.setImageResource(R.drawable.img_emoji_positive);
        fractionsTestingResultLayoutBinding.textViewTitleOfResult.setText(R.string.common_congratulation);
        fractionsTestingResultLayoutBinding.textViewDescriptionOfResult.setText(fractionsTestingResultLayoutBinding.getRoot().getContext().getString(R.string.fractions_testing_you_passed_test));
        fractionsTestingResultLayoutBinding.textViewCorrectAnswers.setText(fractionsTestingResultLayoutBinding.getRoot().getContext().getString(R.string.fractions_testing_correct_answers, Integer.valueOf(testResult.getTestingTotal()), Integer.valueOf(testResult.getQuantityOfQuestions())));
    }

    public final void setupSetupNegativeResult(FractionsTestingResult testResult) {
        FractionsTestingResultLayoutBinding fractionsTestingResultLayoutBinding = this.binding;
        fractionsTestingResultLayoutBinding.imageViewSun.setImageResource(R.drawable.img_emoji_crying);
        fractionsTestingResultLayoutBinding.textViewTitleOfResult.setText(R.string.fractions_testing_sorry);
        fractionsTestingResultLayoutBinding.textViewDescriptionOfResult.setText(R.string.fractions_testing_you_did_not_pass_test);
        fractionsTestingResultLayoutBinding.textViewCorrectAnswers.setText(fractionsTestingResultLayoutBinding.getRoot().getContext().getString(R.string.fractions_testing_correct_answers, Integer.valueOf(testResult.getTestingTotal()), Integer.valueOf(testResult.getQuantityOfQuestions())));
    }
}

