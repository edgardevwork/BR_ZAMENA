package com.blackhub.bronline.game.gui.inventory;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.InventoryDialogValueApplyBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewDialogForMigrateItems.kt */
@StabilityInferred(parameters = 0)

public final class NewDialogForMigrateItems {
    public static final int $stable = 8;

    @Nullable
    public final Function3<Integer, Integer, Integer, Unit> actionListenerFromDialogApply;

    @NotNull
    public final InventoryDialogValueApplyBinding binding;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @NotNull
    public final PopupWindow popupWindow;

    /* JADX WARN: Multi-variable type inference failed */
    public NewDialogForMigrateItems(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.actionListenerFromDialogApply = function3;
        this.itemRender = itemRender;
        Object systemService = JNIActivity.getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        InventoryDialogValueApplyBinding inventoryDialogValueApplyBindingInflate = InventoryDialogValueApplyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(inventoryDialogValueApplyBindingInflate, "inflate(...)");
        this.binding = inventoryDialogValueApplyBindingInflate;
        this.popupWindow = new PopupWindow((View) inventoryDialogValueApplyBindingInflate.getRoot(), -1, -1, true);
    }

    public final void showDialogForMigrateItem(@Nullable InvItems item, int action) {
        setItemView(item);
        initSeekBar();
        getActionsFromDialog(action);
        this.popupWindow.showAtLocation(JNIActivity.getContext().getParentLayout(), 17, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItemView(InvItems item) {
        Bitmap bitmap;
        InventoryDialogValueApplyBinding inventoryDialogValueApplyBinding = this.binding;
        inventoryDialogValueApplyBinding.dialogValueApplyMinValue.setText("1");
        inventoryDialogValueApplyBinding.dialogValueApplyMaxValue.setText(String.valueOf(item != null ? Integer.valueOf(item.getItemsValue()) : null));
        inventoryDialogValueApplyBinding.dialogValueApplyTitleItem.setText((CharSequence) UtilsKt.buildTypeMerge(item != null ? item.get_name() : null, item != null ? item.get_nameStore() : null));
        if (item != null) {
            inventoryDialogValueApplyBinding.dialogValueApplySeekbarWithValue.setMax(item.getItemsValue() - 1);
            int i = item.getId() == 134 ? 2 : 0;
            int i2 = item.getId() != 134 ? 3 : 1;
            if (item.getImageName() != null) {
                Context context = inventoryDialogValueApplyBinding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String imageName = item.getImageName();
                if (imageName == null) {
                    imageName = "";
                }
                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, imageName, ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                inventoryDialogValueApplyBinding.dialogValueApplyItemsIcon.setScaleX(1.0f);
                inventoryDialogValueApplyBinding.dialogValueApplyItemsIcon.setImageBitmap(bitmapFromZip$default);
                return;
            }
            int id = item.getId();
            if (id != 59) {
                switch (id) {
                    case 81:
                    case 82:
                    case 83:
                        bitmap = this.itemRender.get(item.getTextIfException());
                        break;
                    default:
                        bitmap = this.itemRender.get(String.valueOf(item.getModelid()));
                        break;
                }
            }
            inventoryDialogValueApplyBinding.dialogValueApplyItemsIcon.setScaleX(-1.0f);
            if (bitmap == null) {
                Useful useful = Useful.INSTANCE;
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(item.getId());
                Integer numValueOf3 = Integer.valueOf(item.getModelid());
                Integer numValueOf4 = Integer.valueOf(i2);
                ImageView dialogValueApplyItemsIcon = inventoryDialogValueApplyBinding.dialogValueApplyItemsIcon;
                Intrinsics.checkNotNullExpressionValue(dialogValueApplyItemsIcon, "dialogValueApplyItemsIcon");
                useful.renderItem(numValueOf, numValueOf2, numValueOf3, numValueOf4, dialogValueApplyItemsIcon, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), this.itemRender);
                return;
            }
            inventoryDialogValueApplyBinding.dialogValueApplyItemsIcon.setImageBitmap(bitmap);
        }
    }

    public final void initSeekBar() {
        this.binding.dialogValueApplySeekbarWithValue.setProgress(0);
        this.binding.dialogValueApplySeekbarWithValue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems.initSeekBar.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar p0) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar p0, int p1, boolean p2) {
                NewDialogForMigrateItems.this.binding.dialogValueApplyMinValue.setText(String.valueOf(p1 + 1));
            }
        });
    }

    public final void getActionsFromDialog(final int action) {
        final InventoryDialogValueApplyBinding inventoryDialogValueApplyBinding = this.binding;
        inventoryDialogValueApplyBinding.dialogValueApplyButtonApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDialogForMigrateItems.getActionsFromDialog$lambda$5$lambda$3(inventoryDialogValueApplyBinding, this, action, view);
            }
        });
        inventoryDialogValueApplyBinding.dialogValueApplyButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.NewDialogForMigrateItems$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDialogForMigrateItems.getActionsFromDialog$lambda$5$lambda$4(inventoryDialogValueApplyBinding, this, action, view);
            }
        });
    }

    public static final void getActionsFromDialog$lambda$5$lambda$3(InventoryDialogValueApplyBinding _binding, NewDialogForMigrateItems this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int progress = _binding.dialogValueApplySeekbarWithValue.getProgress() + 1;
        Function3<Integer, Integer, Integer, Unit> function3 = this$0.actionListenerFromDialogApply;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(progress), Integer.valueOf(i), 11);
        }
    }

    public static final void getActionsFromDialog$lambda$5$lambda$4(InventoryDialogValueApplyBinding _binding, NewDialogForMigrateItems this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(_binding, "$_binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int progress = _binding.dialogValueApplySeekbarWithValue.getProgress() + 1;
        Function3<Integer, Integer, Integer, Unit> function3 = this$0.actionListenerFromDialogApply;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(progress), Integer.valueOf(i), 10);
        }
    }

    public final void closeDialogForMigrate() {
        this.popupWindow.dismiss();
    }
}

