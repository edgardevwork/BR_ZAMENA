package com.blackhub.bronline.game.gui.playerslist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.PlayersListItemBinding;
import com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter;
import com.blackhub.bronline.game.gui.playerslist.data.PlayersData;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlayersListAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlayersListAdapter extends RecyclerView.Adapter<PlayersListHolder> implements Filterable {
    public static final int $stable = 8;
    public int clickedPosition;

    @NotNull
    public List<PlayersData> lPlayersData;

    @NotNull
    public List<PlayersData> lPlayersDataCopy;
    public Function2<? super String, ? super Integer, Unit> onClickListenerPlayersList;

    public PlayersListAdapter(@NotNull List<PlayersData> playersData) {
        Intrinsics.checkNotNullParameter(playersData, "playersData");
        this.clickedPosition = -1;
        this.lPlayersData = playersData;
        this.lPlayersDataCopy = playersData;
    }

    @NotNull
    public final Function2<String, Integer, Unit> getOnClickListenerPlayersList() {
        Function2 function2 = this.onClickListenerPlayersList;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onClickListenerPlayersList");
        return null;
    }

    public final void setOnClickListenerPlayersList(@NotNull Function2<? super String, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onClickListenerPlayersList = function2;
    }

    public final void setDataInAdapter(@NotNull List<PlayersData> playersData) {
        Intrinsics.checkNotNullParameter(playersData, "playersData");
        this.lPlayersData = playersData;
        this.lPlayersDataCopy = playersData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PlayersListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PlayersListItemBinding playersListItemBindingInflate = PlayersListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(playersListItemBindingInflate, "inflate(...)");
        return new PlayersListHolder(this, playersListItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PlayersListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.lPlayersData.size();
    }

    /* compiled from: PlayersListAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/PlayersListItemBinding;", "(Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter;Lcom/blackhub/bronline/databinding/PlayersListItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/PlayersListItemBinding;", "bind", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nPlayersListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayersListAdapter.kt\ncom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n*S KotlinDebug\n*F\n+ 1 PlayersListAdapter.kt\ncom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder\n*L\n63#1:131,2\n*E\n"})
    public final class PlayersListHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final PlayersListItemBinding binding;
        public final /* synthetic */ PlayersListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayersListHolder(@NotNull PlayersListAdapter playersListAdapter, PlayersListItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = playersListAdapter;
            this.binding = binding;
        }

        @NotNull
        public final PlayersListItemBinding getBinding() {
            return this.binding;
        }

        public final void bind() {
            PlayersListItemBinding playersListItemBinding = this.binding;
            final PlayersListAdapter playersListAdapter = this.this$0;
            Context context = playersListItemBinding.getRoot().getContext();
            playersListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$PlayersListHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayersListAdapter.PlayersListHolder.bind$lambda$2$lambda$1(playersListAdapter, this, view);
                }
            });
            PlayersData playersData = (PlayersData) playersListAdapter.lPlayersData.get(getLayoutPosition());
            String string = context.getString(R.string.common_value_with_level, Integer.valueOf(playersData.getPlayerLevel()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(R.string.players_list_players_ping, Integer.valueOf(playersData.getPing()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            playersListItemBinding.playerId.setText(String.valueOf(playersData.getId()));
            playersListItemBinding.playerName.setText(playersData.getName());
            playersListItemBinding.playerLevel.setText(string);
            playersListItemBinding.playerPing.setText(string2);
            if (!playersData.getIsClicked()) {
                playersListItemBinding.getRoot().setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_black30_cr5));
            } else {
                playersListItemBinding.getRoot().setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_red_hgr_cr5_1));
            }
        }

        public static final void bind$lambda$2$lambda$1(PlayersListAdapter this$0, PlayersListHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            PlayersData playersData = (PlayersData) this$0.lPlayersData.get(this$1.getLayoutPosition());
            if (this$0.clickedPosition >= 0) {
                if (this$0.clickedPosition < this$0.lPlayersData.size()) {
                    ((PlayersData) this$0.lPlayersData.get(this$0.clickedPosition)).setClicked(false);
                    this$0.notifyItemChanged(this$0.clickedPosition);
                } else {
                    for (PlayersData playersData2 : this$0.lPlayersData) {
                        if (playersData2.getIsClicked()) {
                            playersData2.setClicked(false);
                        }
                    }
                    this$0.notifyDataSetChanged();
                }
            }
            this$0.clickedPosition = this$1.getLayoutPosition();
            playersData.setClicked(true);
            this$0.notifyItemChanged(this$1.getLayoutPosition());
            this$0.getOnClickListenerPlayersList().invoke(playersData.getName(), Integer.valueOf(this$1.getLayoutPosition()));
        }
    }

    /* compiled from: PlayersListAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, m7105d2 = {"com/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$getFilter$1 */
    public static final class C44011 extends Filter {
        public C44011() {
        }

        @Override // android.widget.Filter
        @NotNull
        public Filter.FilterResults performFiltering(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            String string = charSequence.toString();
            List arrayList = new ArrayList();
            if (string.length() == 0) {
                List list = PlayersListAdapter.this.lPlayersDataCopy;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
                arrayList = TypeIntrinsics.asMutableList(list);
            } else {
                for (PlayersData playersData : PlayersListAdapter.this.lPlayersDataCopy) {
                    String name = playersData.getName();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String lowerCase = name.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                    String lowerCase2 = string.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                        arrayList.add(playersData);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(@NotNull CharSequence charSequence, @NotNull Filter.FilterResults filterResults) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            Intrinsics.checkNotNullParameter(filterResults, "filterResults");
            PlayersListAdapter playersListAdapter = PlayersListAdapter.this;
            Object obj = filterResults.values;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
            playersListAdapter.lPlayersData = (List) obj;
            PlayersListAdapter.this.notifyDataSetChanged();
        }
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter() { // from class: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter.getFilter.1
            public C44011() {
            }

            @Override // android.widget.Filter
            @NotNull
            public Filter.FilterResults performFiltering(@NotNull CharSequence charSequence) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                String string = charSequence.toString();
                List arrayList = new ArrayList();
                if (string.length() == 0) {
                    List list = PlayersListAdapter.this.lPlayersDataCopy;
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
                    arrayList = TypeIntrinsics.asMutableList(list);
                } else {
                    for (PlayersData playersData : PlayersListAdapter.this.lPlayersDataCopy) {
                        String name = playersData.getName();
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                        String lowerCase = name.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        Locale locale2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                        String lowerCase2 = string.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                            arrayList.add(playersData);
                        }
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(@NotNull CharSequence charSequence, @NotNull Filter.FilterResults filterResults) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                Intrinsics.checkNotNullParameter(filterResults, "filterResults");
                PlayersListAdapter playersListAdapter = PlayersListAdapter.this;
                Object obj = filterResults.values;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
                playersListAdapter.lPlayersData = (List) obj;
                PlayersListAdapter.this.notifyDataSetChanged();
            }
        };
    }
}

