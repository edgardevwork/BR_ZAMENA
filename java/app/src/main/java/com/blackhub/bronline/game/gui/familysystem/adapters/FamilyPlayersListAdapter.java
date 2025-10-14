package com.blackhub.bronline.game.gui.familysystem.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesPlayersItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersListAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayer;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyPlayersListAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FamilyPlayersListAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    public static final int $stable = 8;

    @NotNull
    public final List<FamilyPlayer> copyList;

    @Nullable
    public final JNIActivity mainActivity;

    @Nullable
    public final Function2<FamilyPlayer, Integer, Unit> playerClick;

    @NotNull
    public final List<FamilyPlayer> playersList;

    /* JADX WARN: Multi-variable type inference failed */
    public FamilyPlayersListAdapter(@NotNull List<FamilyPlayer> playersList, @Nullable Function2<? super FamilyPlayer, ? super Integer, Unit> function2, @Nullable JNIActivity jNIActivity) {
        Intrinsics.checkNotNullParameter(playersList, "playersList");
        this.playersList = playersList;
        this.playerClick = function2;
        this.mainActivity = jNIActivity;
        this.copyList = new ArrayList();
    }

    @NotNull
    public final List<FamilyPlayer> getCopyList() {
        return this.copyList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FamiliesPlayersItemBinding familiesPlayersItemBindingInflate = FamiliesPlayersItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(familiesPlayersItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, familiesPlayersItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.playersList.get(position), this.playerClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.playersList.size();
    }

    /* compiled from: FamilyPlayersListAdapter.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyPlayersListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesPlayersItemBinding;", "(Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyPlayersListAdapter;Lcom/blackhub/bronline/databinding/FamiliesPlayersItemBinding;)V", "bind", "", "player", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyPlayer;", "playerClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "position", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickPlayerList;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FamiliesPlayersItemBinding binding;
        public final /* synthetic */ FamilyPlayersListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FamilyPlayersListAdapter familyPlayersListAdapter, FamiliesPlayersItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = familyPlayersListAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final FamilyPlayer player, @Nullable final Function2<? super FamilyPlayer, ? super Integer, Unit> playerClick) {
            Intrinsics.checkNotNullParameter(player, "player");
            FamiliesPlayersItemBinding familiesPlayersItemBinding = this.binding;
            FamilyPlayersListAdapter familyPlayersListAdapter = this.this$0;
            familiesPlayersItemBinding.playersRank.setText(String.valueOf(player.getPlayersRank()));
            familiesPlayersItemBinding.playersNick.setText(player.getPlayersNick());
            familiesPlayersItemBinding.playersNick.setSelected(true);
            JNIActivity jNIActivity = familyPlayersListAdapter.mainActivity;
            if (jNIActivity != null) {
                if (player.getPlayersStatus() == 1) {
                    familiesPlayersItemBinding.playersStatus.setBackground(ContextCompat.getDrawable(jNIActivity, R.drawable.bg_rectangle_light_green_cr15));
                } else {
                    familiesPlayersItemBinding.playersStatus.setBackground(ContextCompat.getDrawable(jNIActivity, R.drawable.bg_rectangle_red_cr15));
                }
                if (player.isClicked()) {
                    familiesPlayersItemBinding.getRoot().setBackground(ContextCompat.getDrawable(jNIActivity, R.drawable.bg_rectangle_blue_cr5));
                } else {
                    familiesPlayersItemBinding.getRoot().setBackground(ContextCompat.getDrawable(jNIActivity, R.drawable.bg_rectangle_white15_cr5));
                }
            }
            familiesPlayersItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersListAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyPlayersListAdapter.ViewHolder.bind$lambda$2$lambda$1(playerClick, player, this, view);
                }
            });
        }

        public static final void bind$lambda$2$lambda$1(Function2 function2, FamilyPlayer player, ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(player, "$player");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (function2 != null) {
                function2.invoke(player, Integer.valueOf(this$0.getLayoutPosition()));
            }
        }
    }

    public final void setCheckOnlyElement(int checkedPosition) {
        int size = this.playersList.size();
        for (int i = 0; i < size; i++) {
            if (this.playersList.get(i).isClicked() && i != checkedPosition) {
                this.playersList.get(i).setClicked(false);
                notifyItemChanged(i);
            }
        }
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersListAdapter.getFilter.1
            /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
            @Override // android.widget.Filter
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Filter.FilterResults performFiltering(@Nullable CharSequence p0) {
                String string;
                String string2;
                ArrayList arrayList = new ArrayList();
                if (p0 == null || (string2 = p0.toString()) == null) {
                    string = null;
                } else {
                    String lowerCase = string2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        int length = lowerCase.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = Intrinsics.compare((int) lowerCase.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        string = lowerCase.subSequence(i, length + 1).toString();
                    }
                }
                for (FamilyPlayer familyPlayer : FamilyPlayersListAdapter.this.getCopyList()) {
                    if (string != null) {
                        String playersNick = familyPlayer.getPlayersNick();
                        Locale ROOT = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        String lowerCase2 = playersNick.toLowerCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) string, false, 2, (Object) null)) {
                            arrayList.add(familyPlayer);
                        }
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                return filterResults;
            }

            @Override // android.widget.Filter
            @SuppressLint({"NotifyDataSetChanged"})
            public void publishResults(@Nullable CharSequence p0, @Nullable Filter.FilterResults p1) {
                FamilyPlayersListAdapter.this.playersList.clear();
                List list = FamilyPlayersListAdapter.this.playersList;
                Object obj = p1 != null ? p1.values : null;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Collection<com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayer>");
                list.addAll((Collection) obj);
                FamilyPlayersListAdapter.this.notifyDataSetChanged();
            }
        };
    }
}

