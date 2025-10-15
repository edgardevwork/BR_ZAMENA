package com.blackhub.bronline.game.gui.fractions;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.databinding.FractionsBuyTokensLayoutBinding;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIBuyTokensDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIBuyTokensDialog;", "", "context", "Landroid/app/Activity;", "mainViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "(Landroid/app/Activity;Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;)V", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/FractionsBuyTokensLayoutBinding;", "dialogBuyTokens", "Landroid/widget/PopupWindow;", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "closeDialog", "", "removeObservers", "setBCValue", "bcValue", "", "setObservers", "setValuePrice", "sum", "showDialog", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUIBuyTokensDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIBuyTokensDialog.kt\ncom/blackhub/bronline/game/gui/fractions/UIBuyTokensDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,203:1\n58#2,23:204\n93#2,3:227\n*S KotlinDebug\n*F\n+ 1 UIBuyTokensDialog.kt\ncom/blackhub/bronline/game/gui/fractions/UIBuyTokensDialog\n*L\n94#1:204,23\n94#1:227,3\n*E\n"})
/* loaded from: classes.dex */
public final class UIBuyTokensDialog {
    public static final int $stable = 8;

    @NotNull
    public Animation anim;

    @NotNull
    public FractionsBuyTokensLayoutBinding binding;

    @NotNull
    public final Activity context;

    @Nullable
    public PopupWindow dialogBuyTokens;

    @NotNull
    public final FractionsMainViewModel mainViewModel;

    @NotNull
    public final TimeChecker timeChecker;

