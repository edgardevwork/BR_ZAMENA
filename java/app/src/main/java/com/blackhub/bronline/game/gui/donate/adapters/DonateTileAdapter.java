package com.blackhub.bronline.game.gui.donate.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateTileItemBinding;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateTileAdapter.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDonateTileAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonateTileAdapter.kt\ncom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,767:1\n26#2:768\n*S KotlinDebug\n*F\n+ 1 DonateTileAdapter.kt\ncom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter\n*L\n73#1:768\n*E\n"})
/* loaded from: classes.dex */
public final class DonateTileAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function1<? super Long, Unit> blockRenderItem;

    @NotNull
    public List<DonateItem> bodyItems;
    public Function5<? super Integer, ? super DonateItem, ? super Integer, ? super Integer, ? super View, Unit> buttonClickListener;
    public int currentPage;

    @NotNull
    public final Context fragmentContext;
    public final boolean ifServices;

    @NotNull
    public final ArrayMap<String, Bitmap> renderMap;
    public final int widthPx;

    public DonateTileAdapter(int i, boolean z, @NotNull Context fragmentContext) {
        Intrinsics.checkNotNullParameter(fragmentContext, "fragmentContext");
        this.widthPx = i;
        this.ifServices = z;
        this.fragmentContext = fragmentContext;
        this.bodyItems = CollectionsKt__CollectionsKt.emptyList();
        this.renderMap = new ArrayMap<>();
    }

    @NotNull
    public final Function1<Long, Unit> getBlockRenderItem() {
        Function1 function1 = this.blockRenderItem;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blockRenderItem");
        return null;
    }

    public final void setBlockRenderItem(@NotNull Function1<? super Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.blockRenderItem = function1;
    }

    @NotNull
    public final Function5<Integer, DonateItem, Integer, Integer, View, Unit> getButtonClickListener() {
        Function5 function5 = this.buttonClickListener;
        if (function5 != null) {
            return function5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("buttonClickListener");
        return null;
    }

    public final void setButtonClickListener(@NotNull Function5<? super Integer, ? super DonateItem, ? super Integer, ? super Integer, ? super View, Unit> function5) {
        Intrinsics.checkNotNullParameter(function5, "<set-?>");
        this.buttonClickListener = function5;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initBodyItems(@NotNull DonateTileObj objWithCollectionAndPage) {
        Intrinsics.checkNotNullParameter(objWithCollectionAndPage, "objWithCollectionAndPage");
        this.bodyItems = objWithCollectionAndPage.getItems();
        this.currentPage = objWithCollectionAndPage.getPage();
        notifyDataSetChanged();
    }

    /* compiled from: DonateTileAdapter.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonateTileItemBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonateTileAdapter;Lcom/blackhub/bronline/databinding/DonateTileItemBinding;)V", "firstElement", "", "secondElement", "zeroElement", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonateTileItemBinding binding;
        public final int firstElement;
        public final int secondElement;
        public final /* synthetic */ DonateTileAdapter this$0;
        public final int zeroElement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DonateTileAdapter donateTileAdapter, DonateTileItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donateTileAdapter;
            this.binding = binding;
            this.firstElement = 1;
            this.secondElement = 2;
        }

        public final void bind(@NotNull final DonateItem item) {
            Float f;
            Float f2;
            Float f3;
            Float f4;
            Float f5;
            Float f6;
            Intrinsics.checkNotNullParameter(item, "item");
            int itemPrice = DonateUtilsKt.getItemPrice(item);
            int upTag = item.getUpTag();
            if (upTag == 100) {
                this.this$0.setVisibleItemPresent(this.binding, 0);
                this.this$0.setVisibleItemDefault(this.binding, 8);
                DonateTileAdapter donateTileAdapter = this.this$0;
                TextView donateItemDefaultBadgeText = this.binding.donateItemDefaultBadgeText;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeText, "donateItemDefaultBadgeText");
                donateTileAdapter.setVisibleForCurrentTextView(donateItemDefaultBadgeText, 8);
                DonateTileAdapter donateTileAdapter2 = this.this$0;
                TextView donateItemDefaultBadgeTime = this.binding.donateItemDefaultBadgeTime;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeTime, "donateItemDefaultBadgeTime");
                donateTileAdapter2.setVisibleForCurrentTextView(donateItemDefaultBadgeTime, 8);
                DonateTileAdapter donateTileAdapter3 = this.this$0;
                TextView donateItemDefaultBadgePercent = this.binding.donateItemDefaultBadgePercent;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgePercent, "donateItemDefaultBadgePercent");
                donateTileAdapter3.setVisibleForCurrentTextView(donateItemDefaultBadgePercent, 8);
                if (item.getSaleTime() == 0) {
                    DonateTileAdapter donateTileAdapter4 = this.this$0;
                    TextView donateItemPresentStatusValueOfTime = this.binding.donateItemPresentStatusValueOfTime;
                    Intrinsics.checkNotNullExpressionValue(donateItemPresentStatusValueOfTime, "donateItemPresentStatusValueOfTime");
                    donateTileAdapter4.setVisibleForCurrentTextView(donateItemPresentStatusValueOfTime, 8);
                    DonateTileAdapter donateTileAdapter5 = this.this$0;
                    TextView donateItemPresentStatusTitle = this.binding.donateItemPresentStatusTitle;
                    Intrinsics.checkNotNullExpressionValue(donateItemPresentStatusTitle, "donateItemPresentStatusTitle");
                    donateTileAdapter5.setVisibleForCurrentTextView(donateItemPresentStatusTitle, 8);
                    DonateTileAdapter donateTileAdapter6 = this.this$0;
                    AppCompatButton donateItemButton = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton, "donateItemButton");
                    donateTileAdapter6.setVisibleButton(donateItemButton, 0);
                    DonateTileAdapter donateTileAdapter7 = this.this$0;
                    AppCompatButton donateItemButton2 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton2, "donateItemButton");
                    donateTileAdapter7.setTextForButton(donateItemButton2, this.this$0.fragmentContext.getString(R.string.common_get));
                    DonateTileAdapter donateTileAdapter8 = this.this$0;
                    AppCompatButton donateItemButton3 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton3, "donateItemButton");
                    donateTileAdapter8.buttonClickListener(donateItemButton3, 0, item, itemPrice);
                } else {
                    DonateTileAdapter donateTileAdapter9 = this.this$0;
                    TextView donateItemPresentStatusValueOfTime2 = this.binding.donateItemPresentStatusValueOfTime;
                    Intrinsics.checkNotNullExpressionValue(donateItemPresentStatusValueOfTime2, "donateItemPresentStatusValueOfTime");
                    donateTileAdapter9.setVisibleForCurrentTextView(donateItemPresentStatusValueOfTime2, 0);
                    DonateTileAdapter donateTileAdapter10 = this.this$0;
                    TextView donateItemPresentStatusTitle2 = this.binding.donateItemPresentStatusTitle;
                    Intrinsics.checkNotNullExpressionValue(donateItemPresentStatusTitle2, "donateItemPresentStatusTitle");
                    donateTileAdapter10.setVisibleForCurrentTextView(donateItemPresentStatusTitle2, 0);
                    DonateTileAdapter donateTileAdapter11 = this.this$0;
                    AppCompatButton donateItemButton4 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton4, "donateItemButton");
                    donateTileAdapter11.setVisibleButton(donateItemButton4, 4);
                    TextView textView = this.binding.donateItemPresentStatusValueOfTime;
                    Context context = this.this$0.fragmentContext;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.this$0.returnHours(item.getSaleTime()))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.this$0.returnMinutes(item.getSaleTime()))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    textView.setText(context.getString(R.string.donate_tile_surprise_time, str, str2));
                }
                this.this$0.setVisibleLimit(this.binding, 8);
                Unit unit = Unit.INSTANCE;
            } else if (upTag != 200) {
                this.this$0.setVisibleItemPresent(this.binding, 8);
                this.this$0.setVisibleItemDefault(this.binding, 0);
                DonateTileAdapter donateTileAdapter12 = this.this$0;
                AppCompatButton donateItemButton5 = this.binding.donateItemButton;
                Intrinsics.checkNotNullExpressionValue(donateItemButton5, "donateItemButton");
                donateTileAdapter12.setVisibleButton(donateItemButton5, 0);
                DonateTileAdapter donateTileAdapter13 = this.this$0;
                TextView donateItemDefaultPrice = this.binding.donateItemDefaultPrice;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice, "donateItemDefaultPrice");
                donateTileAdapter13.setVisibleForCurrentTextView(donateItemDefaultPrice, 0);
                DonateTileItemBinding donateTileItemBinding = this.binding;
                donateTileItemBinding.donateItemDefaultPrice.setPaintFlags(donateTileItemBinding.donateItemDefaultPriceStroked.getPaintFlags() & (-17));
                this.this$0.setInfoTextForItem(this.binding, item, getBindingAdapterPosition());
                this.this$0.updateBadgeTime(item.getSaleTime(), this.binding);
                this.this$0.updatePriceView(item, this.binding, itemPrice);
                Integer type = item.getType();
                if (type != null && type.intValue() == 2) {
                    DonateTileAdapter donateTileAdapter14 = this.this$0;
                    AppCompatButton donateItemButton6 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton6, "donateItemButton");
                    donateTileAdapter14.setStartImageForButton(donateItemButton6, ResourcesCompat.getDrawable(this.this$0.fragmentContext.getResources(), R.drawable.ic_basket_small, null));
                    DonateTileAdapter donateTileAdapter15 = this.this$0;
                    AppCompatButton donateItemButton7 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton7, "donateItemButton");
                    donateTileAdapter15.setTextForButton(donateItemButton7, this.this$0.fragmentContext.getString(R.string.donate_string_price_default, UsefulKt.getPriceWithSpaces(Integer.valueOf(itemPrice)), DonateUtilsKt.getPriceText(item)));
                    DonateTileAdapter donateTileAdapter16 = this.this$0;
                    AppCompatButton donateItemButton8 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton8, "donateItemButton");
                    donateTileAdapter16.buttonClickListener(donateItemButton8, 1, item, itemPrice);
                    if (this.this$0.renderMap.get(String.valueOf(item.getGameId())) != null) {
                        this.binding.donateItemDefaultIcon.setImageBitmap((Bitmap) this.this$0.renderMap.get(String.valueOf(item.getGameId())));
                    } else {
                        Integer gameId = item.getGameId();
                        float f7 = ((gameId != null && gameId.intValue() == 5326) || (gameId != null && gameId.intValue() == 62) || ((gameId != null && gameId.intValue() == 162) || ((gameId != null && gameId.intValue() == 88) || ((gameId != null && gameId.intValue() == 18624) || (gameId != null && gameId.intValue() == 18625))))) ? 1.0f : 0.9f;
                        Useful useful = Useful.INSTANCE;
                        Integer type2 = item.getType();
                        Integer internalId = item.getInternalId();
                        Integer gameId2 = item.getGameId();
                        ImageView imageView = this.binding.donateItemDefaultIcon;
                        ArrayMap arrayMap = this.this$0.renderMap;
                        Intrinsics.checkNotNull(imageView);
                        useful.renderItem(type2, internalId, gameId2, (3816 & 8) != 0 ? 0 : null, imageView, (3816 & 32) != 0 ? Float.valueOf(20.0f) : null, (3816 & 64) != 0 ? Float.valueOf(180.0f) : null, (3816 & 128) != 0 ? Float.valueOf(45.0f) : null, (3816 & 256) != 0 ? Float.valueOf(0.78f) : Float.valueOf(f7), (3816 & 512) != 0 ? Float.valueOf(0.0f) : null, (3816 & 1024) != 0 ? Float.valueOf(0.0f) : null, (3816 & 2048) != 0 ? Float.valueOf(0.0f) : null, arrayMap);
                        this.this$0.getBlockRenderItem().invoke(Long.valueOf(System.currentTimeMillis()));
                    }
                } else if (type != null && type.intValue() == 6) {
                    DonateTileAdapter donateTileAdapter17 = this.this$0;
                    AppCompatButton donateItemButton9 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton9, "donateItemButton");
                    donateTileAdapter17.setStartImageForButton(donateItemButton9, ResourcesCompat.getDrawable(this.this$0.fragmentContext.getResources(), R.drawable.ic_basket_small, null));
                    DonateTileAdapter donateTileAdapter18 = this.this$0;
                    AppCompatButton donateItemButton10 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton10, "donateItemButton");
                    donateTileAdapter18.setTextForButton(donateItemButton10, this.this$0.fragmentContext.getString(R.string.donate_string_price_default, UsefulKt.getPriceWithSpaces(Integer.valueOf(itemPrice)), DonateUtilsKt.getPriceText(item)));
                    DonateTileAdapter donateTileAdapter19 = this.this$0;
                    AppCompatButton donateItemButton11 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton11, "donateItemButton");
                    donateTileAdapter19.buttonClickListener(donateItemButton11, 1, item, itemPrice);
                    DonateTileAdapter donateTileAdapter20 = this.this$0;
                    ImageView donateItemDefaultIcon = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon, "donateItemDefaultIcon");
                    donateTileAdapter20.setImageView(donateItemDefaultIcon, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                } else if (type != null && type.intValue() == 11) {
                    DonateTileAdapter donateTileAdapter21 = this.this$0;
                    AppCompatButton donateItemButton12 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton12, "donateItemButton");
                    donateTileAdapter21.setStartImageForButton(donateItemButton12, ResourcesCompat.getDrawable(this.this$0.fragmentContext.getResources(), R.drawable.ic_basket_small, null));
                    DonateTileAdapter donateTileAdapter22 = this.this$0;
                    AppCompatButton donateItemButton13 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton13, "donateItemButton");
                    donateTileAdapter22.setTextForButton(donateItemButton13, this.this$0.fragmentContext.getString(R.string.donate_string_price_default, UsefulKt.getPriceWithSpaces(Integer.valueOf(itemPrice)), DonateUtilsKt.getPriceText(item)));
                    DonateTileAdapter donateTileAdapter23 = this.this$0;
                    AppCompatButton donateItemButton14 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton14, "donateItemButton");
                    donateTileAdapter23.buttonClickListener(donateItemButton14, 1, item, itemPrice);
                    if (this.this$0.renderMap.get(String.valueOf(item.getModelId())) != null) {
                        this.binding.donateItemDefaultIcon.setImageBitmap((Bitmap) this.this$0.renderMap.get(String.valueOf(item.getModelId())));
                    } else {
                        Useful useful2 = Useful.INSTANCE;
                        Integer internalId2 = item.getInternalId();
                        Integer modelId = item.getModelId();
                        ImageView donateItemDefaultIcon2 = this.binding.donateItemDefaultIcon;
                        Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon2, "donateItemDefaultIcon");
                        List<Float> rot = item.getRot();
                        float fFloatValue = 0.0f;
                        Float fValueOf = Float.valueOf((rot == null || (f6 = (Float) CollectionsKt___CollectionsKt.getOrNull(rot, this.zeroElement)) == null) ? 0.0f : f6.floatValue());
                        List<Float> rot2 = item.getRot();
                        Float fValueOf2 = Float.valueOf((rot2 == null || (f5 = (Float) CollectionsKt___CollectionsKt.getOrNull(rot2, this.firstElement)) == null) ? 0.0f : f5.floatValue());
                        List<Float> rot3 = item.getRot();
                        Float fValueOf3 = Float.valueOf((rot3 == null || (f4 = (Float) CollectionsKt___CollectionsKt.getOrNull(rot3, this.secondElement)) == null) ? 0.0f : f4.floatValue());
                        Float modelZoom = item.getModelZoom();
                        List<Float> shift = item.getShift();
                        Float fValueOf4 = Float.valueOf((shift == null || (f3 = (Float) CollectionsKt___CollectionsKt.getOrNull(shift, this.zeroElement)) == null) ? 0.0f : f3.floatValue());
                        List<Float> shift2 = item.getShift();
                        Float fValueOf5 = Float.valueOf((shift2 == null || (f2 = (Float) CollectionsKt___CollectionsKt.getOrNull(shift2, this.firstElement)) == null) ? 0.0f : f2.floatValue());
                        List<Float> shift3 = item.getShift();
                        if (shift3 != null && (f = (Float) CollectionsKt___CollectionsKt.getOrNull(shift3, this.secondElement)) != null) {
                            fFloatValue = f.floatValue();
                        }
                        useful2.renderItem(0, internalId2, modelId, (3816 & 8) != 0 ? 0 : null, donateItemDefaultIcon2, (3816 & 32) != 0 ? Float.valueOf(20.0f) : fValueOf, (3816 & 64) != 0 ? Float.valueOf(180.0f) : fValueOf2, (3816 & 128) != 0 ? Float.valueOf(45.0f) : fValueOf3, (3816 & 256) != 0 ? Float.valueOf(0.78f) : modelZoom, (3816 & 512) != 0 ? Float.valueOf(0.0f) : fValueOf4, (3816 & 1024) != 0 ? Float.valueOf(0.0f) : fValueOf5, (3816 & 2048) != 0 ? Float.valueOf(0.0f) : Float.valueOf(fFloatValue), this.this$0.renderMap);
                        this.this$0.getBlockRenderItem().invoke(Long.valueOf(System.currentTimeMillis()));
                    }
                } else if (type != null && type.intValue() == 5) {
                    DonateTileAdapter donateTileAdapter24 = this.this$0;
                    ImageView donateItemDefaultIcon3 = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon3, "donateItemDefaultIcon");
                    donateTileAdapter24.setImageView(donateItemDefaultIcon3, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                    DonateTileAdapter donateTileAdapter25 = this.this$0;
                    AppCompatButton donateItemButton15 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton15, "donateItemButton");
                    donateTileAdapter25.setStartImageForButton(donateItemButton15, ResourcesCompat.getDrawable(this.this$0.fragmentContext.getResources(), R.drawable.ic_basket_small, null));
                    DonateTileAdapter donateTileAdapter26 = this.this$0;
                    AppCompatButton donateItemButton16 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton16, "donateItemButton");
                    donateTileAdapter26.setTextForButton(donateItemButton16, this.this$0.fragmentContext.getString(R.string.donate_string_price_default, UsefulKt.getPriceWithSpaces(Integer.valueOf(itemPrice)), DonateUtilsKt.getPriceText(item)));
                    DonateTileAdapter donateTileAdapter27 = this.this$0;
                    AppCompatButton donateItemButton17 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton17, "donateItemButton");
                    donateTileAdapter27.buttonClickListener(donateItemButton17, 7, item, itemPrice);
                } else if (type != null && type.intValue() == 7) {
                    DonateTileAdapter donateTileAdapter28 = this.this$0;
                    AppCompatButton donateItemButton18 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton18, "donateItemButton");
                    donateTileAdapter28.setStartImageForButton(donateItemButton18, null);
                    DonateTileAdapter donateTileAdapter29 = this.this$0;
                    AppCompatButton donateItemButton19 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton19, "donateItemButton");
                    donateTileAdapter29.setTextForButton(donateItemButton19, this.this$0.fragmentContext.getString(R.string.common_view));
                    DonateTileAdapter donateTileAdapter30 = this.this$0;
                    AppCompatButton donateItemButton20 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton20, "donateItemButton");
                    donateTileAdapter30.buttonClickListener(donateItemButton20, 2, item, itemPrice);
                    if (this.this$0.renderMap.get(String.valueOf(item.getGameId())) != null) {
                        this.binding.donateItemDefaultIcon.setImageBitmap((Bitmap) this.this$0.renderMap.get(String.valueOf(item.getGameId())));
                    } else {
                        Useful useful3 = Useful.INSTANCE;
                        Integer type3 = item.getType();
                        Integer internalId3 = item.getInternalId();
                        Integer gameId3 = item.getGameId();
                        List<Integer> colors = item.getColors();
                        Integer num = colors != null ? colors.get(0) : null;
                        ImageView imageView2 = this.binding.donateItemDefaultIcon;
                        ArrayMap arrayMap2 = this.this$0.renderMap;
                        Intrinsics.checkNotNull(imageView2);
                        useful3.renderItem(type3, internalId3, gameId3, (3816 & 8) != 0 ? 0 : num, imageView2, (3816 & 32) != 0 ? Float.valueOf(20.0f) : null, (3816 & 64) != 0 ? Float.valueOf(180.0f) : null, (3816 & 128) != 0 ? Float.valueOf(45.0f) : null, (3816 & 256) != 0 ? Float.valueOf(0.78f) : Float.valueOf(0.85f), (3816 & 512) != 0 ? Float.valueOf(0.0f) : null, (3816 & 1024) != 0 ? Float.valueOf(0.0f) : null, (3816 & 2048) != 0 ? Float.valueOf(0.0f) : null, arrayMap2);
                        this.this$0.getBlockRenderItem().invoke(Long.valueOf(System.currentTimeMillis()));
                    }
                } else if (type != null && type.intValue() == 1) {
                    DonateTileAdapter donateTileAdapter31 = this.this$0;
                    AppCompatButton donateItemButton21 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton21, "donateItemButton");
                    donateTileAdapter31.setStartImageForButton(donateItemButton21, null);
                    DonateTileAdapter donateTileAdapter32 = this.this$0;
                    AppCompatButton donateItemButton22 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton22, "donateItemButton");
                    donateTileAdapter32.setTextForButton(donateItemButton22, this.this$0.fragmentContext.getString(R.string.common_view));
                    DonateTileAdapter donateTileAdapter33 = this.this$0;
                    TextView donateItemDefaultPriceStroked = this.binding.donateItemDefaultPriceStroked;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked, "donateItemDefaultPriceStroked");
                    donateTileAdapter33.setVisibleForCurrentTextView(donateItemDefaultPriceStroked, 4);
                    DonateTileAdapter donateTileAdapter34 = this.this$0;
                    TextView donateItemDefaultPrice2 = this.binding.donateItemDefaultPrice;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice2, "donateItemDefaultPrice");
                    donateTileAdapter34.setTextForTextView(donateItemDefaultPrice2, "");
                    DonateTileAdapter donateTileAdapter35 = this.this$0;
                    ImageView donateItemDefaultIcon4 = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon4, "donateItemDefaultIcon");
                    donateTileAdapter35.setImageView(donateItemDefaultIcon4, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                    DonateTileAdapter donateTileAdapter36 = this.this$0;
                    AppCompatButton donateItemButton23 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton23, "donateItemButton");
                    donateTileAdapter36.buttonClickListener(donateItemButton23, 3, item, itemPrice);
                } else if (type != null && type.intValue() == 3) {
                    DonateTileAdapter donateTileAdapter37 = this.this$0;
                    AppCompatButton donateItemButton24 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton24, "donateItemButton");
                    donateTileAdapter37.setStartImageForButton(donateItemButton24, null);
                    DonateTileAdapter donateTileAdapter38 = this.this$0;
                    AppCompatButton donateItemButton25 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton25, "donateItemButton");
                    donateTileAdapter38.setTextForButton(donateItemButton25, this.this$0.fragmentContext.getString(R.string.common_view));
                    DonateTileAdapter donateTileAdapter39 = this.this$0;
                    ImageView donateItemDefaultIcon5 = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon5, "donateItemDefaultIcon");
                    donateTileAdapter39.setImageView(donateItemDefaultIcon5, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                    DonateTileAdapter donateTileAdapter40 = this.this$0;
                    AppCompatButton donateItemButton26 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton26, "donateItemButton");
                    donateTileAdapter40.buttonClickListener(donateItemButton26, 4, item, itemPrice);
                } else if (type != null && type.intValue() == 9) {
                    DonateTileAdapter donateTileAdapter41 = this.this$0;
                    AppCompatButton donateItemButton27 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton27, "donateItemButton");
                    donateTileAdapter41.setStartImageForButton(donateItemButton27, null);
                    DonateTileAdapter donateTileAdapter42 = this.this$0;
                    AppCompatButton donateItemButton28 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton28, "donateItemButton");
                    donateTileAdapter42.setTextForButton(donateItemButton28, this.this$0.fragmentContext.getString(R.string.common_view));
                    DonateTileAdapter donateTileAdapter43 = this.this$0;
                    ImageView donateItemDefaultIcon6 = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon6, "donateItemDefaultIcon");
                    donateTileAdapter43.setImageView(donateItemDefaultIcon6, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                    DonateTileAdapter donateTileAdapter44 = this.this$0;
                    AppCompatButton donateItemButton29 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton29, "donateItemButton");
                    donateTileAdapter44.buttonClickListener(donateItemButton29, 5, item, itemPrice);
                } else if (type != null && type.intValue() == 4) {
                    DonateTileAdapter donateTileAdapter45 = this.this$0;
                    AppCompatButton donateItemButton30 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton30, "donateItemButton");
                    donateTileAdapter45.setStartImageForButton(donateItemButton30, null);
                    DonateTileAdapter donateTileAdapter46 = this.this$0;
                    AppCompatButton donateItemButton31 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton31, "donateItemButton");
                    donateTileAdapter46.setTextForButton(donateItemButton31, this.this$0.fragmentContext.getString(R.string.common_view));
                    DonateTileAdapter donateTileAdapter47 = this.this$0;
                    ImageView donateItemDefaultIcon7 = this.binding.donateItemDefaultIcon;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon7, "donateItemDefaultIcon");
                    donateTileAdapter47.setImageView(donateItemDefaultIcon7, Useful.INSTANCE.getDrawableByName(item.getImageId()));
                    DonateTileAdapter donateTileAdapter48 = this.this$0;
                    TextView donateItemDefaultPriceStroked2 = this.binding.donateItemDefaultPriceStroked;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked2, "donateItemDefaultPriceStroked");
                    donateTileAdapter48.setVisibleForCurrentTextView(donateItemDefaultPriceStroked2, 4);
                    DonateTileAdapter donateTileAdapter49 = this.this$0;
                    TextView donateItemDefaultPrice3 = this.binding.donateItemDefaultPrice;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice3, "donateItemDefaultPrice");
                    donateTileAdapter49.setVisibleForCurrentTextView(donateItemDefaultPrice3, 0);
                    DonateTileAdapter donateTileAdapter50 = this.this$0;
                    TextView donateItemDefaultPrice4 = this.binding.donateItemDefaultPrice;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice4, "donateItemDefaultPrice");
                    donateTileAdapter50.setGravityForCurrentTextView(donateItemDefaultPrice4, 17);
                    String str3 = (String) UtilsKt.buildTypeMerge(item.getHeader(), item.getHeaderStore());
                    DonateTileAdapter donateTileAdapter51 = this.this$0;
                    TextView donateItemDefaultPrice5 = this.binding.donateItemDefaultPrice;
                    Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice5, "donateItemDefaultPrice");
                    donateTileAdapter51.setTextForTextView(donateItemDefaultPrice5, this.this$0.fragmentContext.getString(R.string.donate_tile_text_for_view_vip, str3));
                    DonateTileAdapter donateTileAdapter52 = this.this$0;
                    AppCompatButton donateItemButton32 = this.binding.donateItemButton;
                    Intrinsics.checkNotNullExpressionValue(donateItemButton32, "donateItemButton");
                    donateTileAdapter52.buttonClickListener(donateItemButton32, 6, item, itemPrice);
                }
                if (item.getLimit() != -1) {
                    this.this$0.setVisibleLimit(this.binding, 0);
                    DonateTileAdapter donateTileAdapter53 = this.this$0;
                    TextView donateItemLimitCount = this.binding.donateItemLimitCount;
                    Intrinsics.checkNotNullExpressionValue(donateItemLimitCount, "donateItemLimitCount");
                    donateTileAdapter53.setTextForTextView(donateItemLimitCount, this.this$0.fragmentContext.getString(R.string.common_number_things, Integer.valueOf(item.getLimit())));
                } else {
                    this.this$0.setVisibleLimit(this.binding, 4);
                }
                Unit unit2 = Unit.INSTANCE;
            } else {
                this.this$0.setVisibleItemPresent(this.binding, 8);
                this.this$0.setVisibleItemDefault(this.binding, 0);
                DonateTileAdapter donateTileAdapter54 = this.this$0;
                TextView donateItemDefaultHeader = this.binding.donateItemDefaultHeader;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultHeader, "donateItemDefaultHeader");
                donateTileAdapter54.setTextForTextView(donateItemDefaultHeader, this.this$0.fragmentContext.getString(R.string.donate_tile_money_header));
                DonateTileAdapter donateTileAdapter55 = this.this$0;
                TextView donateItemDefaultSubHeader = this.binding.donateItemDefaultSubHeader;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultSubHeader, "donateItemDefaultSubHeader");
                donateTileAdapter55.setTextForTextView(donateItemDefaultSubHeader, this.this$0.fragmentContext.getString(R.string.donate_tile_money_sub_header));
                DonateTileAdapter donateTileAdapter56 = this.this$0;
                AppCompatButton donateItemButton33 = this.binding.donateItemButton;
                Intrinsics.checkNotNullExpressionValue(donateItemButton33, "donateItemButton");
                donateTileAdapter56.setVisibleButton(donateItemButton33, 0);
                DonateTileAdapter donateTileAdapter57 = this.this$0;
                AppCompatButton donateItemButton34 = this.binding.donateItemButton;
                Intrinsics.checkNotNullExpressionValue(donateItemButton34, "donateItemButton");
                donateTileAdapter57.setTextForButton(donateItemButton34, this.this$0.fragmentContext.getString(R.string.common_purchase));
                DonateTileAdapter donateTileAdapter58 = this.this$0;
                TextView donateItemDefaultPrice6 = this.binding.donateItemDefaultPrice;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice6, "donateItemDefaultPrice");
                donateTileAdapter58.setVisibleForCurrentTextView(donateItemDefaultPrice6, 4);
                DonateTileAdapter donateTileAdapter59 = this.this$0;
                TextView donateItemDefaultAdditional = this.binding.donateItemDefaultAdditional;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional, "donateItemDefaultAdditional");
                donateTileAdapter59.setVisibleForCurrentTextView(donateItemDefaultAdditional, 4);
                DonateTileAdapter donateTileAdapter60 = this.this$0;
                TextView donateItemDefaultBadgeText2 = this.binding.donateItemDefaultBadgeText;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeText2, "donateItemDefaultBadgeText");
                donateTileAdapter60.setVisibleForCurrentTextView(donateItemDefaultBadgeText2, 4);
                DonateTileAdapter donateTileAdapter61 = this.this$0;
                TextView donateItemDefaultBadgeTime2 = this.binding.donateItemDefaultBadgeTime;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeTime2, "donateItemDefaultBadgeTime");
                donateTileAdapter61.setVisibleForCurrentTextView(donateItemDefaultBadgeTime2, 4);
                DonateTileAdapter donateTileAdapter62 = this.this$0;
                TextView donateItemDefaultBadgePercent2 = this.binding.donateItemDefaultBadgePercent;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgePercent2, "donateItemDefaultBadgePercent");
                donateTileAdapter62.setVisibleForCurrentTextView(donateItemDefaultBadgePercent2, 4);
                DonateTileAdapter donateTileAdapter63 = this.this$0;
                TextView donateItemDefaultBadgeNew = this.binding.donateItemDefaultBadgeNew;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew, "donateItemDefaultBadgeNew");
                donateTileAdapter63.setVisibleForCurrentTextView(donateItemDefaultBadgeNew, 4);
                DonateTileAdapter donateTileAdapter64 = this.this$0;
                ImageView donateItemDefaultIcon8 = this.binding.donateItemDefaultIcon;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultIcon8, "donateItemDefaultIcon");
                donateTileAdapter64.setImageView(donateItemDefaultIcon8, Useful.INSTANCE.getDrawableByName(DonateConstants.ANY_AMOUNT_ICON_RES));
                DonateTileAdapter donateTileAdapter65 = this.this$0;
                AppCompatButton donateItemButton35 = this.binding.donateItemButton;
                Intrinsics.checkNotNullExpressionValue(donateItemButton35, "donateItemButton");
                donateTileAdapter65.buttonClickListener(donateItemButton35, 8, item, itemPrice);
                DonateTileAdapter donateTileAdapter66 = this.this$0;
                TextView donateItemLimitTitle = this.binding.donateItemLimitTitle;
                Intrinsics.checkNotNullExpressionValue(donateItemLimitTitle, "donateItemLimitTitle");
                donateTileAdapter66.setVisibleForCurrentTextView(donateItemLimitTitle, 4);
                DonateTileAdapter donateTileAdapter67 = this.this$0;
                TextView donateItemLimitCount2 = this.binding.donateItemLimitCount;
                Intrinsics.checkNotNullExpressionValue(donateItemLimitCount2, "donateItemLimitCount");
                donateTileAdapter67.setVisibleForCurrentTextView(donateItemLimitCount2, 4);
                Unit unit3 = Unit.INSTANCE;
            }
            this.this$0.updateItemIfNew(item.isNew(), this.binding);
            this.this$0.setTextForAdditional(item.getUpTag(), this.binding);
            this.binding.getRoot().getLayoutParams().width = this.this$0.getItemWidth();
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DonateTileAdapter.ViewHolder.bind$lambda$0(item, view);
                }
            });
        }

        public static final void bind$lambda$0(DonateItem item, View view) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Log.d(DonateConstants.DONATE_LOG, "item.gameId = " + item.getGameId());
        }
    }

    public final void updateItemIfNew(Integer isNew, DonateTileItemBinding binding) {
        if (isNew != null && isNew.intValue() == 1) {
            TextView donateItemDefaultBadgeNew = binding.donateItemDefaultBadgeNew;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew, "donateItemDefaultBadgeNew");
            setVisibleForCurrentTextView(donateItemDefaultBadgeNew, 0);
            TextView donateItemDefaultBadgeNew2 = binding.donateItemDefaultBadgeNew;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew2, "donateItemDefaultBadgeNew");
            setTextForTextView(donateItemDefaultBadgeNew2, this.fragmentContext.getString(R.string.common_new));
            return;
        }
        if (isNew != null && isNew.intValue() == 2) {
            TextView donateItemDefaultBadgeNew3 = binding.donateItemDefaultBadgeNew;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew3, "donateItemDefaultBadgeNew");
            setVisibleForCurrentTextView(donateItemDefaultBadgeNew3, 0);
            TextView donateItemDefaultBadgeNew4 = binding.donateItemDefaultBadgeNew;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew4, "donateItemDefaultBadgeNew");
            setTextForTextView(donateItemDefaultBadgeNew4, this.fragmentContext.getString(R.string.common_new));
            return;
        }
        TextView donateItemDefaultBadgeNew5 = binding.donateItemDefaultBadgeNew;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeNew5, "donateItemDefaultBadgeNew");
        setVisibleForCurrentTextView(donateItemDefaultBadgeNew5, 4);
    }

    public final void buttonClickListener(final Button button, final int currentAction, final DonateItem obj, final int itemPriceWithDiscount) {
        if (button.getAlpha() == 1.0f) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DonateTileAdapter.buttonClickListener$lambda$0(this.f$0, currentAction, obj, itemPriceWithDiscount, button, view);
                }
            });
        }
    }

    public static final void buttonClickListener$lambda$0(DonateTileAdapter this$0, int i, DonateItem obj, int i2, Button button, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(obj, "$obj");
        Intrinsics.checkNotNullParameter(button, "$button");
        this$0.getButtonClickListener().invoke(Integer.valueOf(i), obj, Integer.valueOf(this$0.currentPage), Integer.valueOf(i2), button);
    }

    public final int returnHours(int currentTime) {
        return currentTime / 3600;
    }

    public final int returnMinutes(int currentTime) {
        return (currentTime - (returnHours(currentTime) * 3600)) / 60;
    }

    public final void setInfoTextForItem(DonateTileItemBinding binding, DonateItem currentItem, int currentPosition) {
        String string;
        String str;
        if (this.currentPage != 0) {
            string = (String) UtilsKt.buildTypeMerge(currentItem.getHeader(), currentItem.getHeaderStore());
            str = (String) UtilsKt.buildTypeMerge(currentItem.getSubheader(), currentItem.getSubheaderStore());
        } else if (currentPosition == 1) {
            string = this.fragmentContext.getString(R.string.donate_sale_title_for_you);
            str = (String) UtilsKt.buildTypeMerge(currentItem.getHeader(), currentItem.getHeaderStore());
        } else if (currentPosition == 2) {
            string = this.fragmentContext.getString(R.string.donate_sale_title_deal_of_the_day);
            str = (String) UtilsKt.buildTypeMerge(currentItem.getHeader(), currentItem.getHeaderStore());
        } else if (currentPosition == 3) {
            string = this.fragmentContext.getString(R.string.donate_sale_title_product_of_the_day);
            str = (String) UtilsKt.buildTypeMerge(currentItem.getHeader(), currentItem.getHeaderStore());
        } else {
            string = (String) UtilsKt.buildTypeMerge(currentItem.getHeader(), currentItem.getHeaderStore());
            str = (String) UtilsKt.buildTypeMerge(currentItem.getSubheader(), currentItem.getSubheaderStore());
        }
        TextView donateItemDefaultHeader = binding.donateItemDefaultHeader;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultHeader, "donateItemDefaultHeader");
        setTextForTextView(donateItemDefaultHeader, string);
        TextView donateItemDefaultSubHeader = binding.donateItemDefaultSubHeader;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultSubHeader, "donateItemDefaultSubHeader");
        setTextForTextView(donateItemDefaultSubHeader, str);
    }

    public final void setTextForAdditional(int currentUpTag, DonateTileItemBinding binding) {
        if (currentUpTag == 1) {
            TextView donateItemDefaultAdditional = binding.donateItemDefaultAdditional;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional, "donateItemDefaultAdditional");
            setVisibleForCurrentTextView(donateItemDefaultAdditional, 0);
            TextView donateItemDefaultAdditional2 = binding.donateItemDefaultAdditional;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional2, "donateItemDefaultAdditional");
            setTextForTextView(donateItemDefaultAdditional2, this.fragmentContext.getString(R.string.donate_tile_hot_selling));
            return;
        }
        if (currentUpTag == 2) {
            TextView donateItemDefaultAdditional3 = binding.donateItemDefaultAdditional;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional3, "donateItemDefaultAdditional");
            setVisibleForCurrentTextView(donateItemDefaultAdditional3, 0);
            TextView donateItemDefaultAdditional4 = binding.donateItemDefaultAdditional;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional4, "donateItemDefaultAdditional");
            setTextForTextView(donateItemDefaultAdditional4, this.fragmentContext.getString(R.string.donate_tile_popular));
            return;
        }
        TextView donateItemDefaultAdditional5 = binding.donateItemDefaultAdditional;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultAdditional5, "donateItemDefaultAdditional");
        setVisibleForCurrentTextView(donateItemDefaultAdditional5, 4);
    }

    public final void updateBadgeTime(int newValue, DonateTileItemBinding binding) {
        if (newValue != 0) {
            TextView donateItemDefaultBadgeText = binding.donateItemDefaultBadgeText;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeText, "donateItemDefaultBadgeText");
            setVisibleForCurrentTextView(donateItemDefaultBadgeText, 0);
            TextView donateItemDefaultBadgeTime = binding.donateItemDefaultBadgeTime;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeTime, "donateItemDefaultBadgeTime");
            setVisibleForCurrentTextView(donateItemDefaultBadgeTime, 0);
            TextView textView = binding.donateItemDefaultBadgeTime;
            Context context = this.fragmentContext;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(returnHours(newValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(returnMinutes(newValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView.setText(context.getString(R.string.donate_tile_badge_time, str, str2));
            return;
        }
        TextView donateItemDefaultBadgeText2 = binding.donateItemDefaultBadgeText;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeText2, "donateItemDefaultBadgeText");
        setVisibleForCurrentTextView(donateItemDefaultBadgeText2, 4);
        TextView donateItemDefaultBadgeTime2 = binding.donateItemDefaultBadgeTime;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgeTime2, "donateItemDefaultBadgeTime");
        setVisibleForCurrentTextView(donateItemDefaultBadgeTime2, 4);
    }

    public final void updatePriceView(DonateItem item, DonateTileItemBinding binding, int itemPriceWithDiscount) {
        if (item.getSalePercent() != 0) {
            Integer type = item.getType();
            if ((type != null && type.intValue() == 2) || ((type != null && type.intValue() == 6) || ((type != null && type.intValue() == 5) || (type != null && type.intValue() == 11)))) {
                TextView donateItemDefaultPriceStroked = binding.donateItemDefaultPriceStroked;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked, "donateItemDefaultPriceStroked");
                setGravityForCurrentTextView(donateItemDefaultPriceStroked, 17);
                TextView donateItemDefaultPrice = binding.donateItemDefaultPrice;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice, "donateItemDefaultPrice");
                setVisibleForCurrentTextView(donateItemDefaultPrice, 4);
            } else {
                TextView donateItemDefaultPriceStroked2 = binding.donateItemDefaultPriceStroked;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked2, "donateItemDefaultPriceStroked");
                setGravityForCurrentTextView(donateItemDefaultPriceStroked2, 0);
                TextView donateItemDefaultPrice2 = binding.donateItemDefaultPrice;
                Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice2, "donateItemDefaultPrice");
                setVisibleForCurrentTextView(donateItemDefaultPrice2, 0);
            }
            TextView donateItemDefaultBadgePercent = binding.donateItemDefaultBadgePercent;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgePercent, "donateItemDefaultBadgePercent");
            setVisibleForCurrentTextView(donateItemDefaultBadgePercent, 0);
            TextView donateItemDefaultPriceStroked3 = binding.donateItemDefaultPriceStroked;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked3, "donateItemDefaultPriceStroked");
            setVisibleForCurrentTextView(donateItemDefaultPriceStroked3, 0);
            TextView textView = binding.donateItemDefaultPriceStroked;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            TextView donateItemDefaultPrice3 = binding.donateItemDefaultPrice;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice3, "donateItemDefaultPrice");
            setGravityForCurrentTextView(donateItemDefaultPrice3, 8388613);
            TextView donateItemDefaultBadgePercent2 = binding.donateItemDefaultBadgePercent;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgePercent2, "donateItemDefaultBadgePercent");
            setTextForTextView(donateItemDefaultBadgePercent2, this.fragmentContext.getString(R.string.donate_tile_badge_percent, Integer.valueOf(item.getSalePercent())));
            TextView donateItemDefaultPriceStroked4 = binding.donateItemDefaultPriceStroked;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked4, "donateItemDefaultPriceStroked");
            setTextForTextView(donateItemDefaultPriceStroked4, this.fragmentContext.getString(R.string.donate_int_price_default, item.getBasePrice(), DonateUtilsKt.getPriceText(item)));
            TextView donateItemDefaultPrice4 = binding.donateItemDefaultPrice;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice4, "donateItemDefaultPrice");
            setTextForTextView(donateItemDefaultPrice4, this.fragmentContext.getString(R.string.donate_int_price_default, Integer.valueOf(itemPriceWithDiscount), DonateUtilsKt.getPriceText(item)));
            return;
        }
        TextView donateItemDefaultBadgePercent3 = binding.donateItemDefaultBadgePercent;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultBadgePercent3, "donateItemDefaultBadgePercent");
        setVisibleForCurrentTextView(donateItemDefaultBadgePercent3, 4);
        TextView donateItemDefaultPriceStroked5 = binding.donateItemDefaultPriceStroked;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultPriceStroked5, "donateItemDefaultPriceStroked");
        setVisibleForCurrentTextView(donateItemDefaultPriceStroked5, 4);
        TextView donateItemDefaultPrice5 = binding.donateItemDefaultPrice;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice5, "donateItemDefaultPrice");
        setGravityForCurrentTextView(donateItemDefaultPrice5, 17);
        TextView donateItemDefaultPrice6 = binding.donateItemDefaultPrice;
        Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice6, "donateItemDefaultPrice");
        setTextForTextView(donateItemDefaultPrice6, this.fragmentContext.getString(R.string.donate_int_price_default, item.getBasePrice(), DonateUtilsKt.getPriceText(item)));
        Integer type2 = item.getType();
        if ((type2 != null && type2.intValue() == 2) || ((type2 != null && type2.intValue() == 6) || (type2 != null && type2.intValue() == 11))) {
            TextView donateItemDefaultPrice7 = binding.donateItemDefaultPrice;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice7, "donateItemDefaultPrice");
            setVisibleForCurrentTextView(donateItemDefaultPrice7, 4);
        } else if (this.ifServices) {
            TextView donateItemDefaultPrice8 = binding.donateItemDefaultPrice;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice8, "donateItemDefaultPrice");
            setVisibleForCurrentTextView(donateItemDefaultPrice8, 4);
        } else {
            TextView donateItemDefaultPrice9 = binding.donateItemDefaultPrice;
            Intrinsics.checkNotNullExpressionValue(donateItemDefaultPrice9, "donateItemDefaultPrice");
            setVisibleForCurrentTextView(donateItemDefaultPrice9, 0);
        }
    }

    public final void setGravityForCurrentTextView(TextView textView, int valueOfGravity) {
        textView.setGravity(valueOfGravity);
    }

    public final void setImageView(ImageView currentImageView, Drawable currentImage) {
        currentImageView.setImageDrawable(currentImage);
    }

    public final void setStartImageForButton(Button currentButton, Drawable startDrawable) {
        currentButton.setCompoundDrawablesWithIntrinsicBounds(startDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setVisibleForCurrentTextView(TextView textView, int isVisible) {
        textView.setVisibility(isVisible);
    }

    public final void setTextForTextView(TextView textView, String newText) {
        if (newText == null) {
            newText = "";
        }
        textView.setText(newText);
    }

    public final void setVisibleButton(Button button, int isVisible) {
        button.setVisibility(isVisible);
    }

    public final void setTextForButton(Button button, String newText) {
        if (newText == null) {
            newText = "";
        }
        button.setText(newText);
    }

    public final void setVisibleItemPresent(DonateTileItemBinding binding, int isVisible) {
        binding.donateItemPresentBg.setVisibility(isVisible);
        binding.donateItemPresentTitle.setVisibility(isVisible);
        binding.donateItemPresentSubTitle.setVisibility(isVisible);
        binding.donateItemPresentIcon.setVisibility(isVisible);
        binding.donateItemPresentStatusTitle.setVisibility(isVisible);
        binding.donateItemPresentStatusValueOfTime.setVisibility(isVisible);
    }

    public final void setVisibleItemDefault(DonateTileItemBinding binding, int isVisible) {
        binding.donateItemDefaultBg.setVisibility(isVisible);
        binding.donateItemDefaultAdditional.setVisibility(isVisible);
        binding.donateItemDefaultHeader.setVisibility(isVisible);
        binding.donateItemDefaultSubHeader.setVisibility(isVisible);
        binding.donateItemDefaultIcon.setVisibility(isVisible);
        binding.donateItemDefaultPriceStroked.setVisibility(isVisible);
        binding.donateItemDefaultPrice.setVisibility(isVisible);
    }

    public final void setVisibleLimit(DonateTileItemBinding binding, int isVisible) {
        binding.donateItemLimitTitle.setVisibility(isVisible);
        binding.donateItemLimitCount.setVisibility(isVisible);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonateTileItemBinding donateTileItemBindingInflate = DonateTileItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donateTileItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, donateTileItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.bodyItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.bodyItems.size();
    }

    public final int getItemWidth() {
        return (int) (this.widthPx / 4.5f);
    }
}

