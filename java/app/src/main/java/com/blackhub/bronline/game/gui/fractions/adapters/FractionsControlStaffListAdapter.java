package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsControlStaffListItemBinding;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlStaffListAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlListOfPlayers;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsControlStaffListAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsControlStaffListAdapter extends RecyclerView.Adapter<FractionsControlStaffListViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public List<FractionControlListOfPlayers> list;

    @NotNull
    public final List<Integer> listOfImages;
    public Function2<? super FractionControlListOfPlayers, ? super Integer, Unit> onPlayerItemClickListener;

    @NotNull
    public final List<FractionControlListOfPlayers> getList() {
        return this.list;
    }

    public final void setList(@NotNull List<FractionControlListOfPlayers> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public FractionsControlStaffListAdapter(@NotNull List<FractionControlListOfPlayers> list, @NotNull List<Integer> listOfImages) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listOfImages, "listOfImages");
        this.list = list;
        this.listOfImages = listOfImages;
    }

    @NotNull
    public final Function2<FractionControlListOfPlayers, Integer, Unit> getOnPlayerItemClickListener() {
        Function2 function2 = this.onPlayerItemClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onPlayerItemClickListener");
        return null;
    }

    public final void setOnPlayerItemClickListener(@NotNull Function2<? super FractionControlListOfPlayers, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onPlayerItemClickListener = function2;
    }

    /* compiled from: FractionsControlStaffListAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlStaffListAdapter$FractionsControlStaffListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsControlStaffListItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlStaffListAdapter;Lcom/blackhub/bronline/databinding/FractionsControlStaffListItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionsControlStaffListItemBinding;", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlListOfPlayers;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsControlStaffListViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsControlStaffListItemBinding binding;
        public final /* synthetic */ FractionsControlStaffListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsControlStaffListViewHolder(@NotNull FractionsControlStaffListAdapter fractionsControlStaffListAdapter, FractionsControlStaffListItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsControlStaffListAdapter;
            this.binding = binding;
        }

        @NotNull
        public final FractionsControlStaffListItemBinding getBinding() {
            return this.binding;
        }

        public final void bind(@NotNull final FractionControlListOfPlayers item) {
            Intrinsics.checkNotNullParameter(item, "item");
            FractionsControlStaffListItemBinding fractionsControlStaffListItemBinding = this.binding;
            final FractionsControlStaffListAdapter fractionsControlStaffListAdapter = this.this$0;
            fractionsControlStaffListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlStaffListAdapter$FractionsControlStaffListViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsControlStaffListAdapter.FractionsControlStaffListViewHolder.bind$lambda$1$lambda$0(fractionsControlStaffListAdapter, item, this, view);
                }
            });
            if (item.getIsClicked()) {
                fractionsControlStaffListItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(fractionsControlStaffListItemBinding.getRoot().getContext().getResources(), R.drawable.bg_rectangle_blue_cr5, null));
            } else {
                fractionsControlStaffListItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(fractionsControlStaffListItemBinding.getRoot().getContext().getResources(), R.drawable.bg_rectangle_white15_cr5, null));
            }
            int rank = item.getRank();
            if (1 <= rank && rank < 11 && (!fractionsControlStaffListAdapter.listOfImages.isEmpty())) {
                int iIntValue = ((Number) fractionsControlStaffListAdapter.listOfImages.get(item.getRank() - 1)).intValue();
                ImageView imageViewStaffRank = fractionsControlStaffListItemBinding.imageViewStaffRank;
                Intrinsics.checkNotNullExpressionValue(imageViewStaffRank, "imageViewStaffRank");
                ViewExtensionKt.loadImage$default(imageViewStaffRank, Integer.valueOf(iIntValue), 0, null, 6, null);
            }
            fractionsControlStaffListItemBinding.textViewRank.setText(String.valueOf(item.getRank()));
            fractionsControlStaffListItemBinding.textViewNickname.setText(item.getNickname());
            if (item.getRank() == 10) {
                fractionsControlStaffListItemBinding.progressBarRankExperience.setVisibility(4);
                fractionsControlStaffListItemBinding.imageViewTopRank.setVisibility(0);
            } else {
                int rank2 = item.getRank() * 10;
                fractionsControlStaffListItemBinding.progressBarRankExperience.setVisibility(0);
                fractionsControlStaffListItemBinding.progressBarRankExperience.setProgress(rank2);
                fractionsControlStaffListItemBinding.imageViewTopRank.setVisibility(4);
            }
            if (item.getOnline() == 1) {
                fractionsControlStaffListItemBinding.imageViewOnline.setImageResource(R.drawable.bg_oval_green);
            } else {
                fractionsControlStaffListItemBinding.imageViewOnline.setImageResource(R.drawable.bg_oval_red_s9);
            }
        }

        public static final void bind$lambda$1$lambda$0(FractionsControlStaffListAdapter this$0, FractionControlListOfPlayers item, FractionsControlStaffListViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getOnPlayerItemClickListener().invoke(item, Integer.valueOf(this$1.getAdapterPosition()));
        }
    }

    public final void setCheckOnlyForOneItem(int checkedPosition) {
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            if (this.list.get(i).getIsClicked() && i != checkedPosition) {
                this.list.get(i).setClicked(false);
                notifyItemChanged(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsControlStaffListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsControlStaffListItemBinding fractionsControlStaffListItemBindingInflate = FractionsControlStaffListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionsControlStaffListItemBindingInflate, "inflate(...)");
        return new FractionsControlStaffListViewHolder(this, fractionsControlStaffListItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsControlStaffListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }
}

