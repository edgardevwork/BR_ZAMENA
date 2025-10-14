package com.blackhub.bronline.launcher.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.LauncherDialogNotEnoughSpaceBinding;
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

/* compiled from: NotEnoughSpaceDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/dialogs/NotEnoughSpaceDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "needToFree", "", "(Landroid/content/Context;D)V", "binding", "Lcom/blackhub/bronline/databinding/LauncherDialogNotEnoughSpaceBinding;", "getContentView", "Landroid/view/View;", "initListeners", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNotEnoughSpaceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotEnoughSpaceDialog.kt\ncom/blackhub/bronline/launcher/dialogs/NotEnoughSpaceDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,38:1\n1#2:39\n41#3,2:40\n*S KotlinDebug\n*F\n+ 1 NotEnoughSpaceDialog.kt\ncom/blackhub/bronline/launcher/dialogs/NotEnoughSpaceDialog\n*L\n26#1:40,2\n*E\n"})
/* loaded from: classes4.dex */
public final class NotEnoughSpaceDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogNotEnoughSpaceBinding binding;
    public final double needToFree;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotEnoughSpaceDialog(@NotNull Context _context, double d) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        this.needToFree = d;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogNotEnoughSpaceBinding launcherDialogNotEnoughSpaceBindingInflate = LauncherDialogNotEnoughSpaceBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(launcherDialogNotEnoughSpaceBindingInflate, "inflate(...)");
        this.binding = launcherDialogNotEnoughSpaceBindingInflate;
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
        setCancelable(false);
        LauncherDialogNotEnoughSpaceBinding launcherDialogNotEnoughSpaceBinding = this.binding;
        launcherDialogNotEnoughSpaceBinding.textViewNeedToFree.setText(this._context.getString(R.string.launcher_need_to_free, Double.valueOf(this.needToFree)));
        launcherDialogNotEnoughSpaceBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.NotEnoughSpaceDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotEnoughSpaceDialog.initListeners$lambda$2$lambda$1(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$2$lambda$1(final NotEnoughSpaceDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.NotEnoughSpaceDialog$initListeners$2$1$1
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
                    ownerActivity.finish();
                }
            }
        });
        view.startAnimation(this$0.getAnim());
    }
}
