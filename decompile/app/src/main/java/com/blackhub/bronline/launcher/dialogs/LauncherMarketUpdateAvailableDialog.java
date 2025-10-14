package com.blackhub.bronline.launcher.dialogs;

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

/* compiled from: LauncherMarketUpdateAvailableDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/dialogs/LauncherMarketUpdateAvailableDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/LauncherDialogPrivacyBinding;", "onCancelButtonClickListener", "Lkotlin/Function0;", "", "getOnCancelButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnCancelButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onOkButtonClickListener", "getOnOkButtonClickListener", "setOnOkButtonClickListener", "getContentView", "Landroid/view/View;", "initListeners", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLauncherMarketUpdateAvailableDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherMarketUpdateAvailableDialog.kt\ncom/blackhub/bronline/launcher/dialogs/LauncherMarketUpdateAvailableDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,62:1\n1#2:63\n41#3,2:64\n*S KotlinDebug\n*F\n+ 1 LauncherMarketUpdateAvailableDialog.kt\ncom/blackhub/bronline/launcher/dialogs/LauncherMarketUpdateAvailableDialog\n*L\n32#1:64,2\n*E\n"})
/* loaded from: classes4.dex */
public final class LauncherMarketUpdateAvailableDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogPrivacyBinding binding;
    public Function0<Unit> onCancelButtonClickListener;
    public Function0<Unit> onOkButtonClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LauncherMarketUpdateAvailableDialog(@NotNull Context _context) {
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

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        UtilsKt.crashlyticsLog("LauncherMarketUpdateAvailableDialog initListeners");
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setCancelable(false);
        LauncherDialogPrivacyBinding launcherDialogPrivacyBinding = this.binding;
        launcherDialogPrivacyBinding.textViewPrivacyPolicyTitle.setText(getContext().getText(R.string.dialog_redirect_to_play_market_title));
        launcherDialogPrivacyBinding.textViewPrivacyPolicyLink.setText(getContext().getText(R.string.dialog_redirect_to_play_market_message));
        launcherDialogPrivacyBinding.textViewPrivacyPolicyLink.setBackground(null);
        launcherDialogPrivacyBinding.buttonOk.setText(getContext().getText(R.string.common_update));
        launcherDialogPrivacyBinding.buttonNo.setText(getContext().getText(R.string.common_close));
        launcherDialogPrivacyBinding.buttonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherMarketUpdateAvailableDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherMarketUpdateAvailableDialog.initListeners$lambda$3$lambda$1(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherMarketUpdateAvailableDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherMarketUpdateAvailableDialog.initListeners$lambda$3$lambda$2(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$3$lambda$1(final LauncherMarketUpdateAvailableDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherMarketUpdateAvailableDialog$initListeners$2$1$1
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
    }

    public static final void initListeners$lambda$3$lambda$2(final LauncherMarketUpdateAvailableDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherMarketUpdateAvailableDialog$initListeners$2$2$1
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
            view.startAnimation(this$0.getAnim());
        }
    }
}
