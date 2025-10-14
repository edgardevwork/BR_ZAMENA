package com.blackhub.bronline.game.gui.inventory.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryChatItemBinding;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InventoryChatAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class InventoryChatAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public InventoryChatItemBinding binding;

    @NotNull
    public final Context context;

    @NotNull
    public final List<InvMessageObj> messagesList;

    @Nullable
    public final String playersNick;

    public InventoryChatAdapter(@Nullable String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.playersNick = str;
        this.context = context;
        this.messagesList = new ArrayList();
    }

    public final void updateMessage(@NotNull InvMessageObj newMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        this.messagesList.add(newMessage);
        notifyItemInserted(this.messagesList.size() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryChatItemBinding inventoryChatItemBindingInflate = InventoryChatItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryChatItemBindingInflate, "inflate(...)");
        this.binding = inventoryChatItemBindingInflate;
        InventoryChatItemBinding inventoryChatItemBinding = this.binding;
        if (inventoryChatItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inventoryChatItemBinding = null;
        }
        return new ViewHolder(this, inventoryChatItemBinding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.messagesList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.messagesList.size();
    }

    /* compiled from: InventoryChatAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryChatAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryChatItemBinding;", "(Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryChatAdapter;Lcom/blackhub/bronline/databinding/InventoryChatItemBinding;)V", "bind", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final InventoryChatItemBinding binding;
        public final /* synthetic */ InventoryChatAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull InventoryChatAdapter inventoryChatAdapter, InventoryChatItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = inventoryChatAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull InvMessageObj message) {
            SpannableString spannableString;
            Intrinsics.checkNotNullParameter(message, "message");
            int whoseMessage = message.getWhoseMessage();
            if (whoseMessage == 0) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(20);
                layoutParams.addRule(3, this.binding.chatPlayersNick.getId());
                this.binding.chatTextMessage.setLayoutParams(layoutParams);
                this.binding.chatTextMessage.setBackground(ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.bg_rectangle_light_gray_cr4, null));
                this.binding.chatTextMessage.setTextColor(ContextCompat.getColor(this.this$0.context, R.color.black));
                this.binding.chatPlayersNick.setText(this.this$0.playersNick);
                this.binding.chatTextMessage.setVisibility(0);
                this.binding.chatTextMessage.setText(message.getTextMessage());
                this.binding.blockWithActions.setVisibility(8);
                return;
            }
            if (whoseMessage == 1) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(21);
                layoutParams2.addRule(3, this.binding.chatPlayersNick.getId());
                this.binding.chatTextMessage.setLayoutParams(layoutParams2);
                this.binding.chatTextMessage.setBackground(ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.bg_rectangle_orange_hgr_cr4, null));
                this.binding.chatTextMessage.setTextColor(ContextCompat.getColor(this.this$0.context, R.color.white));
                this.binding.chatPlayersNick.setText(this.this$0.context.getText(R.string.common_you));
                this.binding.chatTextMessage.setVisibility(0);
                this.binding.chatTextMessage.setText(message.getTextMessage());
                this.binding.blockWithActions.setVisibility(8);
                return;
            }
            if (whoseMessage != 2) {
                return;
            }
            this.binding.blockWithActions.setVisibility(0);
            this.binding.chatPlayersNick.setText("");
            this.binding.chatTextMessage.setVisibility(8);
            SpannableString spannableString2 = new SpannableString("");
            int action = message.getAction();
            if (action == 1) {
                String string = this.this$0.context.getString(R.string.inv_chat_action_add);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String itemName = message.getItemName();
                String string2 = this.this$0.context.getString(R.string.inv_chat_location_to_exchange);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                spannableString = new SpannableString(this.this$0.playersNick + " " + string + " " + itemName + " " + string2);
                String str = this.this$0.playersNick;
                if (str != null) {
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.orange)), str.length() + 1 + string.length() + 1, str.length() + 1 + string.length() + 1 + itemName.length(), 33);
                }
            } else if (action == 2) {
                String string3 = this.this$0.context.getString(R.string.inv_chat_action_remove);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String itemName2 = message.getItemName();
                String string4 = this.this$0.context.getString(R.string.inv_chat_location_from_exchange);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                spannableString = new SpannableString(this.this$0.playersNick + " " + string3 + " " + itemName2 + " " + string4);
                String str2 = this.this$0.playersNick;
                if (str2 != null) {
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.orange)), str2.length() + 1 + string3.length() + 1, str2.length() + 1 + string3.length() + 1 + itemName2.length(), 33);
                }
            } else {
                if (action == 3) {
                    String string5 = this.this$0.context.getString(R.string.inv_chat_action_add_money, Integer.valueOf(message.getValueOfMoney()));
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    spannableString2 = new SpannableString(this.this$0.playersNick + " " + string5);
                } else if (action == 4) {
                    String string6 = this.this$0.context.getString(R.string.inv_chat_action_change_money, Integer.valueOf(message.getValueOfMoney()));
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    spannableString2 = new SpannableString(this.this$0.playersNick + " " + string6);
                }
                this.binding.finalActionText.setText(spannableString2);
            }
            spannableString2 = spannableString;
            this.binding.finalActionText.setText(spannableString2);
        }
    }
}

