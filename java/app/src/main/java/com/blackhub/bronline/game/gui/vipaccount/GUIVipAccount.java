package com.blackhub.bronline.game.gui.vipaccount;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.databinding.VipAccountDialogBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: GUIVipAccount.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class GUIVipAccount implements ISAMPGUI {

    @Nullable
    public Animation anim;
    public VipAccountDialogBinding binding;

    @Nullable
    public GUIManager guiManager;

    @Nullable
    public JNIActivity mainActivity;

    @Nullable
    public PopupWindow popupWindow;
    public int thisEarnings = 1500;
    public int wouldEarning = 3000;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    @NotNull
    public static final GUIVipAccount newInstance() {
        return INSTANCE.newInstance();
    }

    public static final void show$lambda$4() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 41;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    /* compiled from: GUIVipAccount.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/vipaccount/GUIVipAccount$Companion;", "", "()V", "newInstance", "Lcom/blackhub/bronline/game/gui/vipaccount/GUIVipAccount;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final GUIVipAccount newInstance() {
            return new GUIVipAccount();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(@Nullable JSONObject json, @Nullable GUIManager manager, @Nullable JNIActivity activity) {
        this.mainActivity = activity;
        this.guiManager = manager;
        if (this.popupWindow == null) {
            VipAccountDialogBinding vipAccountDialogBinding = null;
            Object systemService = activity != null ? activity.getSystemService("layout_inflater") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            VipAccountDialogBinding vipAccountDialogBindingInflate = VipAccountDialogBinding.inflate((LayoutInflater) systemService);
            Intrinsics.checkNotNullExpressionValue(vipAccountDialogBindingInflate, "inflate(...)");
            this.binding = vipAccountDialogBindingInflate;
            if (vipAccountDialogBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vipAccountDialogBindingInflate = null;
            }
            this.anim = AnimationUtils.loadAnimation(vipAccountDialogBindingInflate.getRoot().getContext(), R.anim.button_click);
            VipAccountDialogBinding vipAccountDialogBinding2 = this.binding;
            if (vipAccountDialogBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vipAccountDialogBinding2 = null;
            }
            PopupWindow popupWindow = new PopupWindow((View) vipAccountDialogBinding2.getRoot(), -1, -1, true);
            this.popupWindow = popupWindow;
            popupWindow.setClippingEnabled(false);
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 != null) {
                popupWindow2.showAtLocation(activity.getParentLayout(), 17, 0, 0);
            }
            Useful.INSTANCE.closeAndroidsInterface(this.popupWindow);
            VipAccountDialogBinding vipAccountDialogBinding3 = this.binding;
            if (vipAccountDialogBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vipAccountDialogBinding3 = null;
            }
            vipAccountDialogBinding3.buttonByuVip.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GUIVipAccount.show$lambda$1(this.f$0, view);
                }
            });
            VipAccountDialogBinding vipAccountDialogBinding4 = this.binding;
            if (vipAccountDialogBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vipAccountDialogBinding = vipAccountDialogBinding4;
            }
            vipAccountDialogBinding.closeVipAccountDialog.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GUIVipAccount.show$lambda$3(this.f$0, view);
                }
            });
        }
        setStyleForText();
        setParameters(this.thisEarnings, this.wouldEarning);
        PopupWindow popupWindow3 = this.popupWindow;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount$$ExternalSyntheticLambda3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    GUIVipAccount.show$lambda$4();
                }
            });
        }
    }

    public static final void show$lambda$1(final GUIVipAccount this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.anim);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GUIVipAccount.show$lambda$1$lambda$0(this.f$0);
            }
        }, 250L);
    }

    public static final void show$lambda$1$lambda$0(GUIVipAccount this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void show$lambda$3(final GUIVipAccount this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.anim);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                GUIVipAccount.show$lambda$3$lambda$2(this.f$0);
            }
        }, 250L);
    }

    public static final void show$lambda$3$lambda$2(GUIVipAccount this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void getEarnings(JSONObject json) {
        if (json != null) {
            this.thisEarnings = json.optInt("te");
            this.wouldEarning = json.optInt("we");
        }
    }

    public final void setParameters(int thisEarnings, int wouldEarnings) {
        String priceWithSpaces = UsefulKt.getPriceWithSpaces(Integer.valueOf(thisEarnings));
        String priceWithSpaces2 = UsefulKt.getPriceWithSpaces(Integer.valueOf(wouldEarnings));
        VipAccountDialogBinding vipAccountDialogBinding = this.binding;
        if (vipAccountDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vipAccountDialogBinding = null;
        }
        vipAccountDialogBinding.moneyValue.setText(priceWithSpaces);
        vipAccountDialogBinding.moneyValueWould.setText(priceWithSpaces2);
    }

    private final void setStyleForText() {
        SpannableString spannableString = new SpannableString("А могли заработать больше!");
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(jNIActivity, R.color.light_green)), 19, 25, 33);
        }
        VipAccountDialogBinding vipAccountDialogBinding = this.binding;
        if (vipAccountDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vipAccountDialogBinding = null;
        }
        vipAccountDialogBinding.wouldEarnTitle.setText(spannableString);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(@Nullable JSONObject json) {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow == null) {
            return false;
        }
        Intrinsics.checkNotNull(popupWindow);
        return popupWindow.isShowing();
    }
}

