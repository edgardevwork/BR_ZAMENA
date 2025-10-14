package com.blackhub.bronline.game.gui.inventory;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.InventoryDialogApplyDeletItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvDialogDelete.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InvDialogDelete {
    public static final int $stable = 8;

    @Nullable
    public InventoryDialogApplyDeletItemBinding bindingDialogDelete;

    @Nullable
    public PopupWindow dialogDeletePopupWindow;

    @NotNull
    public final UILayoutUsersInventory root;

    public InvDialogDelete(@NotNull UILayoutUsersInventory root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Object systemService = JNIActivity.getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        InventoryDialogApplyDeletItemBinding inventoryDialogApplyDeletItemBindingInflate = InventoryDialogApplyDeletItemBinding.inflate((LayoutInflater) systemService);
        this.bindingDialogDelete = inventoryDialogApplyDeletItemBindingInflate;
        if (inventoryDialogApplyDeletItemBindingInflate != null) {
            this.dialogDeletePopupWindow = new PopupWindow((View) inventoryDialogApplyDeletItemBindingInflate.getRoot(), -1, -1, true);
        }
        setLogicForDialog();
    }

    public final void showDialogDelete() {
        PopupWindow popupWindow = this.dialogDeletePopupWindow;
        if (popupWindow != null) {
            popupWindow.showAtLocation(JNIActivity.getContext().getParentLayout(), 17, 0, 0);
        }
    }

    public final void setLogicForDialog() {
        InventoryDialogApplyDeletItemBinding inventoryDialogApplyDeletItemBinding = this.bindingDialogDelete;
        if (inventoryDialogApplyDeletItemBinding != null) {
            inventoryDialogApplyDeletItemBinding.dialogValueApplyButtonApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.InvDialogDelete$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvDialogDelete.setLogicForDialog$lambda$4$lambda$1(this.f$0, view);
                }
            });
            inventoryDialogApplyDeletItemBinding.dialogValueApplyButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.InvDialogDelete$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvDialogDelete.setLogicForDialog$lambda$4$lambda$2(this.f$0, view);
                }
            });
            inventoryDialogApplyDeletItemBinding.dialogValueApplyButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.InvDialogDelete$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InvDialogDelete.setLogicForDialog$lambda$4$lambda$3(this.f$0, view);
                }
            });
        }
    }

    public static final void setLogicForDialog$lambda$4$lambda$1(InvDialogDelete this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.root.deleteThisItem();
        this$0.closeDialogDelete();
    }

    public static final void setLogicForDialog$lambda$4$lambda$2(InvDialogDelete this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeDialogDelete();
    }

    public static final void setLogicForDialog$lambda$4$lambda$3(InvDialogDelete this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeDialogDelete();
    }

    public final void closeDialogDelete() {
        PopupWindow popupWindow = this.dialogDeletePopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}

