package com.blackhub.bronline.game.gui.gasmangame.p015ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.LauncherDialogPrivacyBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: UIGasmanExitDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanExitDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "get_context", "()Landroid/content/Context;", "binding", "Lcom/blackhub/bronline/databinding/LauncherDialogPrivacyBinding;", "onOkButtonClickListener", "Lkotlin/Function0;", "", "getOnOkButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnOkButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getContentView", "Landroid/view/View;", "initListeners", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUIGasmanExitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanExitDialog.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanExitDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes2.dex */
public final class UIGasmanExitDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogPrivacyBinding binding;
    public Function0<Unit> onOkButtonClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIGasmanExitDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogPrivacyBinding launcherDialogPrivacyBindingInflate = LauncherDialogPrivacyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(launcherDialogPrivacyBindingInflate, "inflate(...)");
        this.binding = launcherDialogPrivacyBindingInflate;
    }

    @NotNull
    public final Context get_context() {
        return this._context;
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

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setCancelable(true);
        LauncherDialogPrivacyBinding launcherDialogPrivacyBinding = this.binding;
        launcherDialogPrivacyBinding.textViewPrivacyPolicyTitle.setText(getContext().getText(R.string.gasman_do_you_want_to_exit));
        launcherDialogPrivacyBinding.textViewPrivacyPolicyLink.setVisibility(8);
        launcherDialogPrivacyBinding.buttonOk.setText(getContext().getString(R.string.common_yes));
        launcherDialogPrivacyBinding.buttonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanExitDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGasmanExitDialog.initListeners$lambda$4$lambda$1(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanExitDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGasmanExitDialog.initListeners$lambda$4$lambda$2(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.bgEffectShadow.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanExitDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGasmanExitDialog.initListeners$lambda$4$lambda$3(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$4$lambda$1(final UIGasmanExitDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanExitDialog$initListeners$2$1$1
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
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$4$lambda$2(final UIGasmanExitDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanExitDialog$initListeners$2$2$1
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
        view.startAnimation(this$0.getAnim());
    }

    public static final void initListeners$lambda$4$lambda$3(UIGasmanExitDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }
}
