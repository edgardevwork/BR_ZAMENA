package com.blackhub.bronline.game.gui.familysystem;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesNotificationLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyNotificationAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyNotificationData;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIFamilyNotification.kt */
@StabilityInferred(parameters = 0)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes3.dex */
public final class UIFamilyNotification extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;
    public FamiliesNotificationLayoutBinding binding;

    @Nullable
    public Function1<? super FamilyNotificationData, Unit> clickNotification;

    @NotNull
    public final List<FamilyNotificationData> familyNotifications;

    @Nullable
    public final LogicForDialogApply logicForDialogApply;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    @Nullable
    public FamilyNotificationAdapter notificationAdapter;
    public long oldTimer;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIFamilyNotification(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON, @Nullable LogicForDialogApply logicForDialogApply) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
        this.logicForDialogApply = logicForDialogApply;
        this.familyNotifications = new ArrayList();
    }

    public final void setStartData(@NotNull List<FamilyNotificationData> notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        List<FamilyNotificationData> list = this.familyNotifications;
        list.clear();
        list.addAll(notifications);
        FamilyNotificationAdapter familyNotificationAdapter = this.notificationAdapter;
        if (familyNotificationAdapter != null) {
            familyNotificationAdapter.notifyDataSetChanged();
        }
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding = this.binding;
        if (familiesNotificationLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesNotificationLayoutBinding = null;
        }
        if (this.mainRoot.getIfLeader() == 1) {
            familiesNotificationLayoutBinding.addNewNotification.setVisibility(0);
            familiesNotificationLayoutBinding.editTextNotification.setVisibility(0);
        } else {
            familiesNotificationLayoutBinding.addNewNotification.setVisibility(4);
            familiesNotificationLayoutBinding.editTextNotification.setVisibility(4);
        }
    }

    public final void addNewNotification(@NotNull FamilyNotificationData newNotification) {
        Intrinsics.checkNotNullParameter(newNotification, "newNotification");
        this.familyNotifications.add(0, newNotification);
        if (this.familyNotifications.size() > 5) {
            this.familyNotifications.remove(5);
        }
        FamilyNotificationAdapter familyNotificationAdapter = this.notificationAdapter;
        if (familyNotificationAdapter != null) {
            familyNotificationAdapter.notifyDataSetChanged();
        }
    }

    public final void addOldNotification(@NotNull FamilyNotificationData newNotification) {
        Intrinsics.checkNotNullParameter(newNotification, "newNotification");
        this.familyNotifications.add(newNotification);
        FamilyNotificationAdapter familyNotificationAdapter = this.notificationAdapter;
        if (familyNotificationAdapter != null) {
            familyNotificationAdapter.notifyDataSetChanged();
        }
    }

    public final void removeNotification(int oldId) {
        if (this.familyNotifications.size() > 0) {
            int size = this.familyNotifications.size();
            for (int i = 0; i < size; i++) {
                if (this.familyNotifications.get(i).getNotificationsId() == oldId) {
                    this.familyNotifications.remove(i);
                    FamilyNotificationAdapter familyNotificationAdapter = this.notificationAdapter;
                    if (familyNotificationAdapter != null) {
                        familyNotificationAdapter.notifyItemRemoved(i);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding = this.binding;
        if (familiesNotificationLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesNotificationLayoutBinding = null;
        }
        ConstraintLayout root = familiesNotificationLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBindingInflate = FamiliesNotificationLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesNotificationLayoutBindingInflate, "inflate(...)");
        this.binding = familiesNotificationLayoutBindingInflate;
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding = null;
        if (familiesNotificationLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesNotificationLayoutBindingInflate = null;
        }
        final Animation animationLoadAnimation = AnimationUtils.loadAnimation(familiesNotificationLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        setLogicForClickNotification();
        setDataInView();
        final FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding2 = this.binding;
        if (familiesNotificationLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesNotificationLayoutBinding2 = null;
        }
        familiesNotificationLayoutBinding2.addNewNotification.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyNotification$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIFamilyNotification.onCreateView$lambda$3$lambda$2(this.f$0, familiesNotificationLayoutBinding2, animationLoadAnimation, view);
            }
        });
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding3 = this.binding;
        if (familiesNotificationLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesNotificationLayoutBinding = familiesNotificationLayoutBinding3;
        }
        ConstraintLayout root = familiesNotificationLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onCreateView$lambda$3$lambda$2(UIFamilyNotification this$0, FamiliesNotificationLayoutBinding this_apply, Animation animation, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding = null;
        if (System.currentTimeMillis() - this$0.oldTimer > 300) {
            this$0.oldTimer = System.currentTimeMillis();
            Editable text = this_apply.editTextNotification.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() > 0) {
                view.startAnimation(animation);
                ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
                if (actionsWithJSON != null) {
                    actionsWithJSON.sendMessageForServer(this_apply.editTextNotification.getText().toString());
                }
                this_apply.editTextNotification.getText().clear();
                Object systemService = this$0.getContext().getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding2 = this$0.binding;
                if (familiesNotificationLayoutBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    familiesNotificationLayoutBinding2 = null;
                }
                inputMethodManager.hideSoftInputFromWindow(familiesNotificationLayoutBinding2.getRoot().getWindowToken(), 0);
                this_apply.editTextNotification.setFocusable(false);
                this_apply.editTextNotification.setFocusableInTouchMode(true);
            } else {
                Intrinsics.checkNotNullExpressionValue(this_apply.editTextNotification.getText(), "getText(...)");
                if (!(!StringsKt__StringsJVMKt.isBlank(r0))) {
                    ActionsWithJSON actionsWithJSON2 = this$0.actionsWithJSON;
                    if (actionsWithJSON2 != null) {
                        actionsWithJSON2.sendMessageError("Введите текст в поле для ввода");
                    }
                }
            }
        }
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding3 = this$0.binding;
        if (familiesNotificationLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesNotificationLayoutBinding = familiesNotificationLayoutBinding3;
        }
        UsefulKt.hideSystemUI(familiesNotificationLayoutBinding.getRoot());
    }

    /* compiled from: UIFamilyNotification.kt */
    @Metadata(m7104d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0011\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\t"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIFamilyNotification$setLogicForClickNotification$1", "Lkotlin/Function1;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyNotificationData;", "Lkotlin/ParameterName;", "name", "thisNotification", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickNotification;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIFamilyNotification$setLogicForClickNotification$1 */
    public static final class C40181 implements Function1<FamilyNotificationData, Unit> {
        public C40181() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FamilyNotificationData familyNotificationData) {
            invoke2(familyNotificationData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public void invoke2(@NotNull FamilyNotificationData thisNotification) {
            LogicForDialogApply logicForDialogApply;
            Intrinsics.checkNotNullParameter(thisNotification, "thisNotification");
            if (UIFamilyNotification.this.mainRoot.getIfLeader() != 1 || (logicForDialogApply = UIFamilyNotification.this.logicForDialogApply) == null) {
                return;
            }
            logicForDialogApply.showDialog(null, null, null, thisNotification);
        }
    }

    public final void setLogicForClickNotification() {
        this.clickNotification = new Function1<FamilyNotificationData, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyNotification.setLogicForClickNotification.1
            public C40181() {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FamilyNotificationData familyNotificationData) {
                invoke2(familyNotificationData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public void invoke2(@NotNull FamilyNotificationData thisNotification) {
                LogicForDialogApply logicForDialogApply;
                Intrinsics.checkNotNullParameter(thisNotification, "thisNotification");
                if (UIFamilyNotification.this.mainRoot.getIfLeader() != 1 || (logicForDialogApply = UIFamilyNotification.this.logicForDialogApply) == null) {
                    return;
                }
                logicForDialogApply.showDialog(null, null, null, thisNotification);
            }
        };
    }

    public final void setDataInView() {
        this.notificationAdapter = new FamilyNotificationAdapter(this.familyNotifications, this.mainActivity, this.clickNotification);
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding = this.binding;
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding2 = null;
        if (familiesNotificationLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesNotificationLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesNotificationLayoutBinding.familyNotifications;
        FamiliesNotificationLayoutBinding familiesNotificationLayoutBinding3 = this.binding;
        if (familiesNotificationLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesNotificationLayoutBinding2 = familiesNotificationLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesNotificationLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.notificationAdapter);
    }

    public final void setNullableParameters() {
        this.notificationAdapter = null;
        this.clickNotification = null;
        this.familyNotifications.clear();
    }
}

