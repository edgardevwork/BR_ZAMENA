package com.blackhub.bronline.game.gui.donate.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateServicesItemBinding;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateServiceAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateServiceAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00010B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001c\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\bH\u0002J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!H\u0002J\u000e\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000RJ\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateServiceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateServiceAdapter$ViewHolder;", "serviceItems", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "(Ljava/util/List;)V", "oldSelectedPos", "", "serviceItemClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentObject", "pos", "", "getServiceItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setServiceItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshSelectedItem", "setNewSelect", "newStatus", "", "setTextInView", "currentTextView", "Landroid/widget/TextView;", "currentText", "", "setVisibleBlock", "currentBlock", "isVisible", "updateItemIfSelected", "binding", "Lcom/blackhub/bronline/databinding/DonateServicesItemBinding;", "isSelected", "updateSelectItem", "currentPos", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DonateServiceAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public int oldSelectedPos;
    public Function2<? super DonateItem, ? super Integer, Unit> serviceItemClickListener;

    @NotNull
    public final List<DonateItem> serviceItems;

    @NotNull
    public final TimeChecker timeChecker;

    public DonateServiceAdapter(@NotNull List<DonateItem> serviceItems) {
        Intrinsics.checkNotNullParameter(serviceItems, "serviceItems");
        this.serviceItems = serviceItems;
        this.timeChecker = new TimeChecker();
    }

    @NotNull
    public final Function2<DonateItem, Integer, Unit> getServiceItemClickListener() {
        Function2 function2 = this.serviceItemClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serviceItemClickListener");
        return null;
    }

    public final void setServiceItemClickListener(@NotNull Function2<? super DonateItem, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.serviceItemClickListener = function2;
    }

    /* compiled from: DonateServiceAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateServiceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonateServicesItemBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonateServiceAdapter;Lcom/blackhub/bronline/databinding/DonateServicesItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonateServicesItemBinding binding;
        public final /* synthetic */ DonateServiceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DonateServiceAdapter donateServiceAdapter, DonateServicesItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donateServiceAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final DonateItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final DonateServicesItemBinding donateServicesItemBinding = this.binding;
            final DonateServiceAdapter donateServiceAdapter = this.this$0;
            TextView donateServicesItemButtonLeft = donateServicesItemBinding.donateServicesItemButtonLeft;
            Intrinsics.checkNotNullExpressionValue(donateServicesItemButtonLeft, "donateServicesItemButtonLeft");
            donateServiceAdapter.setTextInView(donateServicesItemButtonLeft, String.valueOf(UtilsKt.buildTypeMerge(item.getHeader(), item.getHeaderStore())));
            TextView donateServicesItemButtonRight = donateServicesItemBinding.donateServicesItemButtonRight;
            Intrinsics.checkNotNullExpressionValue(donateServicesItemButtonRight, "donateServicesItemButtonRight");
            String string = this.binding.getRoot().getContext().getString(R.string.common_string_with_bc, String.valueOf(item.getBasePrice()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            donateServiceAdapter.setTextInView(donateServicesItemButtonRight, string);
            if (item.getSalePercent() != 0) {
                TextView donateServicesItemSales = donateServicesItemBinding.donateServicesItemSales;
                Intrinsics.checkNotNullExpressionValue(donateServicesItemSales, "donateServicesItemSales");
                donateServiceAdapter.setVisibleBlock(donateServicesItemSales, 0);
                TextView donateServicesItemSales2 = donateServicesItemBinding.donateServicesItemSales;
                Intrinsics.checkNotNullExpressionValue(donateServicesItemSales2, "donateServicesItemSales");
                String string2 = this.binding.getRoot().getContext().getString(R.string.donate_tile_badge_percent, Integer.valueOf(item.getSalePercent()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                donateServiceAdapter.setTextInView(donateServicesItemSales2, string2);
            } else {
                TextView donateServicesItemSales3 = donateServicesItemBinding.donateServicesItemSales;
                Intrinsics.checkNotNullExpressionValue(donateServicesItemSales3, "donateServicesItemSales");
                donateServiceAdapter.setVisibleBlock(donateServicesItemSales3, 4);
            }
            donateServiceAdapter.updateItemIfSelected(this.binding, item.isSelected());
            donateServicesItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.adapters.DonateServiceAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DonateServiceAdapter.ViewHolder.bind$lambda$1$lambda$0(donateServiceAdapter, donateServicesItemBinding, item, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(DonateServiceAdapter this$0, DonateServicesItemBinding this_with, DonateItem item, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.timeChecker.ifAccess(500L)) {
                view.startAnimation(AnimationUtils.loadAnimation(this_with.getRoot().getContext(), R.anim.button_click));
                this$0.getServiceItemClickListener().invoke(item, Integer.valueOf(this$1.getBindingAdapterPosition()));
            }
        }
    }

    public final void setVisibleBlock(TextView currentBlock, int isVisible) {
        currentBlock.setVisibility(isVisible);
    }

    public final void setTextInView(TextView currentTextView, String currentText) {
        currentTextView.setText(currentText);
    }

    public final void updateItemIfSelected(DonateServicesItemBinding binding, boolean isSelected) {
        int i;
        int i2;
        if (isSelected) {
            i = R.color.black;
            i2 = R.drawable.bg_rectangle_yellow_hgr_cr8;
        } else {
            i = R.color.white;
            i2 = R.drawable.bg_rectangle_gray_cr8;
        }
        TextView textView = binding.donateServicesItemButtonLeft;
        textView.setTextColor(ResourcesCompat.getColor(textView.getContext().getResources(), i, null));
        textView.setBackground(ResourcesCompat.getDrawable(textView.getContext().getResources(), i2, null));
        TextView textView2 = binding.donateServicesItemButtonRight;
        textView2.setTextColor(ResourcesCompat.getColor(textView2.getContext().getResources(), i, null));
        textView2.setBackground(ResourcesCompat.getDrawable(textView2.getContext().getResources(), i2, null));
    }

    public final void updateSelectItem(int currentPos) {
        int i;
        if (currentPos >= this.serviceItems.size() || this.oldSelectedPos >= this.serviceItems.size() || currentPos == (i = this.oldSelectedPos)) {
            return;
        }
        setNewSelect(i, false);
        setNewSelect(currentPos, true);
        this.oldSelectedPos = currentPos;
    }

    public final void setNewSelect(int position, boolean newStatus) {
        this.serviceItems.get(position).setSelected(newStatus);
        notifyItemChanged(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonateServicesItemBinding donateServicesItemBindingInflate = DonateServicesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donateServicesItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, donateServicesItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.serviceItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.serviceItems.get(position));
    }

    public final void refreshSelectedItem() {
        if (this.oldSelectedPos < this.serviceItems.size()) {
            this.serviceItems.get(this.oldSelectedPos).setSelected(false);
            ((DonateItem) CollectionsKt___CollectionsKt.first((List) this.serviceItems)).setSelected(true);
        }
    }
}