    public UIBuyTokensDialog(@NotNull Activity context, @NotNull FractionsMainViewModel mainViewModel) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        this.context = context;
        this.mainViewModel = mainViewModel;
        this.timeChecker = new TimeChecker();
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        FractionsBuyTokensLayoutBinding fractionsBuyTokensLayoutBindingInflate = FractionsBuyTokensLayoutBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(fractionsBuyTokensLayoutBindingInflate, "inflate(...)");
        this.binding = fractionsBuyTokensLayoutBindingInflate;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(fractionsBuyTokensLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(...)");
        this.anim = animationLoadAnimation;
        PopupWindow popupWindow = new PopupWindow((View) this.binding.getRoot(), -1, -1, true);
        this.dialogBuyTokens = popupWindow;
        popupWindow.setClippingEnabled(false);
        PopupWindow popupWindow2 = this.dialogBuyTokens;
        if (popupWindow2 != null) {
            popupWindow2.setSoftInputMode(16);
        }
        this.binding.buttonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIBuyTokensDialog._init_$lambda$0(this.f$0, view);
            }
        });
        this.binding.buttonByuTokens.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIBuyTokensDialog._init_$lambda$1(this.f$0, view);
            }
        });
        this.binding.bgEffectShadow.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIBuyTokensDialog._init_$lambda$2(this.f$0, view);
            }
        });
        PopupWindow popupWindow3 = this.dialogBuyTokens;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() throws JSONException {
                    UIBuyTokensDialog._init_$lambda$3(this.f$0);
                }
            });
        }
        CustomEditTextWithBackPressEvent editTextTokens = this.binding.editTextTokens;
        Intrinsics.checkNotNullExpressionValue(editTextTokens, "editTextTokens");
        editTextTokens.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) throws JSONException {
                if (s == null || s.length() == 0) {
                    this.this$0.mainViewModel.sendKeyWithType(7, 1, Const.FRACTION_ADD_TOKENS_TOKEN_AMOUNT, 0);
                    this.this$0.mainViewModel.setAddTokensPrice(0);
                } else {
                    this.this$0.mainViewModel.sendKeyWithType(7, 1, Const.FRACTION_ADD_TOKENS_TOKEN_AMOUNT, Integer.parseInt(s.toString()));
                }
            }
        });
        this.binding.editTextTokens.setOnKeyListener(new View.OnKeyListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return UIBuyTokensDialog._init_$lambda$5(this.f$0, view, i, keyEvent);
            }
        });
        this.binding.editTextTokens.setOnBackPressListener(new CustomEditTextWithBackPressEvent.MyEditTextListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$$ExternalSyntheticLambda5
            @Override // com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent.MyEditTextListener
            public final void callback() {
                UIBuyTokensDialog._init_$lambda$6(this.f$0);
            }
        });
    }

    public static final void _init_$lambda$0(final UIBuyTokensDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$1$1
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
            view.startAnimation(this$0.anim);
        }
    }

    public static final void _init_$lambda$1(final UIBuyTokensDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    this.this$0.mainViewModel.sendButtonPressed(7, 14);
                    this.this$0.binding.editTextTokens.getEditableText().clear();
                }
            });
            view.startAnimation(this$0.anim);
        }
    }

    public static final void _init_$lambda$2(UIBuyTokensDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeDialog();
    }

    public static final void _init_$lambda$3(UIBuyTokensDialog this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.removeObservers();
        PopupWindow popupWindow = this$0.dialogBuyTokens;
        UsefulKt.hideSystemUI(popupWindow != null ? popupWindow.getContentView() : null);
        Useful.INSTANCE.closeAndroidsInterface(this$0.dialogBuyTokens);
        this$0.mainViewModel.sendButtonPressed(7, 21);
        this$0.binding.editTextTokens.getEditableText().clear();
    }

    public static final boolean _init_$lambda$5(UIBuyTokensDialog this$0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 66) {
            return false;
        }
        Object systemService = this$0.context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.binding.getRoot().getWindowToken(), 0);
        view.setFocusable(false);
        view.setFocusableInTouchMode(true);
        PopupWindow popupWindow = this$0.dialogBuyTokens;
        UsefulKt.hideSystemUI(popupWindow != null ? popupWindow.getContentView() : null);
        Useful.INSTANCE.closeAndroidsInterface(this$0.dialogBuyTokens);
        return true;
    }

    public static final void _init_$lambda$6(UIBuyTokensDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.binding.getRoot().getWindowToken(), 0);
        this$0.binding.editTextTokens.setFocusable(false);
        this$0.binding.editTextTokens.setFocusableInTouchMode(true);
    }

    public final void setObservers() {
        LifecycleOwner lifecycleOwner = OtherExtensionKt.lifecycleOwner(this.context);
        if (lifecycleOwner != null) {
            this.mainViewModel.getAddTokensPriceLiveData().observe(lifecycleOwner, new UIBuyTokensDialog$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$setObservers$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    UIBuyTokensDialog uIBuyTokensDialog = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uIBuyTokensDialog.setValuePrice(num.intValue());
                }
            }));
            this.mainViewModel.getAddAddTokensBCValueLiveData().observe(lifecycleOwner, new UIBuyTokensDialog$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIBuyTokensDialog$setObservers$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    UIBuyTokensDialog uIBuyTokensDialog = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uIBuyTokensDialog.setBCValue(num.intValue());
                }
            }));
        }
    }

    public final void removeObservers() {
        LifecycleOwner lifecycleOwner = OtherExtensionKt.lifecycleOwner(this.context);
        if (lifecycleOwner != null) {
            this.mainViewModel.getAddTokensPriceLiveData().removeObservers(lifecycleOwner);
            this.mainViewModel.getAddAddTokensBCValueLiveData().removeObservers(lifecycleOwner);
        }
    }

    public final void showDialog() {
        setObservers();
        PopupWindow popupWindow = this.dialogBuyTokens;
        if (popupWindow != null) {
            popupWindow.showAtLocation(this.binding.getRoot(), 17, 0, 0);
        }
        Useful.INSTANCE.closeAndroidsInterface(this.dialogBuyTokens);
        PopupWindow popupWindow2 = this.dialogBuyTokens;
        UsefulKt.hideSystemUI(popupWindow2 != null ? popupWindow2.getContentView() : null);
    }

    public final void closeDialog() {
        PopupWindow popupWindow = this.dialogBuyTokens;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void setBCValue(int bcValue) {
        try {
            String string = this.context.getString(R.string.fractions_buy_tokens_bc_value, UsefulKt.getPriceWithSpaces(Integer.valueOf(bcValue)));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.context, R.color.yellow)), this.context.getString(R.string.fractions_buy_tokens_bc_value).length() - 5, spannableString.length(), 33);
            this.binding.textViewBcValue.setText(spannableString);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().log("chel tut bldzhad crashit");
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void setValuePrice(int sum) {
        String string = this.context.getString(R.string.fractions_buy_tokens_buy_for, UsefulKt.getPriceWithSpaces(Integer.valueOf(sum)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.context, R.color.yellow)), 14, spannableString.length(), 33);
        this.binding.textViewBuyTokensFor.setText(UtilsKt.transformSpannableToUpperCase(spannableString));
    }
}
