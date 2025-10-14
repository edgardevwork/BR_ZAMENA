package com.blackhub.bronline.game.gui.spawnlocation.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SpawnLocationItemBinding;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem;
import com.bless.client.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationAdapter.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSpawnLocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n350#2,7:80\n*S KotlinDebug\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter\n*L\n19#1:80,7\n*E\n"})
/* loaded from: classes.dex */
public final class SpawnLocationAdapter extends RecyclerView.Adapter<SpawnLocationViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> listOfAvailability;

    @NotNull
    public final List<Integer> listOfImages;

    @NotNull
    public final List<SpawnLocationItem> listOfItems;
    public Function1<? super Integer, Unit> onItemClickListener;
    public int selectedItemPosition;

    public SpawnLocationAdapter(@NotNull List<SpawnLocationItem> listOfItems, @NotNull List<Integer> listOfImages, @NotNull List<Integer> listOfAvailability) {
        Intrinsics.checkNotNullParameter(listOfItems, "listOfItems");
        Intrinsics.checkNotNullParameter(listOfImages, "listOfImages");
        Intrinsics.checkNotNullParameter(listOfAvailability, "listOfAvailability");
        this.listOfItems = listOfItems;
        this.listOfImages = listOfImages;
        this.listOfAvailability = listOfAvailability;
        Iterator<SpawnLocationItem> it = listOfItems.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getSelected()) {
                break;
            } else {
                i++;
            }
        }
        this.selectedItemPosition = i;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnItemClickListener() {
        Function1 function1 = this.onItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onItemClickListener");
        return null;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemClickListener = function1;
    }

    /* compiled from: SpawnLocationAdapter.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter$SpawnLocationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SpawnLocationItemBinding;", "(Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter;Lcom/blackhub/bronline/databinding/SpawnLocationItemBinding;)V", "viewSelected", "Landroid/view/View;", "getViewSelected", "()Landroid/view/View;", "setViewSelected", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nSpawnLocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter$SpawnLocationViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public final class SpawnLocationViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SpawnLocationItemBinding binding;
        public final /* synthetic */ SpawnLocationAdapter this$0;

        @NotNull
        public View viewSelected;

        public static final void bind$lambda$3$lambda$1(View view) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpawnLocationViewHolder(@NotNull SpawnLocationAdapter spawnLocationAdapter, SpawnLocationItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = spawnLocationAdapter;
            this.binding = binding;
            View viewSelection = binding.viewSelection;
            Intrinsics.checkNotNullExpressionValue(viewSelection, "viewSelection");
            this.viewSelected = viewSelection;
        }

        @NotNull
        public final View getViewSelected() {
            return this.viewSelected;
        }

        public final void setViewSelected(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.viewSelected = view;
        }

        public final void bind(@NotNull final SpawnLocationItem item) {
            Object next;
            Intrinsics.checkNotNullParameter(item, "item");
            SpawnLocationItemBinding spawnLocationItemBinding = this.binding;
            final SpawnLocationAdapter spawnLocationAdapter = this.this$0;
            Iterator it = spawnLocationAdapter.listOfAvailability.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Number) next).intValue() == item.getId()) {
                        break;
                    }
                }
            }
            if (next == null) {
                spawnLocationItemBinding.viewSelectionUnavailable.setVisibility(0);
                spawnLocationItemBinding.ivLock.setVisibility(0);
                spawnLocationItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SpawnLocationAdapter.SpawnLocationViewHolder.bind$lambda$3$lambda$1(view);
                    }
                });
            } else {
                spawnLocationItemBinding.viewSelectionUnavailable.setVisibility(4);
                spawnLocationItemBinding.ivLock.setVisibility(4);
                spawnLocationItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SpawnLocationAdapter.SpawnLocationViewHolder.bind$lambda$3$lambda$2(spawnLocationAdapter, this, item, view);
                    }
                });
            }
            spawnLocationItemBinding.textViewPlaceName.setText(item.getPlaceName());
            ImageView imageViewPlace = spawnLocationItemBinding.imageViewPlace;
            Intrinsics.checkNotNullExpressionValue(imageViewPlace, "imageViewPlace");
            ViewExtensionKt.loadImage$default(imageViewPlace, spawnLocationAdapter.listOfImages.get(item.getId()), R.drawable.spawn_location_res_2, null, 4, null);
        }

        public static final void bind$lambda$3$lambda$2(SpawnLocationAdapter this$0, SpawnLocationViewHolder this$1, SpawnLocationItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            if (this$0.selectedItemPosition != this$1.getBindingAdapterPosition()) {
                ((SpawnLocationItem) this$0.listOfItems.get(this$0.selectedItemPosition)).setSelected(false);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.selectedItemPosition = this$1.getBindingAdapterPosition();
                item.setSelected(true);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.getOnItemClickListener().invoke(Integer.valueOf(item.getId()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SpawnLocationViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SpawnLocationItemBinding spawnLocationItemBindingInflate = SpawnLocationItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(spawnLocationItemBindingInflate, "inflate(...)");
        return new SpawnLocationViewHolder(this, spawnLocationItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SpawnLocationViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.listOfItems.get(position));
        if (this.listOfItems.get(position).getSelected()) {
            holder.itemView.isSelected();
            holder.getViewSelected().setVisibility(0);
        } else {
            holder.getViewSelected().setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.listOfItems.size();
    }
}

