package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\bv\b\u0087\b\u0018\u00002\u00020\u0001B§\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020(¢\u0006\u0002\u0010)J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010|\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001e\u0010\u0086\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u001dHÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020(HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J²\u0003\u0010\u0098\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020(HÆ\u0001¢\u0006\u0003\u0010\u0099\u0001J\u0015\u0010\u009a\u0001\u001a\u00020(2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u009d\u0001\u001a\u00020\u0006HÖ\u0001R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-R\"\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b=\u0010/\"\u0004\b>\u00101R \u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR \u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010@\"\u0004\bL\u0010BR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bM\u0010/\"\u0004\bN\u00101R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u001e\u0010/\"\u0004\bO\u00101R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010P\"\u0004\bQ\u0010RR\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010+\"\u0004\bT\u0010-R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bU\u0010/\"\u0004\bV\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\\\u0010/\"\u0004\b]\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b^\u0010/\"\u0004\b_\u00101R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00108\"\u0004\ba\u0010:R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010+\"\u0004\be\u0010-R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010+\"\u0004\bg\u0010-R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00108\"\u0004\bi\u0010:R2\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010@\"\u0004\bo\u0010BR \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010@\"\u0004\bq\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\br\u0010/\"\u0004\bs\u00101R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010+\"\u0004\bu\u0010-R&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00108\"\u0004\bw\u0010:¨\u0006\u009e\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "", "internalId", "", "gameId", "header", "", "headerStore", "subheader", "subheaderStore", "basePrice", "renderId", CatchStreamerKeys.COUNT_KEY, "type", "rot", "", "", "modelId", "modelZoom", "shift", "colors", "contains", SavedStateHandle.VALUES, "money", "imageId", "desc", "descStore", "specs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isNew", "rubles", "closed", "salePercent", "saleTime", "assignedId", "upTag", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, "limit", "isSelected", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIIIIIZ)V", "getAssignedId", "()I", "setAssignedId", "(I)V", "getBasePrice", "()Ljava/lang/Integer;", "setBasePrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCategory", "setCategory", "getClosed", "setClosed", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "getContains", "setContains", "getCount", "setCount", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getDescStore", "setDescStore", "getGameId", "setGameId", "getHeader", "setHeader", "getHeaderStore", "setHeaderStore", "getImageId", "setImageId", "getInternalId", "setInternalId", "setNew", "()Z", "setSelected", "(Z)V", "getLimit", "setLimit", "getModelId", "setModelId", "getModelZoom", "()Ljava/lang/Float;", "setModelZoom", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getMoney", "setMoney", "getRenderId", "setRenderId", "getRot", "setRot", "getRubles", "setRubles", "getSalePercent", "setSalePercent", "getSaleTime", "setSaleTime", "getShift", "setShift", "getSpecs", "()Ljava/util/ArrayList;", "setSpecs", "(Ljava/util/ArrayList;)V", "getSubheader", "setSubheader", "getSubheaderStore", "setSubheaderStore", "getType", "setType", "getUpTag", "setUpTag", "getValues", "setValues", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIIIIIZ)Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DonateItem {
    public static final int $stable = 8;
    public int assignedId;

    @SerializedName("basePrice")
    @Nullable
    public Integer basePrice;
    public int category;

    @SerializedName("closed")
    @Nullable
    public Integer closed;

    @SerializedName("colors")
    @Nullable
    public List<Integer> colors;

    @SerializedName("contains")
    @Nullable
    public List<Integer> contains;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    @Nullable
    public Integer count;

    @SerializedName("desc")
    @Nullable
    public String desc;

    @SerializedName("desc_store")
    @Nullable
    public String descStore;

    @SerializedName("gameId")
    @Nullable
    public Integer gameId;

    @SerializedName("header")
    @Nullable
    public String header;

    @SerializedName("header_store")
    @Nullable
    public String headerStore;

    @SerializedName("imageId")
    @Nullable
    public String imageId;

    @SerializedName("internalId")
    @Nullable
    public Integer internalId;

    @SerializedName("isNew")
    @Nullable
    public Integer isNew;
    public boolean isSelected;
    public int limit;

    @SerializedName("modelId")
    @Nullable
    public Integer modelId;

    @SerializedName("modelZoom")
    @Nullable
    public Float modelZoom;

    @SerializedName("money")
    @Nullable
    public Integer money;

    @SerializedName("renderId")
    @Nullable
    public Integer renderId;

    @SerializedName("rot")
    @Nullable
    public List<Float> rot;

    @SerializedName("rubles")
    @Nullable
    public Integer rubles;
    public int salePercent;
    public int saleTime;

    @SerializedName("shift")
    @Nullable
    public List<Float> shift;

    @SerializedName("specs")
    @Nullable
    public ArrayList<Integer> specs;

    @SerializedName("subheader")
    @Nullable
    public String subheader;

    @SerializedName("subheader_store")
    @Nullable
    public String subheaderStore;

    @SerializedName("type")
    @Nullable
    public Integer type;
    public int upTag;

    @SerializedName(SavedStateHandle.VALUES)
    @Nullable
    public List<Integer> values;

    public DonateItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getInternalId() {
        return this.internalId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final List<Float> component11() {
        return this.rot;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getModelId() {
        return this.modelId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float getModelZoom() {
        return this.modelZoom;
    }

    @Nullable
    public final List<Float> component14() {
        return this.shift;
    }

    @Nullable
    public final List<Integer> component15() {
        return this.colors;
    }

    @Nullable
    public final List<Integer> component16() {
        return this.contains;
    }

    @Nullable
    public final List<Integer> component17() {
        return this.values;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getMoney() {
        return this.money;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getGameId() {
        return this.gameId;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getDescStore() {
        return this.descStore;
    }

    @Nullable
    public final ArrayList<Integer> component22() {
        return this.specs;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getIsNew() {
        return this.isNew;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getRubles() {
        return this.rubles;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getClosed() {
        return this.closed;
    }

    /* renamed from: component26, reason: from getter */
    public final int getSalePercent() {
        return this.salePercent;
    }

    /* renamed from: component27, reason: from getter */
    public final int getSaleTime() {
        return this.saleTime;
    }

    /* renamed from: component28, reason: from getter */
    public final int getAssignedId() {
        return this.assignedId;
    }

    /* renamed from: component29, reason: from getter */
    public final int getUpTag() {
        return this.upTag;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component30, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* renamed from: component31, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getHeaderStore() {
        return this.headerStore;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSubheader() {
        return this.subheader;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getSubheaderStore() {
        return this.subheaderStore;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBasePrice() {
        return this.basePrice;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getRenderId() {
        return this.renderId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final DonateItem copy(@Nullable Integer internalId, @Nullable Integer gameId, @Nullable String header, @Nullable String headerStore, @Nullable String subheader, @Nullable String subheaderStore, @Nullable Integer basePrice, @Nullable Integer renderId, @Nullable Integer count, @Nullable Integer type, @Nullable List<Float> rot, @Nullable Integer modelId, @Nullable Float modelZoom, @Nullable List<Float> shift, @Nullable List<Integer> colors, @Nullable List<Integer> contains, @Nullable List<Integer> values, @Nullable Integer money, @Nullable String imageId, @Nullable String desc, @Nullable String descStore, @Nullable ArrayList<Integer> specs, @Nullable Integer isNew, @Nullable Integer rubles, @Nullable Integer closed, int salePercent, int saleTime, int assignedId, int upTag, int category, int limit, boolean isSelected) {
        return new DonateItem(internalId, gameId, header, headerStore, subheader, subheaderStore, basePrice, renderId, count, type, rot, modelId, modelZoom, shift, colors, contains, values, money, imageId, desc, descStore, specs, isNew, rubles, closed, salePercent, saleTime, assignedId, upTag, category, limit, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonateItem)) {
            return false;
        }
        DonateItem donateItem = (DonateItem) other;
        return Intrinsics.areEqual(this.internalId, donateItem.internalId) && Intrinsics.areEqual(this.gameId, donateItem.gameId) && Intrinsics.areEqual(this.header, donateItem.header) && Intrinsics.areEqual(this.headerStore, donateItem.headerStore) && Intrinsics.areEqual(this.subheader, donateItem.subheader) && Intrinsics.areEqual(this.subheaderStore, donateItem.subheaderStore) && Intrinsics.areEqual(this.basePrice, donateItem.basePrice) && Intrinsics.areEqual(this.renderId, donateItem.renderId) && Intrinsics.areEqual(this.count, donateItem.count) && Intrinsics.areEqual(this.type, donateItem.type) && Intrinsics.areEqual(this.rot, donateItem.rot) && Intrinsics.areEqual(this.modelId, donateItem.modelId) && Intrinsics.areEqual((Object) this.modelZoom, (Object) donateItem.modelZoom) && Intrinsics.areEqual(this.shift, donateItem.shift) && Intrinsics.areEqual(this.colors, donateItem.colors) && Intrinsics.areEqual(this.contains, donateItem.contains) && Intrinsics.areEqual(this.values, donateItem.values) && Intrinsics.areEqual(this.money, donateItem.money) && Intrinsics.areEqual(this.imageId, donateItem.imageId) && Intrinsics.areEqual(this.desc, donateItem.desc) && Intrinsics.areEqual(this.descStore, donateItem.descStore) && Intrinsics.areEqual(this.specs, donateItem.specs) && Intrinsics.areEqual(this.isNew, donateItem.isNew) && Intrinsics.areEqual(this.rubles, donateItem.rubles) && Intrinsics.areEqual(this.closed, donateItem.closed) && this.salePercent == donateItem.salePercent && this.saleTime == donateItem.saleTime && this.assignedId == donateItem.assignedId && this.upTag == donateItem.upTag && this.category == donateItem.category && this.limit == donateItem.limit && this.isSelected == donateItem.isSelected;
    }

    public int hashCode() {
        Integer num = this.internalId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gameId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.header;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerStore;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subheader;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subheaderStore;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.basePrice;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.renderId;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.count;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.type;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<Float> list = this.rot;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num7 = this.modelId;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Float f = this.modelZoom;
        int iHashCode13 = (iHashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        List<Float> list2 = this.shift;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.colors;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.contains;
        int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.values;
        int iHashCode17 = (iHashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num8 = this.money;
        int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str5 = this.imageId;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.descStore;
        int iHashCode21 = (iHashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.specs;
        int iHashCode22 = (iHashCode21 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num9 = this.isNew;
        int iHashCode23 = (iHashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.rubles;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.closed;
        return ((((((((((((((iHashCode24 + (num11 != null ? num11.hashCode() : 0)) * 31) + Integer.hashCode(this.salePercent)) * 31) + Integer.hashCode(this.saleTime)) * 31) + Integer.hashCode(this.assignedId)) * 31) + Integer.hashCode(this.upTag)) * 31) + Integer.hashCode(this.category)) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.isSelected);
    }

    @NotNull
    public String toString() {
        return "DonateItem(internalId=" + this.internalId + ", gameId=" + this.gameId + ", header=" + this.header + ", headerStore=" + this.headerStore + ", subheader=" + this.subheader + ", subheaderStore=" + this.subheaderStore + ", basePrice=" + this.basePrice + ", renderId=" + this.renderId + ", count=" + this.count + ", type=" + this.type + ", rot=" + this.rot + ", modelId=" + this.modelId + ", modelZoom=" + this.modelZoom + ", shift=" + this.shift + ", colors=" + this.colors + ", contains=" + this.contains + ", values=" + this.values + ", money=" + this.money + ", imageId=" + this.imageId + ", desc=" + this.desc + ", descStore=" + this.descStore + ", specs=" + this.specs + ", isNew=" + this.isNew + ", rubles=" + this.rubles + ", closed=" + this.closed + ", salePercent=" + this.salePercent + ", saleTime=" + this.saleTime + ", assignedId=" + this.assignedId + ", upTag=" + this.upTag + ", category=" + this.category + ", limit=" + this.limit + ", isSelected=" + this.isSelected + ")";
    }

    public DonateItem(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable List<Float> list, @Nullable Integer num7, @Nullable Float f, @Nullable List<Float> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable List<Integer> list5, @Nullable Integer num8, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable ArrayList<Integer> arrayList, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.internalId = num;
        this.gameId = num2;
        this.header = str;
        this.headerStore = str2;
        this.subheader = str3;
        this.subheaderStore = str4;
        this.basePrice = num3;
        this.renderId = num4;
        this.count = num5;
        this.type = num6;
        this.rot = list;
        this.modelId = num7;
        this.modelZoom = f;
        this.shift = list2;
        this.colors = list3;
        this.contains = list4;
        this.values = list5;
        this.money = num8;
        this.imageId = str5;
        this.desc = str6;
        this.descStore = str7;
        this.specs = arrayList;
        this.isNew = num9;
        this.rubles = num10;
        this.closed = num11;
        this.salePercent = i;
        this.saleTime = i2;
        this.assignedId = i3;
        this.upTag = i4;
        this.category = i5;
        this.limit = i6;
        this.isSelected = z;
    }

    public /* synthetic */ DonateItem(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, Integer num4, Integer num5, Integer num6, List list, Integer num7, Float f, List list2, List list3, List list4, List list5, Integer num8, String str5, String str6, String str7, ArrayList arrayList, Integer num9, Integer num10, Integer num11, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : num2, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : num3, (i7 & 128) != 0 ? null : num4, (i7 & 256) != 0 ? null : num5, (i7 & 512) != 0 ? null : num6, (i7 & 1024) != 0 ? null : list, (i7 & 2048) != 0 ? null : num7, (i7 & 4096) != 0 ? null : f, (i7 & 8192) != 0 ? null : list2, (i7 & 16384) != 0 ? null : list3, (i7 & 32768) != 0 ? null : list4, (i7 & 65536) != 0 ? null : list5, (i7 & 131072) != 0 ? null : num8, (i7 & 262144) != 0 ? null : str5, (i7 & 524288) != 0 ? null : str6, (i7 & 1048576) != 0 ? null : str7, (i7 & 2097152) != 0 ? null : arrayList, (i7 & 4194304) != 0 ? null : num9, (i7 & 8388608) != 0 ? null : num10, (i7 & 16777216) != 0 ? null : num11, (i7 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? 0 : i, (i7 & 67108864) != 0 ? 0 : i2, (i7 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? 0 : i3, (i7 & 268435456) != 0 ? 0 : i4, (i7 & 536870912) != 0 ? 0 : i5, (i7 & 1073741824) != 0 ? -1 : i6, (i7 & Integer.MIN_VALUE) == 0 ? z : false);
    }

    @Nullable
    public final Integer getInternalId() {
        return this.internalId;
    }

    public final void setInternalId(@Nullable Integer num) {
        this.internalId = num;
    }

    @Nullable
    public final Integer getGameId() {
        return this.gameId;
    }

    public final void setGameId(@Nullable Integer num) {
        this.gameId = num;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    public final void setHeader(@Nullable String str) {
        this.header = str;
    }

    @Nullable
    public final String getHeaderStore() {
        return this.headerStore;
    }

    public final void setHeaderStore(@Nullable String str) {
        this.headerStore = str;
    }

    @Nullable
    public final String getSubheader() {
        return this.subheader;
    }

    public final void setSubheader(@Nullable String str) {
        this.subheader = str;
    }

    @Nullable
    public final String getSubheaderStore() {
        return this.subheaderStore;
    }

    public final void setSubheaderStore(@Nullable String str) {
        this.subheaderStore = str;
    }

    @Nullable
    public final Integer getBasePrice() {
        return this.basePrice;
    }

    public final void setBasePrice(@Nullable Integer num) {
        this.basePrice = num;
    }

    @Nullable
    public final Integer getRenderId() {
        return this.renderId;
    }

    public final void setRenderId(@Nullable Integer num) {
        this.renderId = num;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @Nullable
    public final List<Float> getRot() {
        return this.rot;
    }

    public final void setRot(@Nullable List<Float> list) {
        this.rot = list;
    }

    @Nullable
    public final Integer getModelId() {
        return this.modelId;
    }

    public final void setModelId(@Nullable Integer num) {
        this.modelId = num;
    }

    @Nullable
    public final Float getModelZoom() {
        return this.modelZoom;
    }

    public final void setModelZoom(@Nullable Float f) {
        this.modelZoom = f;
    }

    @Nullable
    public final List<Float> getShift() {
        return this.shift;
    }

    public final void setShift(@Nullable List<Float> list) {
        this.shift = list;
    }

    @Nullable
    public final List<Integer> getColors() {
        return this.colors;
    }

    public final void setColors(@Nullable List<Integer> list) {
        this.colors = list;
    }

    @Nullable
    public final List<Integer> getContains() {
        return this.contains;
    }

    public final void setContains(@Nullable List<Integer> list) {
        this.contains = list;
    }

    @Nullable
    public final List<Integer> getValues() {
        return this.values;
    }

    public final void setValues(@Nullable List<Integer> list) {
        this.values = list;
    }

    @Nullable
    public final Integer getMoney() {
        return this.money;
    }

    public final void setMoney(@Nullable Integer num) {
        this.money = num;
    }

    @Nullable
    public final String getImageId() {
        return this.imageId;
    }

    public final void setImageId(@Nullable String str) {
        this.imageId = str;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    @Nullable
    public final String getDescStore() {
        return this.descStore;
    }

    public final void setDescStore(@Nullable String str) {
        this.descStore = str;
    }

    @Nullable
    public final ArrayList<Integer> getSpecs() {
        return this.specs;
    }

    public final void setSpecs(@Nullable ArrayList<Integer> arrayList) {
        this.specs = arrayList;
    }

    @Nullable
    public final Integer isNew() {
        return this.isNew;
    }

    public final void setNew(@Nullable Integer num) {
        this.isNew = num;
    }

    @Nullable
    public final Integer getRubles() {
        return this.rubles;
    }

    public final void setRubles(@Nullable Integer num) {
        this.rubles = num;
    }

    @Nullable
    public final Integer getClosed() {
        return this.closed;
    }

    public final void setClosed(@Nullable Integer num) {
        this.closed = num;
    }

    public final int getSalePercent() {
        return this.salePercent;
    }

    public final void setSalePercent(int i) {
        this.salePercent = i;
    }

    public final int getSaleTime() {
        return this.saleTime;
    }

    public final void setSaleTime(int i) {
        this.saleTime = i;
    }

    public final int getAssignedId() {
        return this.assignedId;
    }

    public final void setAssignedId(int i) {
        this.assignedId = i;
    }

    public final int getUpTag() {
        return this.upTag;
    }

    public final void setUpTag(int i) {
        this.upTag = i;
    }

    public final int getCategory() {
        return this.category;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
