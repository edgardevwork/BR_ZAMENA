package com.blackhub.bronline.game.gui.notification.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemNewNotificationBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import com.blackhub.bronline.game.gui.notification.utils.NotificationGeneralUseful;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationNewStyleAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0017\u001a\u00020\rH\u0007J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014J\u001c\u0010\u001d\u001a\u00020\r2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0016J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006Rt\u0010\u0004\u001a\\\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter$ViewHolder;", "()V", "notificationClickListener", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "type", "id", "subId", "pos", "", "getNotificationClickListener", "()Lkotlin/jvm/functions/Function4;", "setNotificationClickListener", "(Lkotlin/jvm/functions/Function4;)V", "notificationList", "", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "addNewNotification", "newNotification", "clearAllNotifications", "clearTimer", "notificationPos", "closeNotificationById", "getItemCount", "getNotActiveNotification", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItemByPos", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class NotificationNewStyleAdapter extends RecyclerView.Adapter<ViewHolder> {
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

    /* compiled from: NotificationNewStyleAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemNewNotificationBinding;", "(Lcom/blackhub/bronline/game/gui/notification/adapters/NotificationNewStyleAdapter;Lcom/blackhub/bronline/databinding/ItemNewNotificationBinding;)V", "bind", "", "notification", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final ItemNewNotificationBinding binding;
        public final /* synthetic */ NotificationNewStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull NotificationNewStyleAdapter notificationNewStyleAdapter, ItemNewNotificationBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = notificationNewStyleAdapter;
            this.binding = binding;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void bind(@NotNull final NotificationObj notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            final ItemNewNotificationBinding itemNewNotificationBinding = this.binding;
            final NotificationNewStyleAdapter notificationNewStyleAdapter = this.this$0;
            Context context = itemNewNotificationBinding.getRoot().getContext();
            ProgressBar progressBar = itemNewNotificationBinding.pbNotificationTimer;
            progressBar.setMax(notification.getDuration() * 1000);
            progressBar.setProgress(progressBar.getMax());
            itemNewNotificationBinding.tvNotification.setText(UsefulKt.transformColors(notification.getBodyText()));
            int type = notification.getType();
            if (type == 0) {
                itemNewNotificationBinding.pbNotificationTimer.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.bg_notification_red_progress_bar));
                itemNewNotificationBinding.btNotificationApply.setVisibility(8);
                itemNewNotificationBinding.viewNotificationApplyButton.setVisibility(8);
            } else if (type == 1) {
                itemNewNotificationBinding.pbNotificationTimer.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.bg_notification_green_progress_bar));
                itemNewNotificationBinding.btNotificationApply.setVisibility(8);
                itemNewNotificationBinding.viewNotificationApplyButton.setVisibility(8);
            } else if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        itemNewNotificationBinding.pbNotificationTimer.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.bg_notification_yellow_progress_bar));
                        TextView textView = itemNewNotificationBinding.btNotificationApply;
                        textView.setVisibility(0);
                        textView.setBackground(ContextCompat.getDrawable(textView.getContext(), R.drawable.bg_square_with_double_arrow_red_gradient));
                        textView.setText(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
                        itemNewNotificationBinding.viewNotificationApplyButton.setVisibility(0);
                    } else if (type == 5) {
                        itemNewNotificationBinding.pbNotificationTimer.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.bg_notification_yellow_progress_bar));
                        TextView textView2 = itemNewNotificationBinding.btNotificationApply;
                        textView2.setVisibility(0);
                        if (Intrinsics.areEqual(notification.getButtonText(), NotificationGeneralUseful.TEXT_DOUBLE_ARROW)) {
                            textView2.setText(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
                            textView2.setBackground(ContextCompat.getDrawable(textView2.getContext(), R.drawable.bg_square_with_double_arrow_red_gradient));
                        } else {
                            textView2.setText(notification.getButtonText());
                            textView2.setBackground(ContextCompat.getDrawable(textView2.getContext(), R.drawable.bg_button_red_hgr));
                        }
                        itemNewNotificationBinding.viewNotificationApplyButton.setVisibility(0);
                    }
                }
            }
            if (getBindingAdapterPosition() == CollectionsKt__CollectionsKt.getLastIndex(notificationNewStyleAdapter.notificationList)) {
                final long progress = itemNewNotificationBinding.pbNotificationTimer.getProgress();
                notification.setTimer(new CountDownTimer(progress) { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter$ViewHolder$bind$1$4
                    @Override // android.os.CountDownTimer
                    public void onTick(long millisUntilFinished) {
                        itemNewNotificationBinding.pbNotificationTimer.setProgress((int) millisUntilFinished, false);
                    }

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        itemNewNotificationBinding.pbNotificationTimer.setProgress(0);
                        notificationNewStyleAdapter.getNotificationClickListener().invoke(1, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(notificationNewStyleAdapter.notificationList)));
                        CountDownTimer timer = notification.getTimer();
                        if (timer != null) {
                            timer.cancel();
                        }
                        notification.setTimer(null);
                    }
                });
                itemNewNotificationBinding.pbNotificationTimer.setVisibility(0);
                ConstraintLayout root = itemNewNotificationBinding.getRoot();
                root.setScaleX(1.0f);
                root.setScaleY(1.0f);
                root.setAlpha(1.0f);
                Intrinsics.checkNotNull(root);
                ViewExtensionKt.setMargins$default(root, 0, 0, 0, 0, 7, null);
                root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter$ViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationNewStyleAdapter.ViewHolder.bind$lambda$7$lambda$4$lambda$3(notificationNewStyleAdapter, notification, view);
                    }
                });
                itemNewNotificationBinding.viewNotificationApplyButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.notification.adapters.NotificationNewStyleAdapter$ViewHolder$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationNewStyleAdapter.ViewHolder.bind$lambda$7$lambda$5(notificationNewStyleAdapter, notification, view);
                    }
                });
                CountDownTimer timer = notification.getTimer();
                if (timer != null) {
                    timer.start();
                    return;
                }
                return;
            }
            itemNewNotificationBinding.pbNotificationTimer.setVisibility(4);
            ConstraintLayout root2 = itemNewNotificationBinding.getRoot();
            root2.setScaleX(0.6f);
            root2.setScaleY(0.6f);
            root2.setAlpha(0.6f);
            Intrinsics.checkNotNull(root2);
            ViewExtensionKt.setMargins$default(root2, 0, 0, 0, -50, 7, null);
            root2.setOnClickListener(null);
            itemNewNotificationBinding.viewNotificationApplyButton.setOnClickListener(null);
        }

        public static final void bind$lambda$7$lambda$4$lambda$3(NotificationNewStyleAdapter this$0, NotificationObj notification, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            this$0.getNotificationClickListener().invoke(1, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(this$0.notificationList)));
        }

        public static final void bind$lambda$7$lambda$5(NotificationNewStyleAdapter this$0, NotificationObj notification, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(notification, "$notification");
            this$0.getNotificationClickListener().invoke(0, Integer.valueOf(notification.getNotificationId()), Integer.valueOf(notification.getSubId()), Integer.valueOf(CollectionsKt__CollectionsKt.getLastIndex(this$0.notificationList)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNewNotificationBinding itemNewNotificationBindingInflate = ItemNewNotificationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemNewNotificationBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemNewNotificationBindingInflate);
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

    @Nullable
    public final NotificationObj getNotActiveNotification() {
        if (this.notificationList.size() == 2) {
            return (NotificationObj) CollectionsKt___CollectionsKt.firstOrNull((List) this.notificationList);
        }
        return null;
    }

    public final void closeNotificationById(int id) {
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.notificationList); -1 < lastIndex; lastIndex--) {
            NotificationObj notificationObj = this.notificationList.get(lastIndex);
            if (notificationObj.getSubId() == id) {
                getNotificationClickListener().invoke(2, Integer.valueOf(notificationObj.getNotificationId()), Integer.valueOf(notificationObj.getSubId()), Integer.valueOf(lastIndex));
                return;
            }
        }
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
        } else {
            getNotificationClickListener().invoke(999, -1, -1, Integer.valueOf(pos));
        }
        if (this.notificationList.size() <= 0 || pos == 0) {
            return;
        }
        notifyItemChanged(0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clearAllNotifications() {
        if (this.notificationList.size() == 2) {
            clearTimer(1);
        } else {
            clearTimer(0);
        }
        this.notificationList.clear();
        notifyDataSetChanged();
    }

    public final void clearTimer(int notificationPos) {
        NotificationObj notificationObj = (NotificationObj) CollectionsKt___CollectionsKt.getOrNull(this.notificationList, notificationPos);
        if (notificationObj != null) {
            CountDownTimer timer = notificationObj.getTimer();
            if (timer != null) {
                timer.cancel();
            }
            notificationObj.setTimer(null);
        }
    }
}
