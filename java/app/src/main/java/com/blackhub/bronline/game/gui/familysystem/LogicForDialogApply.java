package com.blackhub.bronline.game.gui.familysystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.FamiliesApplyWindowBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyNotificationData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemShopObj;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: LogicForDialogApply.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class LogicForDialogApply {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJson;

    @Nullable
    public Animation anim;

    @Nullable
    public FamiliesApplyWindowBinding bindingDialogApply;

    @Nullable
    public PopupWindow dialogApply;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    public LogicForDialogApply(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJson = actionsWithJSON;
        Object systemService = jNIActivity != null ? jNIActivity.getSystemService("layout_inflater") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        FamiliesApplyWindowBinding familiesApplyWindowBindingInflate = FamiliesApplyWindowBinding.inflate((LayoutInflater) systemService);
        this.bindingDialogApply = familiesApplyWindowBindingInflate;
        if (familiesApplyWindowBindingInflate != null) {
            this.anim = AnimationUtils.loadAnimation(familiesApplyWindowBindingInflate.getRoot().getContext(), R.anim.button_click);
            PopupWindow popupWindow = new PopupWindow((View) familiesApplyWindowBindingInflate.getRoot(), -1, -1, true);
            this.dialogApply = popupWindow;
            popupWindow.setClippingEnabled(false);
            PopupWindow popupWindow2 = this.dialogApply;
            UsefulKt.hideSystemUI(popupWindow2 != null ? popupWindow2.getContentView() : null);
            PopupWindow popupWindow3 = this.dialogApply;
            if (popupWindow3 != null) {
                popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogApply$$ExternalSyntheticLambda2
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        LogicForDialogApply.lambda$1$lambda$0(this.f$0);
                    }
                });
            }
        }
    }

    public static final void lambda$1$lambda$0(LogicForDialogApply this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mainRoot.closeAndroidsButtons();
    }

    public final void showDialog(@Nullable final FamilySystemShopObj thisItem, @Nullable final Integer thisPrice, @Nullable final Boolean ifClickLeave, @Nullable final FamilyNotificationData thisNotification) {
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        PopupWindow popupWindow;
        setTextInView(thisItem, thisPrice, ifClickLeave, thisNotification);
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null && (popupWindow = this.dialogApply) != null) {
            popupWindow.showAtLocation(jNIActivity.getParentLayout(), 17, 0, 0);
        }
        FamiliesApplyWindowBinding familiesApplyWindowBinding = this.bindingDialogApply;
        if (familiesApplyWindowBinding != null && (appCompatButton2 = familiesApplyWindowBinding.buttonApply) != null) {
            appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogApply$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogicForDialogApply.showDialog$lambda$3(this.f$0, thisItem, thisPrice, ifClickLeave, thisNotification, view);
                }
            });
        }
        FamiliesApplyWindowBinding familiesApplyWindowBinding2 = this.bindingDialogApply;
        if (familiesApplyWindowBinding2 == null || (appCompatButton = familiesApplyWindowBinding2.buttonCancel) == null) {
            return;
        }
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogApply$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogicForDialogApply.showDialog$lambda$4(this.f$0, view);
            }
        });
    }

    public static final void showDialog$lambda$3(final LogicForDialogApply this$0, final FamilySystemShopObj familySystemShopObj, final Integer num, final Boolean bool, final FamilyNotificationData familyNotificationData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animation = this$0.anim;
        if (animation != null) {
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.LogicForDialogApply$showDialog$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (familySystemShopObj != null) {
                        ActionsWithJSON actionsWithJSON = this$0.actionsWithJson;
                        if (actionsWithJSON != null) {
                            actionsWithJSON.buyItemInShop(familySystemShopObj.getId());
                            return;
                        }
                        return;
                    }
                    if (num != null) {
                        this$0.mainRoot.upgradeFamily();
                        return;
                    }
                    if (bool != null) {
                        ActionsWithJSON actionsWithJSON2 = this$0.actionsWithJson;
                        if (actionsWithJSON2 != null) {
                            actionsWithJSON2.sendPressButton(10);
                            return;
                        }
                        return;
                    }
                    if (familyNotificationData != null) {
                        ActionsWithJSON actionsWithJSON3 = this$0.actionsWithJson;
                        if (actionsWithJSON3 != null) {
                            actionsWithJSON3.sendDeleteNotification(familyNotificationData.getNotificationsId());
                        }
                        this$0.closeDialogApply();
                    }
                }
            });
        }
        view.startAnimation(this$0.anim);
    }

    public static final void showDialog$lambda$4(LogicForDialogApply this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupWindow popupWindow = this$0.dialogApply;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void setTextInView(FamilySystemShopObj thisItem, Integer thisPrice, Boolean ifClickLeave, FamilyNotificationData thisNotification) {
        TextView textView;
        String str;
        String string;
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            if (thisItem != null) {
                if (thisItem.getType() == 0) {
                    str = "семейных монет";
                } else {
                    str = "семейных жетонов";
                }
                FamiliesApplyWindowBinding familiesApplyWindowBinding = this.bindingDialogApply;
                if (familiesApplyWindowBinding != null) {
                    TextView textView2 = familiesApplyWindowBinding.dialogApplyBodyItem;
                    int typeId = thisItem.getTypeId();
                    if (typeId == 3) {
                        string = jNIActivity.getString(R.string.families_open_box, UsefulKt.getPriceWithSpaces(Integer.valueOf(thisItem.getPrice())), str);
                    } else if (typeId == 4) {
                        string = jNIActivity.getString(R.string.families_apply_buy_syndicate, UsefulKt.getPriceWithSpaces(Integer.valueOf(thisItem.getPrice())));
                    } else {
                        string = jNIActivity.getString(R.string.families_buy_item_in_shop, UsefulKt.getPriceWithSpaces(Integer.valueOf(thisItem.getPrice())), str);
                    }
                    textView2.setText(string);
                    return;
                }
                return;
            }
            if (thisPrice != null) {
                FamiliesApplyWindowBinding familiesApplyWindowBinding2 = this.bindingDialogApply;
                textView = familiesApplyWindowBinding2 != null ? familiesApplyWindowBinding2.dialogApplyBodyItem : null;
                if (textView == null) {
                    return;
                }
                textView.setText(jNIActivity.getString(R.string.families_apply_update, UsefulKt.getPriceWithSpaces(thisPrice)));
                return;
            }
            if (ifClickLeave != null) {
                FamiliesApplyWindowBinding familiesApplyWindowBinding3 = this.bindingDialogApply;
                textView = familiesApplyWindowBinding3 != null ? familiesApplyWindowBinding3.dialogApplyBodyItem : null;
                if (textView == null) {
                    return;
                }
                textView.setText(jNIActivity.getText(R.string.families_apply_leave));
                return;
            }
            if (thisNotification != null) {
                FamiliesApplyWindowBinding familiesApplyWindowBinding4 = this.bindingDialogApply;
                textView = familiesApplyWindowBinding4 != null ? familiesApplyWindowBinding4.dialogApplyBodyItem : null;
                if (textView == null) {
                    return;
                }
                textView.setText(jNIActivity.getText(R.string.families_apply_delete_notification));
            }
        }
    }

    public final void closeDialogApply() {
        PopupWindow popupWindow = this.dialogApply;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void setNullableParameters() {
        closeDialogApply();
        this.dialogApply = null;
        this.bindingDialogApply = null;
        this.anim = null;
    }
}

