package com.blackhub.bronline.game.gui.notification.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemOldNotificationBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import com.blackhub.bronline.game.gui.notification.utils.NotificationGeneralUseful;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationOldStyleAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0017\u001a\u00020\rH\u0007J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u001c\u0010\u001a\u001a\u00020\r2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006Rt\u0010\u0004\u001a\\\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationOldStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationOldStyleAdapter$ViewHolder;", "()V", "notificationClickListener", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "type", "id", "subId", "pos", "", "getNotificationClickListener", "()Lkotlin/jvm/functions/Function4;", "setNotificationClickListener", "(Lkotlin/jvm/functions/Function4;)V", "notificationList", "", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "addNewNotification", "newNotification", "clearAllNotifications", "closeNotificationById", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItemByPos", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class NotificationOldStyleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> notificationClickListener;

    @NotNull
    public final List<NotificationObj> notificationList = new ArrayList();

    @NotNull
    public final Function4<Integer, Integer, Integer, Integer, Unit> getNotificationClickListener() {
        Function4 function4 = this.notificationClickListener;
        if (function4 != null) {
            return function4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationClickListener");
        return null;
    }

    public final void setNotificationClickListener(@NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(function4, "<set-?>");
        this.notificationClickListener = function4;
    }

    /* compiled from: NotificationOldStyleAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationOldStyleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemOldNotificationBinding;", "(Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationOldStyleAdapter;Lcom/blackhub/bronline/databinding/ItemOldNotificationBinding;)V", "bind", "", "notification", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final ItemOldNotificationBinding binding;
        public final /* synthetic */ NotificationOldStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull NotificationOldStyleAdapter notificationOldStyleAdapter, ItemOldNotificationBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = notificationOldStyleAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final NotificationObj notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            Context context = this.binding.getRoot().getContext();
            final ItemOldNotificationBinding itemOldNotificationBinding = this.binding;
            final NotificationOldStyleAdapter notificationOldStyleAdapter = this.this$0;
            ProgressBar progressBar = itemOldNotificationBinding.pbOldNotificationTimer;
            progressBar.setMax(notification.getDuration() * 1000);
            progressBar.setProgress(progressBar.getMax());
            itemOldNotificationBinding.tvOldNotificationBody.setText(UsefulKt.transformColors(notification.getBodyText()));
            int type = notification.getType();
            if (type == 0) {
                TextView textView = itemOldNotificationBinding.tvOldNotificationRubles;
                textView.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_red_vgr_crl12));
                textView.setText(context.getString(R.string.common_symbol_rubles));
                itemOldNotificationBinding.btOldNotificationApply.setVisibility(8);
            } else if (type == 1) {
                TextView textView2 = itemOldNotificationBinding.tvOldNotificationRubles;
                textView2.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_green_vgr_crl12));
                textView2.setText(context.getString(R.string.common_symbol_rubles));
                itemOldNotificationBinding.btOldNotificationApply.setVisibility(8);
            } else if (type == 2) {
                TextView textView3 = itemOldNotificationBinding.tvOldNotificationRubles;
                textView3.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_red_vgr_crl12));
                textView3.setText(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
                itemOldNotificationBinding.btOldNotificationApply.setVisibility(8);
            } else if (type == 3) {
                TextView textView4 = itemOldNotificationBinding.tvOldNotificationRubles;
                textView4.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_green_vgr_crl12));
                textView4.setText(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
                itemOldNotificationBinding.btOldNotificationApply.setVisibility(8);
            } else if (type == 4) {
                TextView textView5 = itemOldNotificationBinding.tvOldNotificationRubles;
                textView5.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_orange_vgr_crl12));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView5.setText(AnyExtensionKt.empty(stringCompanionObject));
                AppCompatButton appCompatButton = itemOldNotificationBinding.btOldNotificationApply;
                appCompatButton.setVisibility(0);
                appCompatButton.setBackground(ContextCompat.getDrawable(appCompatButton.getContext(), R.drawable.bg_button_red_with_arrow));
                appCompatButton.setText(AnyExtensionKt.empty(stringCompanionObject));
            } else if (type == 5) {
                TextView textView6 = itemOldNotificationBinding.tvOldNotificationRubles;
                textView6.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_rectangle_orange_vgr_crl12));
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                textView6.setText(AnyExtensionKt.empty(stringCompanionObject2));
                AppCompatButton appCompatButton2 = itemOldNotificationBinding.btOldNotificationApply;
                appCompatButton2.setVisibility(0);
                if (Intrinsics.areEqual(notification.getButtonText(), NotificationGeneralUseful.TEXT_DOUBLE_ARROW)) {
                    appCompatButton2.setText(AnyExtensionKt.empty(stringCompanionObject2));
                    appCompatButton2.setBackground(ContextCompat.getDrawable(appCompatButton2.getContext(), R.drawable.bg_button_red_with_arrow));
                } else {
                    appCompatButton2.setText(notification.getButtonText());
                    appCompatButton2.setBackground(ContextCompat.getDrawable(appCompatButton2.getContext(), R.drawable.bg_rectangle_orange_hgr_cr4_1));
                }
            }
            final long progress = itemOldNotificationBinding.pbOldNotificationTimer.getProgress();
            final long j = 25;
            notification.setTimer(new CountDownTimer(j, progress) { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter$ViewHolder$bind$1$10
                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    itemOldNotificationBinding.pbOldNotificationTimer.setProgress((int) millisUntilFinished, false);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    itemOldNotificationBinding.pbOldNotificationTimer.setProgress(0);
                    notificationOldStyleAdapter.getNotificationClickListener().invoke(1, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(this.getBindingAdapterPosition()));
                }
            });
            itemOldNotificationBinding.pbOldNotificationTimer.setVisibility(0);
            CountDownTimer timer = notification.getTimer();
            if (timer != null) {
                timer.start();
            }
            FrameLayout root = itemOldNotificationBinding.getRoot();
            root.setScaleX(1.0f);
            root.setScaleY(1.0f);
            root.setAlpha(1.0f);
            Intrinsics.checkNotNull(root);
            ViewExtensionKt.setMargins$default(root, 0, 0, 0, 0, 7, null);
            root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationOldStyleAdapter.ViewHolder.bind$lambda$12$lambda$10$lambda$9(notificationOldStyleAdapter, notification, this, view);
                }
            });
            itemOldNotificationBinding.btOldNotificationApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationOldStyleAdapter$ViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationOldStyleAdapter.ViewHolder.bind$lambda$12$lambda$11(notificationOldStyleAdapter, notification, this, view);
                }
            });
        }

        public static final void bind$lambda$12$lambda$10$lambda$9(NotificationOldStyleAdapter this$0, NotificationObj notification, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getNotificationClickListener().invoke(1, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public static final void bind$lambda$12$lambda$11(NotificationOldStyleAdapter this$0, NotificationObj notification, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getNotificationClickListener().invoke(0, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(this$1.getBindingAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOldNotificationBinding itemOldNotificationBindingInflate = ItemOldNotificationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemOldNotificationBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemOldNotificationBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.notificationList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.notificationList.get(position));
    }

    public final void addNewNotification(@Nullable NotificationObj newNotification) {
        if (newNotification == null || newNotification.getType() == 6) {
            return;
        }
        this.notificationList.add(0, newNotification);
        notifyItemInserted(0);
    }

    public final void closeNotificationById(int id) {
        Object next;
        int iIndexOf;
        Iterator<T> it = this.notificationList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((NotificationObj) next).getSubId() == id) {
                    break;
                }
            }
        }
        NotificationObj notificationObj = (NotificationObj) next;
        if (notificationObj == null || (iIndexOf = this.notificationList.indexOf(notificationObj)) == -1) {
            return;
        }
        getNotificationClickListener().invoke(2, Integer.valueOf(notificationObj.getNotificationId()), Integer.valueOf(notificationObj.getSubId()), Integer.valueOf(iIndexOf));
    }

    public final void removeItemByPos(int pos) {
        CountDownTimer timer;
        if (pos > -1 && pos < this.notificationList.size()) {
            NotificationObj notificationObj = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(this.notificationList, pos);
            if (notificationObj != null && (timer = notificationObj.getTimer()) != null) {
                timer.cancel();
            }
            this.notificationList.remove(pos);
            notifyItemRemoved(pos);
            return;
        }
        getNotificationClickListener().invoke(999, -1, -1, Integer.valueOf(pos));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clearAllNotifications() {
        for (NotificationObj notificationObj : this.notificationList) {
            CountDownTimer timer = notificationObj.getTimer();
            if (timer != null) {
                timer.cancel();
            }
            notificationObj.setTimer(null);
        }
        this.notificationList.clear();
        notifyDataSetChanged();
    }
}
