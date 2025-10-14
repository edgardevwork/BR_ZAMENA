package com.blackhub.bronline.game.gui.craft;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.ttml.TtmlParser;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId49;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.ButtonAnimatedAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftCraftingControl;
import com.blackhub.bronline.game.gui.craft.model.CraftDialogConfirmationAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftForcedTutorialAttachment;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.gui.craft.model.CraftScreenTypeObject;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonComponentItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItem;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategory;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.server.CraftComponentServerItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftItemsWithNotificationServerItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem;
import com.blackhub.bronline.game.gui.craft.model.server.CraftStorageServerItem;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CraftViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0%H\u0082@¢\u0006\u0002\u0010)JX\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010 2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00106J\u000e\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020(J>\u00109\u001a\u00020:2\u0006\u0010+\u001a\u00020,2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002010 2\u0006\u00102\u001a\u00020&2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010 2\u0006\u00103\u001a\u00020&H\u0002J.\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020@2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u00102\u001a\u00020&H\u0002J\u0006\u0010B\u001a\u00020\u0019J\u001c\u0010C\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020(2\b\b\u0002\u0010D\u001a\u00020&H\u0002J@\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020G2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\u0006\u00104\u001a\u0002052\f\u0010H\u001a\b\u0012\u0004\u0012\u00020#0 2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 J\u0006\u0010K\u001a\u00020\u0019J\u0006\u0010L\u001a\u00020\u0019J\u0006\u0010M\u001a\u00020\u0019J\u0010\u0010N\u001a\u00020\u00192\b\b\u0002\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020\u0019J\u0006\u0010R\u001a\u00020\u0019J\u0006\u0010S\u001a\u00020\u0019J\u0016\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020&J\u0006\u0010W\u001a\u00020\u0019J\u0006\u0010X\u001a\u00020\u0019J\u0006\u0010Y\u001a\u00020\u0019J\u0006\u0010Z\u001a\u00020\u0019J\u0006\u0010[\u001a\u00020\u0019J6\u0010\\\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010F\u001a\u00020G2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0]H\u0082@¢\u0006\u0002\u0010^J6\u0010_\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010F\u001a\u00020G2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0]H\u0082@¢\u0006\u0002\u0010^J\u0006\u0010`\u001a\u00020\u0019J\b\u0010a\u001a\u00020\u0019H\u0002J\u000e\u0010b\u001a\u00020\u00192\u0006\u00108\u001a\u00020(J\u0006\u0010c\u001a\u00020\u0019J.\u0010d\u001a\u00020\u00192\u0006\u0010e\u001a\u00020&2\b\b\u0002\u0010f\u001a\u00020g2\b\b\u0002\u0010h\u001a\u00020&2\b\b\u0002\u0010i\u001a\u00020&H\u0002J\u000e\u0010j\u001a\u00020\u00192\u0006\u0010k\u001a\u00020gJ\u0006\u0010l\u001a\u00020\u0019J\u000e\u0010m\u001a\u00020\u00192\u0006\u0010n\u001a\u00020PJ2\u0010o\u001a\b\u0012\u0004\u0012\u00020(0 2\u0010\b\u0002\u0010p\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010 2\u0010\b\u0002\u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010 H\u0002J\u0006\u0010s\u001a\u00020\u0019J\u0018\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020P2\u0006\u0010w\u001a\u00020(H\u0002J\u000e\u0010x\u001a\u00020\u00192\u0006\u0010F\u001a\u00020GR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006y"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/CraftViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/craft/CraftUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addItemForCrafting", "", "checkFilter", "filterCheckBox", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "closeDialogConfirmation", "closeForcedTutorial", "createCategories", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "listOfComponentItems", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategory;", "mapOfCraftElements", "", "", "", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCraftElement", "craftJsonItem", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItem;", "listOfCraftItems", "componentsArray", "Lcom/blackhub/bronline/game/gui/craft/model/server/CraftComponentServerItem;", "newItemsIdsList", "Lcom/blackhub/bronline/game/gui/craft/model/server/CraftItemsWithNotificationServerItem;", "levelOfSkill", "workbenchLevel", "vipProbAdd", "", "(Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItem;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteElementFromStash", "element", "determineElementState", "Lcom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum;", "newItemsArray", "componentsList", "Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "findCraftIngredient", "craftComponent", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonComponentItem;", "getLevelUpElementsList", "getOrAddElementForStorage", "getTextQuantityColor", "newValue", "initJson", "json", "Lorg/json/JSONObject;", "craftCategoriesModel", "craftCategoriesFilterModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonCategoryFilter;", "onActionCraftingClick", "onArrowBottomClick", "onArrowTopClick", "onButtonCraftClick", "isButtonsExpanded", "", "onButtonProgressClick", "onButtonStashClick", "onBuyVipClick", "onCategoryClick", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, FirebaseAnalytics.Param.INDEX, "onCloseDialogConfirmationClick", "onCloseHintsClick", "onCloseLevelUpDialog", "onDialogConfirmationClick", "onInfoButtonClicked", "parseListWithProductionItems", "", "(Lorg/json/JSONObject;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseListWithStorageItems", "refreshFilter", "returnToDefaultValueOldSelectedElement", "selectCraftElement", "sendCloseScreen", "showDialogConfirmation", "typeOfDialog", "nameOfSelectedElement", "", "idSelectedElement", "valueOfElements", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showOrHideFilter", "showSplit", "value", "sortingList", "selectedList", "filterList", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "subtractItemForCrafting", "updateCraftCraftingControl", "Lcom/blackhub/bronline/game/gui/craft/model/CraftCraftingControl;", "isAdd", "selectedItem", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 8 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1753:1\n76#2:1754\n96#2,2:1755\n98#2,3:1760\n766#3:1757\n857#3,2:1758\n1549#3:1798\n1620#3,3:1799\n1549#3:1802\n1620#3,3:1803\n1549#3:1806\n1620#3,3:1807\n1549#3:1819\n1620#3,3:1820\n1238#3,2:1825\n1549#3:1827\n1620#3,3:1828\n1241#3:1831\n533#3,6:1832\n1549#3:1838\n1620#3,3:1839\n1747#3,3:1842\n1549#3:1845\n1620#3,3:1846\n1549#3:1849\n1620#3,3:1850\n1747#3,3:1853\n1549#3:1866\n1620#3,3:1867\n1603#3,9:1895\n1855#3:1904\n1856#3:1907\n1612#3:1908\n1603#3,9:1934\n1855#3:1943\n1856#3:1945\n1612#3:1946\n1747#3,3:1952\n1549#3:1964\n1620#3,3:1965\n766#3:1978\n857#3,2:1979\n1549#3:1981\n1620#3,3:1982\n766#3:1985\n857#3,2:1986\n1549#3:1988\n1620#3,3:1989\n766#3:1992\n857#3,2:1993\n1549#3:1995\n1620#3,3:1996\n1549#3:1999\n1620#3,3:2000\n230#4,5:1763\n230#4,5:1768\n230#4,5:1773\n230#4,5:1778\n230#4,5:1783\n230#4,5:1788\n230#4,5:1793\n230#4,5:1856\n230#4,5:1861\n230#4,5:1947\n230#4,5:1968\n230#4,5:1973\n86#5,2:1810\n33#5,6:1812\n88#5:1818\n86#5,2:1955\n33#5,6:1957\n88#5:1963\n453#6:1823\n403#6:1824\n51#7,5:1870\n56#7,11:1884\n51#7,5:1909\n56#7,11:1923\n8#8,9:1875\n8#8,9:1914\n1#9:1905\n1#9:1906\n1#9:1944\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel\n*L\n639#1:1754\n639#1:1755,2\n639#1:1760,3\n640#1:1757\n640#1:1758,2\n877#1:1798\n877#1:1799,3\n884#1:1802\n884#1:1803,3\n891#1:1806\n891#1:1807,3\n984#1:1819\n984#1:1820,3\n995#1:1825,2\n996#1:1827\n996#1:1828,3\n995#1:1831\n1007#1:1832,6\n1013#1:1838\n1013#1:1839,3\n1023#1:1842,3\n1034#1:1845\n1034#1:1846,3\n1044#1:1849\n1044#1:1850,3\n1055#1:1853,3\n1357#1:1866\n1357#1:1867,3\n1410#1:1895,9\n1410#1:1904\n1410#1:1907\n1410#1:1908\n1439#1:1934,9\n1439#1:1943\n1439#1:1945\n1439#1:1946\n1532#1:1952,3\n1543#1:1964\n1543#1:1965,3\n1662#1:1978\n1662#1:1979,2\n1664#1:1981\n1664#1:1982,3\n1667#1:1985\n1667#1:1986,2\n1669#1:1988\n1669#1:1989,3\n1672#1:1992\n1672#1:1993,2\n1674#1:1995\n1674#1:1996,3\n1748#1:1999\n1748#1:2000,3\n710#1:1763,5\n718#1:1768,5\n726#1:1773,5\n734#1:1778,5\n762#1:1783,5\n798#1:1788,5\n835#1:1793,5\n1064#1:1856,5\n1337#1:1861,5\n1468#1:1947,5\n1631#1:1968,5\n1646#1:1973,5\n902#1:1810,2\n902#1:1812,6\n902#1:1818\n1534#1:1955,2\n1534#1:1957,6\n1534#1:1963\n995#1:1823\n995#1:1824\n1408#1:1870,5\n1408#1:1884,11\n1437#1:1909,5\n1437#1:1923,11\n1408#1:1875,9\n1437#1:1914,9\n1410#1:1906\n1439#1:1944\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel extends BaseViewModel<CraftUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CraftUiState> _uiState;

    @NotNull
    public final CraftActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<CraftUiState> uiState;

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CraftScreenTypeEnum.CRAFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CraftElementStatusEnum.values().length];
            try {
                iArr2[CraftElementStatusEnum.NEW_ELEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CraftElementStatusEnum.IN_THE_PIPELINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CraftElementStatusEnum.IN_THE_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel", m7120f = "CraftViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0}, m7122l = {1365}, m7123m = "createCraftElement", m7124n = {"this", "craftJsonItem", "newItemsIdsList", "levelOfSkill", "workbenchLevel", "vipProbAdd"}, m7125s = {"L$0", "L$1", "L$2", "I$0", "I$1", "F$0"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$createCraftElement$1 */
    public static final class C38421 extends ContinuationImpl {
        public float F$0;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C38421(Continuation<? super C38421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CraftViewModel.this.createCraftElement(null, null, null, null, 0, 0, 0.0f, this);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CraftViewModel(@NotNull CraftActionWithJSON actionWithJSON, @NotNull StringResource stringResources, @NotNull Application application, @NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.application = application;
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new CraftUiState(null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, null, null, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, 0, 0, false, null, false, null, false, -1, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<CraftUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CraftUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1", m7120f = "CraftViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m7122l = {164, 176, 178, MatroskaExtractor.ID_TRACK_NUMBER}, m7123m = "invokeSuspend", m7124n = {"componentsArray", "mapOfCraftElements", "craftJsonItem", "newItemsIdsList", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "listWithStorageItems", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "mapOfCraftElements", TtmlParser.ATTR_IMAGE, "listWithStorageItems", "listWithProductionItems", "filterList", "levelOfSkill", "percentOfSkill", "quantityInQueue", "queueMax", "quantityInStorage", "storageMax", "workbenchLevel", "valueOfRubles", "isPlayerHasVip", "quantityOfNewItemsInStorage", "isNeedToShowForcedTutorial", "isWithIndicationFilter"}, m7125s = {"L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "Z$0", "I$8", "Z$1", "I$9"})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n51#2,5:1754\n56#2,11:1768\n51#2,5:1779\n56#2,11:1793\n8#3,9:1759\n8#3,9:1784\n1855#4,2:1804\n1549#4:1806\n1620#4,2:1807\n1549#4:1809\n1620#4,3:1810\n1622#4:1813\n1747#4,3:1814\n288#4,2:1822\n533#4,6:1824\n11155#5:1817\n11266#5,4:1818\n230#6,5:1830\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$initJson$1\n*L\n136#1:1754,5\n136#1:1768,11\n140#1:1779,5\n140#1:1793,11\n136#1:1759,9\n140#1:1784,9\n149#1:1804,2\n179#1:1806\n179#1:1807,2\n180#1:1809\n180#1:1810,3\n179#1:1813\n212#1:1814,3\n247#1:1822,2\n248#1:1824,6\n231#1:1817\n231#1:1818,4\n254#1:1830,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1 */
    /* loaded from: classes.dex */
    public static final class C38451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<CraftJsonCategoryFilter> $craftCategoriesFilterModel;
        public final /* synthetic */ List<CraftJsonItemCategory> $craftCategoriesModel;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<CraftJsonItem> $listOfCraftItems;
        public final /* synthetic */ float $vipProbAdd;
        public float F$0;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public int I$8;
        public int I$9;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public final /* synthetic */ CraftViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38451(JSONObject jSONObject, List<CraftJsonItem> list, CraftViewModel craftViewModel, List<CraftJsonCategoryFilter> list2, List<CraftJsonItemCategory> list3, float f, Continuation<? super C38451> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$listOfCraftItems = list;
            this.this$0 = craftViewModel;
            this.$craftCategoriesFilterModel = list2;
            this.$craftCategoriesModel = list3;
            this.$vipProbAdd = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38451(this.$json, this.$listOfCraftItems, this.this$0, this.$craftCategoriesFilterModel, this.$craftCategoriesModel, this.$vipProbAdd, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x05fd  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x05ff  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x067d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:128:0x067e  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x06a4  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x06c2  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x06f1  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x06fb  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0769  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0788  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x07ab  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x07f9  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0829  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x082c  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0798 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x07bb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0242 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:213:0x02ca A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0238 A[Catch: Exception -> 0x0240, TRY_LEAVE, TryCatch #0 {Exception -> 0x0240, blocks: (B:22:0x01fc, B:34:0x0238, B:32:0x0227), top: B:172:0x01fc }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02c0 A[Catch: Exception -> 0x02c8, TRY_LEAVE, TryCatch #5 {Exception -> 0x02c8, blocks: (B:53:0x0284, B:65:0x02c0, B:63:0x02af), top: B:182:0x0284 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0442  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x04fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x04fd  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0537  */
        /* JADX WARN: Type inference failed for: r0v129, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r0v95, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v62, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r7v33, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x03fa -> B:84:0x0414). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<CraftJsonItemCategory> list;
            float f;
            int i;
            List listEmptyList;
            JSONArray jSONArrayOptJSONArray;
            List list2;
            List arrayList;
            String str;
            Object objFromJson;
            int i2;
            int i3;
            int i4;
            List<CraftJsonItem> list3;
            boolean z;
            final LinkedHashMap linkedHashMap;
            int i5;
            int i6;
            float f2;
            boolean z2;
            JSONObject jSONObject;
            Iterator it;
            int i7;
            CraftViewModel craftViewModel;
            List<CraftJsonItemCategory> list4;
            List list5;
            int i8;
            int i9;
            List<CraftJsonCategoryFilter> list6;
            List list7;
            int i10;
            Object objFromJson2;
            int i11;
            int i12;
            Object listWithStorageItems;
            Object obj2;
            int i13;
            JSONObject jSONObject2;
            int i14;
            int i15;
            List<CraftJsonItemCategory> list8;
            boolean z3;
            int i16;
            CraftViewModel craftViewModel2;
            boolean z4;
            int i17;
            int i18;
            int i19;
            LinkedHashMap linkedHashMap2;
            Bitmap bitmap;
            Object listWithProductionItems;
            Object obj3;
            Object obj4;
            List<CraftJsonItemCategory> list9;
            int i20;
            boolean z5;
            int i21;
            CraftViewModel craftViewModel3;
            int i22;
            List<CraftJsonCategoryFilter> list10;
            Bitmap bitmap2;
            int i23;
            int i24;
            List list11;
            LinkedHashMap linkedHashMap3;
            int i25;
            int i26;
            int i27;
            int i28;
            boolean z6;
            ArrayList arrayList2;
            Iterator it2;
            int i29;
            int i30;
            int i31;
            int i32;
            Object objCreateCategories;
            Object obj5;
            int i33;
            int i34;
            LinkedHashMap linkedHashMap4;
            int i35;
            int i36;
            List list12;
            int i37;
            boolean z7;
            List list13;
            int i38;
            int i39;
            boolean z8;
            int i40;
            CommonButtonCategory commonButtonCategory;
            CommonButtonCategory commonButtonCategory2;
            Bitmap bitmap3;
            CommonButtonCategory commonButtonCategory3;
            List listEmptyList2;
            List listSortingList;
            LinkedHashMap linkedHashMap5;
            List list14;
            boolean z9;
            int i41;
            List list15;
            ArrayList arrayList3;
            boolean z10;
            List listEmptyList3;
            Iterator it3;
            Object next;
            ListIterator listIterator;
            Object objPrevious;
            ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default;
            MutableStateFlow<CraftUiState> mutableStateFlow;
            CraftUiState value;
            CraftUiState craftUiState;
            CraftScreenTypeObject craftScreenTypeObject;
            CraftElement craftElement;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i42 = this.label;
            if (i42 == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject3 = this.$json;
                List<CraftJsonItem> list16 = this.$listOfCraftItems;
                CraftViewModel craftViewModel4 = this.this$0;
                List<CraftJsonCategoryFilter> list17 = this.$craftCategoriesFilterModel;
                List<CraftJsonItemCategory> list18 = this.$craftCategoriesModel;
                float f3 = this.$vipProbAdd;
                int iOptInt = jSONObject3.optInt(CraftKeys.LEVEL_OF_SKILL_KEY);
                int iOptInt2 = jSONObject3.optInt(CraftKeys.PERCENT_OF_SKILL_KEY);
                int iOptInt3 = jSONObject3.optInt("pc");
                int iOptInt4 = jSONObject3.optInt(CraftKeys.QUEUE_MAX_KEY);
                int iOptInt5 = jSONObject3.optInt("ps");
                int iOptInt6 = jSONObject3.optInt(CraftKeys.STORAGE_MAX_KEY);
                int iOptInt7 = jSONObject3.optInt(CraftKeys.WORKBENCH_LEVEL_KEY);
                int iOptInt8 = jSONObject3.optInt("vm");
                JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(CraftKeys.NEW_ITEMS_ARRAY_KEY);
                String str2 = "toString(...)";
                if (jSONArrayOptJSONArray2 != null) {
                    list = list18;
                    try {
                        listEmptyList = new ArrayList();
                        f = f3;
                        try {
                            int length = jSONArrayOptJSONArray2.length();
                            i = iOptInt;
                            int i43 = 0;
                            while (i43 < length) {
                                try {
                                    JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i43);
                                    Intrinsics.checkNotNull(jSONObject4);
                                    JSONArray jSONArray = jSONArrayOptJSONArray2;
                                    try {
                                        Gson gson = new Gson();
                                        String string = jSONObject4.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        i10 = length;
                                        try {
                                            objFromJson2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CraftItemsWithNotificationServerItem.class);
                                        } catch (Exception e) {
                                            e = e;
                                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                            firebaseCrashlytics.log(e.toString());
                                            firebaseCrashlytics.recordException(e);
                                            objFromJson2 = null;
                                            if (objFromJson2 == null) {
                                            }
                                            i43++;
                                            jSONArrayOptJSONArray2 = jSONArray;
                                            length = i10;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        i10 = length;
                                    }
                                    if (objFromJson2 == null) {
                                        Boxing.boxBoolean(listEmptyList.add(objFromJson2));
                                    }
                                    i43++;
                                    jSONArrayOptJSONArray2 = jSONArray;
                                    length = i10;
                                } catch (Exception e3) {
                                    e = e3;
                                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics2.log(e.toString());
                                    firebaseCrashlytics2.recordException(e);
                                    listEmptyList = null;
                                    if (listEmptyList == null) {
                                    }
                                    jSONArrayOptJSONArray = jSONObject3.optJSONArray(CraftKeys.COMPONENTS_ARRAY_KEY);
                                    if (jSONArrayOptJSONArray == null) {
                                    }
                                    arrayList = null;
                                    if (arrayList == null) {
                                    }
                                    boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                                    int iOptInt9 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                                    boolean zIsOne2 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    Iterator it4 = list16.iterator();
                                    i2 = iOptInt2;
                                    i3 = iOptInt3;
                                    i4 = iOptInt4;
                                    list3 = list16;
                                    z = zIsOne2;
                                    linkedHashMap = linkedHashMap6;
                                    i5 = iOptInt6;
                                    i6 = iOptInt8;
                                    f2 = f;
                                    z2 = zIsOne;
                                    jSONObject = jSONObject3;
                                    it = it4;
                                    i7 = iOptInt5;
                                    craftViewModel = craftViewModel4;
                                    list4 = list;
                                    list5 = arrayList;
                                    i8 = iOptInt9;
                                    i9 = iOptInt7;
                                    list6 = list17;
                                    list7 = list2;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i = iOptInt;
                            FirebaseCrashlytics firebaseCrashlytics22 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics22.log(e.toString());
                            firebaseCrashlytics22.recordException(e);
                            listEmptyList = null;
                            if (listEmptyList == null) {
                            }
                            jSONArrayOptJSONArray = jSONObject3.optJSONArray(CraftKeys.COMPONENTS_ARRAY_KEY);
                            if (jSONArrayOptJSONArray == null) {
                            }
                            arrayList = null;
                            if (arrayList == null) {
                            }
                            boolean zIsOne3 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                            int iOptInt92 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                            boolean zIsOne22 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                            LinkedHashMap linkedHashMap62 = new LinkedHashMap();
                            Iterator it42 = list16.iterator();
                            i2 = iOptInt2;
                            i3 = iOptInt3;
                            i4 = iOptInt4;
                            list3 = list16;
                            z = zIsOne22;
                            linkedHashMap = linkedHashMap62;
                            i5 = iOptInt6;
                            i6 = iOptInt8;
                            f2 = f;
                            z2 = zIsOne3;
                            jSONObject = jSONObject3;
                            it = it42;
                            i7 = iOptInt5;
                            craftViewModel = craftViewModel4;
                            list4 = list;
                            list5 = arrayList;
                            i8 = iOptInt92;
                            i9 = iOptInt7;
                            list6 = list17;
                            list7 = list2;
                            if (!it.hasNext()) {
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        f = f3;
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    jSONArrayOptJSONArray = jSONObject3.optJSONArray(CraftKeys.COMPONENTS_ARRAY_KEY);
                    if (jSONArrayOptJSONArray == null) {
                        try {
                            arrayList = new ArrayList();
                            int length2 = jSONArrayOptJSONArray.length();
                            list2 = listEmptyList;
                            int i44 = 0;
                            while (i44 < length2) {
                                try {
                                    JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i44);
                                    Intrinsics.checkNotNull(jSONObject5);
                                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                                    try {
                                        Gson gson2 = new Gson();
                                        String string2 = jSONObject5.toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, str2);
                                        str = str2;
                                        try {
                                            objFromJson = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) CraftComponentServerItem.class);
                                        } catch (Exception e6) {
                                            e = e6;
                                            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                            firebaseCrashlytics3.log(e.toString());
                                            firebaseCrashlytics3.recordException(e);
                                            objFromJson = null;
                                            if (objFromJson == null) {
                                            }
                                            i44++;
                                            jSONArrayOptJSONArray = jSONArray2;
                                            str2 = str;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        str = str2;
                                    }
                                    if (objFromJson == null) {
                                        Boxing.boxBoolean(arrayList.add(objFromJson));
                                    }
                                    i44++;
                                    jSONArrayOptJSONArray = jSONArray2;
                                    str2 = str;
                                } catch (Exception e8) {
                                    e = e8;
                                    FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics4.log(e.toString());
                                    firebaseCrashlytics4.recordException(e);
                                    arrayList = null;
                                    if (arrayList == null) {
                                    }
                                    boolean zIsOne32 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                                    int iOptInt922 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                                    boolean zIsOne222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                                    LinkedHashMap linkedHashMap622 = new LinkedHashMap();
                                    Iterator it422 = list16.iterator();
                                    i2 = iOptInt2;
                                    i3 = iOptInt3;
                                    i4 = iOptInt4;
                                    list3 = list16;
                                    z = zIsOne222;
                                    linkedHashMap = linkedHashMap622;
                                    i5 = iOptInt6;
                                    i6 = iOptInt8;
                                    f2 = f;
                                    z2 = zIsOne32;
                                    jSONObject = jSONObject3;
                                    it = it422;
                                    i7 = iOptInt5;
                                    craftViewModel = craftViewModel4;
                                    list4 = list;
                                    list5 = arrayList;
                                    i8 = iOptInt922;
                                    i9 = iOptInt7;
                                    list6 = list17;
                                    list7 = list2;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                        } catch (Exception e9) {
                            e = e9;
                            list2 = listEmptyList;
                        }
                        if (arrayList == null) {
                            arrayList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        boolean zIsOne322 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                        int iOptInt9222 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                        boolean zIsOne2222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                        LinkedHashMap linkedHashMap6222 = new LinkedHashMap();
                        Iterator it4222 = list16.iterator();
                        i2 = iOptInt2;
                        i3 = iOptInt3;
                        i4 = iOptInt4;
                        list3 = list16;
                        z = zIsOne2222;
                        linkedHashMap = linkedHashMap6222;
                        i5 = iOptInt6;
                        i6 = iOptInt8;
                        f2 = f;
                        z2 = zIsOne322;
                        jSONObject = jSONObject3;
                        it = it4222;
                        i7 = iOptInt5;
                        craftViewModel = craftViewModel4;
                        list4 = list;
                        list5 = arrayList;
                        i8 = iOptInt9222;
                        i9 = iOptInt7;
                        list6 = list17;
                        list7 = list2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        list2 = listEmptyList;
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    boolean zIsOne3222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                    int iOptInt92222 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                    boolean zIsOne22222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                    LinkedHashMap linkedHashMap62222 = new LinkedHashMap();
                    Iterator it42222 = list16.iterator();
                    i2 = iOptInt2;
                    i3 = iOptInt3;
                    i4 = iOptInt4;
                    list3 = list16;
                    z = zIsOne22222;
                    linkedHashMap = linkedHashMap62222;
                    i5 = iOptInt6;
                    i6 = iOptInt8;
                    f2 = f;
                    z2 = zIsOne3222;
                    jSONObject = jSONObject3;
                    it = it42222;
                    i7 = iOptInt5;
                    craftViewModel = craftViewModel4;
                    list4 = list;
                    list5 = arrayList;
                    i8 = iOptInt92222;
                    i9 = iOptInt7;
                    list6 = list17;
                    list7 = list2;
                    if (!it.hasNext()) {
                    }
                } else {
                    list = list18;
                    f = f3;
                    i = iOptInt;
                }
                listEmptyList = null;
                if (listEmptyList == null) {
                }
                jSONArrayOptJSONArray = jSONObject3.optJSONArray(CraftKeys.COMPONENTS_ARRAY_KEY);
                if (jSONArrayOptJSONArray == null) {
                }
                arrayList = null;
                if (arrayList == null) {
                }
                boolean zIsOne32222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt(CraftKeys.IS_PLAYER_HAS_VIP_KEY)));
                int iOptInt922222 = jSONObject3.optInt(CraftKeys.QUANTITY_OF_NEW_ITEMS_IN_STORAGE_KEY);
                boolean zIsOne222222 = IntExtensionKt.isOne(Boxing.boxInt(jSONObject3.optInt("i")));
                LinkedHashMap linkedHashMap622222 = new LinkedHashMap();
                Iterator it422222 = list16.iterator();
                i2 = iOptInt2;
                i3 = iOptInt3;
                i4 = iOptInt4;
                list3 = list16;
                z = zIsOne222222;
                linkedHashMap = linkedHashMap622222;
                i5 = iOptInt6;
                i6 = iOptInt8;
                f2 = f;
                z2 = zIsOne32222;
                jSONObject = jSONObject3;
                it = it422222;
                i7 = iOptInt5;
                craftViewModel = craftViewModel4;
                list4 = list;
                list5 = arrayList;
                i8 = iOptInt922222;
                i9 = iOptInt7;
                list6 = list17;
                list7 = list2;
                if (!it.hasNext()) {
                }
            } else {
                if (i42 != 1) {
                    if (i42 == 2) {
                        boolean z11 = this.Z$1;
                        int i45 = this.I$8;
                        boolean z12 = this.Z$0;
                        int i46 = this.I$7;
                        i11 = this.I$6;
                        int i47 = this.I$5;
                        int i48 = this.I$4;
                        int i49 = this.I$3;
                        int i50 = this.I$2;
                        int i51 = this.I$1;
                        int i52 = this.I$0;
                        Bitmap bitmap4 = (Bitmap) this.L$5;
                        ?? r15 = (Map) this.L$4;
                        list8 = (List) this.L$3;
                        List<CraftJsonCategoryFilter> list19 = (List) this.L$2;
                        JSONObject jSONObject6 = (JSONObject) this.L$1;
                        craftViewModel2 = (CraftViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        obj2 = coroutine_suspended;
                        bitmap = bitmap4;
                        i15 = i52;
                        i17 = i50;
                        i14 = i48;
                        i13 = i51;
                        i18 = i49;
                        i16 = i47;
                        i12 = i46;
                        z4 = z12;
                        linkedHashMap2 = r15;
                        list6 = list19;
                        z3 = z11;
                        jSONObject2 = jSONObject6;
                        i19 = i45;
                        listWithStorageItems = obj;
                        List list20 = (List) listWithStorageItems;
                        this.L$0 = craftViewModel2;
                        this.L$1 = list6;
                        this.L$2 = list8;
                        this.L$3 = linkedHashMap2;
                        this.L$4 = bitmap;
                        this.L$5 = list20;
                        this.I$0 = i15;
                        this.I$1 = i13;
                        this.I$2 = i17;
                        this.I$3 = i18;
                        this.I$4 = i14;
                        this.I$5 = i16;
                        this.I$6 = i11;
                        this.I$7 = i12;
                        this.Z$0 = z4;
                        Bitmap bitmap5 = bitmap;
                        this.I$8 = i19;
                        this.Z$1 = z3;
                        this.label = 3;
                        listWithProductionItems = craftViewModel2.parseListWithProductionItems(jSONObject2, linkedHashMap2, this);
                        obj3 = obj2;
                        if (listWithProductionItems != obj3) {
                            return obj3;
                        }
                        obj4 = obj3;
                        list9 = list8;
                        i20 = i18;
                        z5 = z3;
                        i21 = i19;
                        craftViewModel3 = craftViewModel2;
                        i22 = i16;
                        list10 = list6;
                        bitmap2 = bitmap5;
                        i23 = i12;
                        i24 = i15;
                        list11 = list20;
                        boolean z13 = z4;
                        linkedHashMap3 = linkedHashMap2;
                        i25 = i17;
                        i26 = i14;
                        i27 = i11;
                        i28 = i13;
                        z6 = z13;
                        List list21 = (List) listWithProductionItems;
                        List<CraftJsonCategoryFilter> list22 = list10;
                        boolean z14 = z6;
                        int i53 = i23;
                        int i54 = 10;
                        int i55 = i27;
                        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                        it2 = list22.iterator();
                        while (it2.hasNext()) {
                        }
                        int i56 = i20;
                        int i57 = i22;
                        int i58 = i26;
                        if (arrayList2.isEmpty()) {
                        }
                        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) objCreateCategories);
                        i40 = i32;
                        commonButtonCategory = (CommonButtonCategory) CollectionsKt___CollectionsKt.getOrNull(mutableList, 0);
                        if (commonButtonCategory == null) {
                        }
                        bitmap3 = bitmap2;
                        commonButtonCategory3 = commonButtonCategory2;
                        mutableList.set(0, commonButtonCategory3);
                        listEmptyList2 = (List) linkedHashMap4.get(CollectionsKt___CollectionsKt.minOrNull((Iterable) linkedHashMap4.keySet()));
                        if (listEmptyList2 == null) {
                        }
                        listSortingList = craftViewModel3.sortingList(listEmptyList2, arrayList2);
                        if (z8) {
                        }
                        it3 = list12.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                            }
                        }
                        boolean zIsNotNull = AnyExtensionKt.isNotNull(next);
                        listIterator = listEmptyList2.listIterator(listEmptyList2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                            }
                        }
                        buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(craftViewModel3.getUiState().getValue().getButtonAnimatedAttachment(), false, AnyExtensionKt.isNotNull(objPrevious), zIsNotNull, 1, null);
                        mutableStateFlow = craftViewModel3.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            craftUiState = value;
                            craftScreenTypeObject = new CraftScreenTypeObject(commonButtonCategory3.getIconCDN(), commonButtonCategory3.getCategoryName());
                            craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull(listSortingList);
                            if (craftElement == null) {
                            }
                        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : i31, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : i36, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : i35, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : i34, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : i38, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : i30, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : i39, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : z7, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : i41, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : linkedHashMap5, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : list12, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : list15, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : bitmap3, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : i33 != 0 ? z10 : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listSortingList, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : list14, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : commonButtonCategory3, (1019 & 1) != 0 ? craftUiState.filterList : arrayList3, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : i40, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : z9, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : listEmptyList3, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                        return Unit.INSTANCE;
                    }
                    if (i42 != 3) {
                        if (i42 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i59 = this.I$9;
                        boolean z15 = this.Z$1;
                        int i60 = this.I$8;
                        boolean z16 = this.Z$0;
                        int i61 = this.I$7;
                        int i62 = this.I$6;
                        i39 = this.I$5;
                        i30 = this.I$4;
                        int i63 = this.I$3;
                        int i64 = this.I$2;
                        int i65 = this.I$1;
                        int i66 = this.I$0;
                        ?? r7 = (List) this.L$5;
                        List list23 = (List) this.L$4;
                        list12 = (List) this.L$3;
                        Bitmap bitmap6 = (Bitmap) this.L$2;
                        ?? r0 = (Map) this.L$1;
                        CraftViewModel craftViewModel5 = (CraftViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        i34 = i64;
                        i35 = i65;
                        i36 = i66;
                        i33 = i59;
                        bitmap2 = bitmap6;
                        i32 = i61;
                        i38 = i63;
                        i37 = i60;
                        i31 = i62;
                        z8 = z15;
                        arrayList2 = r7;
                        objCreateCategories = obj;
                        list13 = list23;
                        z7 = z16;
                        craftViewModel3 = craftViewModel5;
                        linkedHashMap4 = r0;
                        List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) objCreateCategories);
                        i40 = i32;
                        commonButtonCategory = (CommonButtonCategory) CollectionsKt___CollectionsKt.getOrNull(mutableList2, 0);
                        if (commonButtonCategory == null || (commonButtonCategory2 = CommonButtonCategory.copy$default(commonButtonCategory, 0, null, null, true, false, null, null, 119, null)) == null) {
                            commonButtonCategory2 = new CommonButtonCategory(0, null, null, false, false, null, null, 127, null);
                        }
                        bitmap3 = bitmap2;
                        commonButtonCategory3 = commonButtonCategory2;
                        mutableList2.set(0, commonButtonCategory3);
                        listEmptyList2 = (List) linkedHashMap4.get(CollectionsKt___CollectionsKt.minOrNull((Iterable) linkedHashMap4.keySet()));
                        if (listEmptyList2 == null) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        listSortingList = craftViewModel3.sortingList(listEmptyList2, arrayList2);
                        if (z8) {
                            z9 = z8;
                            arrayList3 = arrayList2;
                            String[] stringArray = craftViewModel3.application.getResources().getStringArray(R.array.craft_forced_tutorial_title);
                            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                            list14 = mutableList2;
                            listEmptyList3 = new ArrayList(stringArray.length);
                            int length3 = stringArray.length;
                            list15 = list13;
                            int i67 = 0;
                            int i68 = 0;
                            while (i67 < length3) {
                                int i69 = length3;
                                String str3 = stringArray[i67];
                                String[] strArr = stringArray;
                                int i70 = i68 + 1;
                                Intrinsics.checkNotNull(str3);
                                listEmptyList3.add(new CraftForcedTutorialAttachment(str3, BitmapUtilsKt.getBitmapFromZip$default(craftViewModel3.application, PngConstantsId49.INSTANCE.getActualNameOfImageForForcedTutorial(i70), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null)));
                                i67++;
                                i68 = i70;
                                length3 = i69;
                                stringArray = strArr;
                                linkedHashMap4 = linkedHashMap4;
                                i37 = i37;
                            }
                            linkedHashMap5 = linkedHashMap4;
                            i41 = i37;
                            z10 = true;
                        } else {
                            linkedHashMap5 = linkedHashMap4;
                            list14 = mutableList2;
                            z9 = z8;
                            i41 = i37;
                            list15 = list13;
                            arrayList3 = arrayList2;
                            z10 = true;
                            listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        it3 = list12.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (((CraftElement) next).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                                break;
                            }
                        }
                        boolean zIsNotNull2 = AnyExtensionKt.isNotNull(next);
                        listIterator = listEmptyList2.listIterator(listEmptyList2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            if (((CraftElement) objPrevious).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                                break;
                            }
                        }
                        buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(craftViewModel3.getUiState().getValue().getButtonAnimatedAttachment(), false, AnyExtensionKt.isNotNull(objPrevious), zIsNotNull2, 1, null);
                        mutableStateFlow = craftViewModel3.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            craftUiState = value;
                            craftScreenTypeObject = new CraftScreenTypeObject(commonButtonCategory3.getIconCDN(), commonButtonCategory3.getCategoryName());
                            craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull(listSortingList);
                            if (craftElement == null) {
                                craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                            }
                        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : i31, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : i36, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : i35, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : i34, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : i38, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : i30, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : i39, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : z7, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : i41, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : linkedHashMap5, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : list12, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : list15, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : bitmap3, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : i33 != 0 ? z10 : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listSortingList, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : list14, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : commonButtonCategory3, (1019 & 1) != 0 ? craftUiState.filterList : arrayList3, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : i40, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : z9, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : listEmptyList3, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                        return Unit.INSTANCE;
                    }
                    boolean z17 = this.Z$1;
                    int i71 = this.I$8;
                    boolean z18 = this.Z$0;
                    int i72 = this.I$7;
                    int i73 = this.I$6;
                    int i74 = this.I$5;
                    int i75 = this.I$4;
                    int i76 = this.I$3;
                    int i77 = this.I$2;
                    int i78 = this.I$1;
                    int i79 = this.I$0;
                    list11 = (List) this.L$5;
                    bitmap2 = (Bitmap) this.L$4;
                    ?? r3 = (Map) this.L$3;
                    List<CraftJsonItemCategory> list24 = (List) this.L$2;
                    List<CraftJsonCategoryFilter> list25 = (List) this.L$1;
                    CraftViewModel craftViewModel6 = (CraftViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj4 = coroutine_suspended;
                    listWithProductionItems = obj;
                    craftViewModel3 = craftViewModel6;
                    list10 = list25;
                    i21 = i71;
                    linkedHashMap3 = r3;
                    i20 = i76;
                    i23 = i72;
                    z6 = z18;
                    i25 = i77;
                    i27 = i73;
                    i28 = i78;
                    i22 = i74;
                    i24 = i79;
                    i26 = i75;
                    z5 = z17;
                    list9 = list24;
                    List list212 = (List) listWithProductionItems;
                    List<CraftJsonCategoryFilter> list222 = list10;
                    boolean z142 = z6;
                    int i532 = i23;
                    int i542 = 10;
                    int i552 = i27;
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list222, 10));
                    it2 = list222.iterator();
                    while (it2.hasNext()) {
                        CraftJsonCategoryFilter craftJsonCategoryFilter = (CraftJsonCategoryFilter) it2.next();
                        Iterator it5 = it2;
                        List<CraftJsonItemCategoryFilter> filters = craftJsonCategoryFilter.getFilters();
                        int i80 = i22;
                        int i81 = i26;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filters, i542));
                        Iterator it6 = filters.iterator();
                        while (it6.hasNext()) {
                            CraftJsonItemCategoryFilter craftJsonItemCategoryFilter = (CraftJsonItemCategoryFilter) it6.next();
                            int filterId = craftJsonItemCategoryFilter.getFilterId();
                            Iterator it7 = it6;
                            StringBuilder sb = new StringBuilder();
                            int i82 = i20;
                            sb.append(CraftViewModelKt.PREFIX_FOR_FILTER);
                            sb.append(filterId);
                            String string3 = sb.toString();
                            boolean zIsOne4 = IntExtensionKt.isOne(Boxing.boxInt(craftViewModel3.preferencesRepository.getInteger(string3, 0)));
                            int filterId2 = craftJsonItemCategoryFilter.getFilterId();
                            arrayList4.add(new CraftItemCategoryFilter(craftJsonItemCategoryFilter.getFilterId(), craftJsonItemCategoryFilter.getFilterName(), ColorKt.Color(Color.parseColor(craftJsonItemCategoryFilter.getColor())), craftJsonCategoryFilter.getCategoryFilterId(), string3, (filterId2 == 6 || filterId2 == 7) ? R.dimen._50wdp : R.dimen._1wdp, zIsOne4, null, 128, null));
                            it6 = it7;
                            i20 = i82;
                        }
                        arrayList2.add(new CraftCategoryFilter(craftJsonCategoryFilter.getCategoryFilterId(), craftJsonCategoryFilter.getCategoryFilterName(), arrayList4));
                        it2 = it5;
                        i22 = i80;
                        i26 = i81;
                        i20 = i20;
                        i542 = 10;
                    }
                    int i562 = i20;
                    int i572 = i22;
                    int i582 = i26;
                    if (arrayList2.isEmpty()) {
                        Iterator it8 = arrayList2.iterator();
                        loop6: while (it8.hasNext()) {
                            List<CraftItemCategoryFilter> filters2 = ((CraftCategoryFilter) it8.next()).getFilters();
                            if (!(filters2 instanceof Collection) || !filters2.isEmpty()) {
                                Iterator it9 = filters2.iterator();
                                while (it9.hasNext()) {
                                    if (((CraftItemCategoryFilter) it9.next()).getStateOfCheckBox()) {
                                        i29 = 1;
                                        break loop6;
                                    }
                                }
                            }
                        }
                        i29 = 0;
                        this.L$0 = craftViewModel3;
                        this.L$1 = linkedHashMap3;
                        this.L$2 = bitmap2;
                        this.L$3 = list11;
                        this.L$4 = list212;
                        this.L$5 = arrayList2;
                        this.I$0 = i24;
                        this.I$1 = i28;
                        this.I$2 = i25;
                        this.I$3 = i562;
                        i30 = i582;
                        this.I$4 = i30;
                        this.I$5 = i572;
                        i31 = i552;
                        this.I$6 = i31;
                        i32 = i532;
                        this.I$7 = i32;
                        this.Z$0 = z142;
                        this.I$8 = i21;
                        this.Z$1 = z5;
                        this.I$9 = i29;
                        this.label = 4;
                        objCreateCategories = craftViewModel3.createCategories(list9, linkedHashMap3, this);
                        obj5 = obj4;
                        if (objCreateCategories != obj5) {
                        }
                    } else {
                        i29 = 0;
                        this.L$0 = craftViewModel3;
                        this.L$1 = linkedHashMap3;
                        this.L$2 = bitmap2;
                        this.L$3 = list11;
                        this.L$4 = list212;
                        this.L$5 = arrayList2;
                        this.I$0 = i24;
                        this.I$1 = i28;
                        this.I$2 = i25;
                        this.I$3 = i562;
                        i30 = i582;
                        this.I$4 = i30;
                        this.I$5 = i572;
                        i31 = i552;
                        this.I$6 = i31;
                        i32 = i532;
                        this.I$7 = i32;
                        this.Z$0 = z142;
                        this.I$8 = i21;
                        this.Z$1 = z5;
                        this.I$9 = i29;
                        this.label = 4;
                        objCreateCategories = craftViewModel3.createCategories(list9, linkedHashMap3, this);
                        obj5 = obj4;
                        if (objCreateCategories != obj5) {
                            return obj5;
                        }
                        i33 = i29;
                        i34 = i25;
                        linkedHashMap4 = linkedHashMap3;
                        i35 = i28;
                        i36 = i24;
                        list12 = list11;
                        i37 = i21;
                        z7 = z142;
                        list13 = list212;
                        i38 = i562;
                        i39 = i572;
                        z8 = z5;
                    }
                    List mutableList22 = CollectionsKt___CollectionsKt.toMutableList((Collection) objCreateCategories);
                    i40 = i32;
                    commonButtonCategory = (CommonButtonCategory) CollectionsKt___CollectionsKt.getOrNull(mutableList22, 0);
                    if (commonButtonCategory == null) {
                        commonButtonCategory2 = new CommonButtonCategory(0, null, null, false, false, null, null, 127, null);
                    }
                    bitmap3 = bitmap2;
                    commonButtonCategory3 = commonButtonCategory2;
                    mutableList22.set(0, commonButtonCategory3);
                    listEmptyList2 = (List) linkedHashMap4.get(CollectionsKt___CollectionsKt.minOrNull((Iterable) linkedHashMap4.keySet()));
                    if (listEmptyList2 == null) {
                    }
                    listSortingList = craftViewModel3.sortingList(listEmptyList2, arrayList2);
                    if (z8) {
                    }
                    it3 = list12.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                        }
                    }
                    boolean zIsNotNull22 = AnyExtensionKt.isNotNull(next);
                    listIterator = listEmptyList2.listIterator(listEmptyList2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                        }
                    }
                    buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(craftViewModel3.getUiState().getValue().getButtonAnimatedAttachment(), false, AnyExtensionKt.isNotNull(objPrevious), zIsNotNull22, 1, null);
                    mutableStateFlow = craftViewModel3.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        craftUiState = value;
                        craftScreenTypeObject = new CraftScreenTypeObject(commonButtonCategory3.getIconCDN(), commonButtonCategory3.getCategoryName());
                        craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull(listSortingList);
                        if (craftElement == null) {
                        }
                    } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : i31, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : i36, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : i35, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : i34, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : i38, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : i30, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : i39, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : z7, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : i41, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : linkedHashMap5, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : list12, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : list15, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : bitmap3, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : i33 != 0 ? z10 : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listSortingList, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : list14, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : commonButtonCategory3, (1019 & 1) != 0 ? craftUiState.filterList : arrayList3, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : i40, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : z9, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : listEmptyList3, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                    return Unit.INSTANCE;
                }
                boolean z19 = this.Z$1;
                int i83 = this.I$8;
                boolean z20 = this.Z$0;
                i6 = this.I$7;
                int i84 = this.I$6;
                int i85 = this.I$5;
                int i86 = this.I$4;
                int i87 = this.I$3;
                int i88 = this.I$2;
                int i89 = this.I$1;
                int i90 = this.I$0;
                float f4 = this.F$0;
                List list26 = (List) this.L$9;
                CraftJsonItem craftJsonItem = (CraftJsonItem) this.L$8;
                Iterator it10 = (Iterator) this.L$7;
                ?? r02 = (Map) this.L$6;
                List list27 = (List) this.L$5;
                List<CraftJsonItemCategory> list28 = (List) this.L$4;
                List<CraftJsonCategoryFilter> list29 = (List) this.L$3;
                JSONObject jSONObject7 = (JSONObject) this.L$2;
                CraftViewModel craftViewModel7 = (CraftViewModel) this.L$1;
                List<CraftJsonItem> list30 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                List<CraftJsonItem> list31 = list30;
                boolean z21 = z20;
                i5 = i85;
                i4 = i87;
                i3 = i88;
                i2 = i89;
                int i91 = i90;
                z = z19;
                Iterator it11 = it10;
                linkedHashMap = r02;
                List list32 = list27;
                list4 = list28;
                craftViewModel = craftViewModel7;
                i8 = i83;
                int i92 = i86;
                f2 = f4;
                list7 = list26;
                list6 = list29;
                jSONObject = jSONObject7;
                Object obj6 = coroutine_suspended;
                final CraftJsonItem craftJsonItem2 = craftJsonItem;
                Object objAwait = obj;
                final CraftElement craftElement2 = (CraftElement) objAwait;
                BooleanExtensionKt.ifTrue(Boxing.boxBoolean(IntExtensionKt.isOne(Boxing.boxInt(craftJsonItem2.isVisible()))), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        List<CraftElement> list33 = linkedHashMap.get(Integer.valueOf(craftJsonItem2.getItemCategory()));
                        if (list33 != null) {
                            list33.add(craftElement2);
                        }
                    }
                });
                it = it11;
                i9 = i84;
                coroutine_suspended = obj6;
                i = i91;
                i7 = i92;
                z2 = z21;
                list5 = list32;
                list3 = list31;
                if (!it.hasNext()) {
                    Object obj7 = coroutine_suspended;
                    CraftJsonItem craftJsonItem3 = (CraftJsonItem) it.next();
                    int i93 = i7;
                    int i94 = i5;
                    linkedHashMap.putIfAbsent(Boxing.boxInt(craftJsonItem3.getItemCategory()), new ArrayList());
                    int i95 = i9;
                    int i96 = i6;
                    z21 = z2;
                    int i97 = i8;
                    list32 = list5;
                    list31 = list3;
                    boolean z22 = z;
                    LinkedHashMap linkedHashMap7 = linkedHashMap;
                    List<CraftJsonItemCategory> list33 = list4;
                    Iterator it12 = it;
                    Deferred deferredAsyncOnDefault$default = ViewModelExtensionKt.asyncOnDefault$default(craftViewModel, null, new CraftViewModel$initJson$1$1$1$craftElement$1(craftViewModel, craftJsonItem3, list3, list5, list7, i, i95, f2, null), 1, null);
                    this.L$0 = list31;
                    this.L$1 = craftViewModel;
                    this.L$2 = jSONObject;
                    this.L$3 = list6;
                    this.L$4 = list33;
                    this.L$5 = list32;
                    this.L$6 = linkedHashMap7;
                    this.L$7 = it12;
                    this.L$8 = craftJsonItem3;
                    List list34 = list7;
                    this.L$9 = list34;
                    float f5 = f2;
                    this.F$0 = f5;
                    i91 = i;
                    this.I$0 = i91;
                    int i98 = i2;
                    this.I$1 = i98;
                    int i99 = i3;
                    this.I$2 = i99;
                    int i100 = i4;
                    this.I$3 = i100;
                    this.I$4 = i93;
                    this.I$5 = i94;
                    i84 = i95;
                    this.I$6 = i84;
                    this.I$7 = i96;
                    this.Z$0 = z21;
                    this.I$8 = i97;
                    this.Z$1 = z22;
                    this.label = 1;
                    objAwait = deferredAsyncOnDefault$default.await(this);
                    obj6 = obj7;
                    if (objAwait == obj6) {
                        return obj6;
                    }
                    i4 = i100;
                    i92 = i93;
                    i5 = i94;
                    i6 = i96;
                    i2 = i98;
                    i3 = i99;
                    i8 = i97;
                    z = z22;
                    linkedHashMap = linkedHashMap7;
                    craftJsonItem2 = craftJsonItem3;
                    list4 = list33;
                    it11 = it12;
                    list7 = list34;
                    f2 = f5;
                    final CraftElement craftElement22 = (CraftElement) objAwait;
                    BooleanExtensionKt.ifTrue(Boxing.boxBoolean(IntExtensionKt.isOne(Boxing.boxInt(craftJsonItem2.isVisible()))), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$initJson$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List<CraftElement> list332 = linkedHashMap.get(Integer.valueOf(craftJsonItem2.getItemCategory()));
                            if (list332 != null) {
                                list332.add(craftElement22);
                            }
                        }
                    });
                    it = it11;
                    i9 = i84;
                    coroutine_suspended = obj6;
                    i = i91;
                    i7 = i92;
                    z2 = z21;
                    list5 = list32;
                    list3 = list31;
                    if (!it.hasNext()) {
                        int i101 = i;
                        Object obj8 = coroutine_suspended;
                        boolean z23 = z2;
                        int i102 = i8;
                        boolean z24 = z;
                        LinkedHashMap linkedHashMap8 = linkedHashMap;
                        List<CraftJsonItemCategory> list35 = list4;
                        int i103 = i3;
                        int i104 = i2;
                        i11 = i9;
                        i12 = i6;
                        int i105 = i5;
                        int i106 = i7;
                        int i107 = i4;
                        Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(craftViewModel.application, PngConstantsId49.BG_IMAGE_NAME, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                        this.L$0 = craftViewModel;
                        this.L$1 = jSONObject;
                        this.L$2 = list6;
                        this.L$3 = list35;
                        this.L$4 = linkedHashMap8;
                        this.L$5 = bitmapFromZip$default;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.I$0 = i101;
                        this.I$1 = i104;
                        this.I$2 = i103;
                        this.I$3 = i107;
                        this.I$4 = i106;
                        this.I$5 = i105;
                        this.I$6 = i11;
                        this.I$7 = i12;
                        this.Z$0 = z23;
                        this.I$8 = i102;
                        this.Z$1 = z24;
                        this.label = 2;
                        listWithStorageItems = craftViewModel.parseListWithStorageItems(jSONObject, linkedHashMap8, this);
                        if (listWithStorageItems == obj8) {
                            return obj8;
                        }
                        obj2 = obj8;
                        i13 = i104;
                        jSONObject2 = jSONObject;
                        i14 = i106;
                        i15 = i101;
                        list8 = list35;
                        z3 = z24;
                        i16 = i105;
                        craftViewModel2 = craftViewModel;
                        z4 = z23;
                        i17 = i103;
                        i18 = i107;
                        i19 = i102;
                        linkedHashMap2 = linkedHashMap8;
                        bitmap = bitmapFromZip$default;
                        List list202 = (List) listWithStorageItems;
                        this.L$0 = craftViewModel2;
                        this.L$1 = list6;
                        this.L$2 = list8;
                        this.L$3 = linkedHashMap2;
                        this.L$4 = bitmap;
                        this.L$5 = list202;
                        this.I$0 = i15;
                        this.I$1 = i13;
                        this.I$2 = i17;
                        this.I$3 = i18;
                        this.I$4 = i14;
                        this.I$5 = i16;
                        this.I$6 = i11;
                        this.I$7 = i12;
                        this.Z$0 = z4;
                        Bitmap bitmap52 = bitmap;
                        this.I$8 = i19;
                        this.Z$1 = z3;
                        this.label = 3;
                        listWithProductionItems = craftViewModel2.parseListWithProductionItems(jSONObject2, linkedHashMap2, this);
                        obj3 = obj2;
                        if (listWithProductionItems != obj3) {
                        }
                    }
                }
            }
        }
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<CraftJsonItem> listOfCraftItems, float vipProbAdd, @NotNull List<CraftJsonItemCategory> craftCategoriesModel, @NotNull List<CraftJsonCategoryFilter> craftCategoriesFilterModel) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfCraftItems, "listOfCraftItems");
        Intrinsics.checkNotNullParameter(craftCategoriesModel, "craftCategoriesModel");
        Intrinsics.checkNotNullParameter(craftCategoriesFilterModel, "craftCategoriesFilterModel");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38451(json, listOfCraftItems, this, craftCategoriesFilterModel, craftCategoriesModel, vipProbAdd, null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1", m7120f = "CraftViewModel.kt", m7121i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m7122l = {353, 590, 599}, m7123m = "invokeSuspend", m7124n = {"newMap", "money", "id", CatchStreamerKeys.COUNT_KEY, "listOfLevelUpElements", "newMapWithItems", "newMapWithFlattenedItems", "levelOfSkill", "isNeedToShowLevelUpDialog", "queueMax", "quantityInStorage", "storageMax", "quantityInQueue", "percentOfSkill", "listOfLevelUpElements", "newMapWithItems", "listWithStorageItems", "levelOfSkill", "isNeedToShowLevelUpDialog", "queueMax", "quantityInStorage", "storageMax", "quantityInQueue", "percentOfSkill"}, m7125s = {"L$0", "I$0", "I$1", "I$2", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 7 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 8 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,1753:1\n1#2:1754\n1360#3:1755\n1446#3,5:1756\n1179#3,2:1761\n1253#3,4:1763\n1238#3,2:1775\n1549#3:1777\n1620#3,2:1778\n1549#3:1780\n1620#3,3:1781\n1622#3:1793\n1241#3:1794\n1549#3:1795\n1620#3,3:1796\n766#3:1804\n857#3,2:1805\n1194#3,2:1852\n1222#3,4:1854\n1238#3,2:1860\n1549#3:1862\n1620#3,2:1863\n1549#3:1865\n1620#3,3:1866\n1622#3:1878\n1241#3:1879\n1238#3,2:1917\n1549#3:1919\n1620#3,2:1920\n1747#3,3:1922\n1622#3:1925\n1241#3:1926\n1194#3,2:1927\n1222#3,4:1929\n1549#3:1933\n1620#3,3:1934\n288#3,2:1937\n33#4,6:1767\n86#4,2:1784\n33#4,6:1786\n88#4:1792\n86#4,2:1869\n33#4,6:1871\n88#4:1877\n453#5:1773\n403#5:1774\n453#5:1858\n403#5:1859\n453#5:1915\n403#5:1916\n230#6,5:1799\n230#6,5:1807\n230#6,5:1812\n230#6,5:1817\n230#6,5:1822\n230#6,5:1880\n230#6,5:1885\n230#6,5:1939\n51#7,5:1827\n56#7,11:1841\n51#7,5:1890\n56#7,11:1904\n8#8,9:1832\n8#8,9:1895\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$updateJson$1\n*L\n311#1:1755\n311#1:1756,5\n312#1:1761,2\n312#1:1763,4\n324#1:1775,2\n325#1:1777\n325#1:1778,2\n327#1:1780\n327#1:1781,3\n325#1:1793\n324#1:1794\n355#1:1795\n355#1:1796,3\n413#1:1804\n413#1:1805,2\n465#1:1852,2\n465#1:1854,4\n493#1:1860,2\n494#1:1862\n494#1:1863,2\n496#1:1865\n496#1:1866,3\n494#1:1878\n493#1:1879\n575#1:1917,2\n576#1:1919\n576#1:1920,2\n577#1:1922,3\n576#1:1925\n575#1:1926\n587#1:1927,2\n587#1:1929,4\n591#1:1933\n591#1:1934,3\n601#1:1937,2\n315#1:1767,6\n336#1:1784,2\n336#1:1786,6\n336#1:1792\n502#1:1869,2\n502#1:1871,6\n502#1:1877\n324#1:1773\n324#1:1774\n493#1:1858\n493#1:1859\n575#1:1915\n575#1:1916\n394#1:1799,5\n418#1:1807,5\n426#1:1812,5\n439#1:1817,5\n448#1:1822,5\n517#1:1880,5\n528#1:1885,5\n614#1:1939,5\n464#1:1827,5\n464#1:1841,11\n569#1:1890,5\n569#1:1904,11\n464#1:1832,9\n569#1:1895,9\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1 */
    /* loaded from: classes.dex */
    public static final class C38601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ CraftViewModel this$0;

        /* compiled from: CraftViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CraftScreenTypeEnum.values().length];
                try {
                    iArr[CraftScreenTypeEnum.CRAFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CraftScreenTypeEnum.STASH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38601(JSONObject jSONObject, CraftViewModel craftViewModel, Continuation<? super C38601> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = craftViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38601(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0351 A[LOOP:7: B:131:0x034b->B:133:0x0351, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x038b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x038c  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0440 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0453  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x04a1  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x04b3  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x04eb  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x04fd  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0500  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x05db  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0600 A[LOOP:12: B:212:0x05fa->B:214:0x0600, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0790  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0805  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x0d0e  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x0da0  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x0db0  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0dea  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x0dfd  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0e3b  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x0e3e  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x0e78  */
        /* JADX WARN: Removed duplicated region for block: B:409:0x0469 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:422:0x0df8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:433:0x0214 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x020a A[Catch: Exception -> 0x0212, TRY_LEAVE, TryCatch #6 {Exception -> 0x0212, blocks: (B:79:0x01ce, B:91:0x020a, B:89:0x01f9), top: B:406:0x01ce }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iOptInt;
            int iOptInt2;
            int iOptInt3;
            Object next;
            Object listWithProductionItems;
            Map map;
            CraftElementStatusEnum elementState;
            CraftIngredient craftIngredientCopy;
            List<CraftIngredient> componentsList;
            CraftUiState value;
            CraftUiState craftUiState;
            CraftUiState value2;
            CraftUiState craftUiState2;
            CraftUiState value3;
            CraftUiState craftUiState3;
            CraftUiState value4;
            CraftUiState craftUiState4;
            List listEmptyList;
            Object objFromJson;
            Iterator<T> it;
            CraftUiState value5;
            CraftUiState craftUiState5;
            CraftUiState value6;
            CraftUiState craftUiState6;
            CraftElementStatusEnum craftElementStatusEnum;
            CraftIngredient craftIngredientCopy2;
            JSONObject jSONObject;
            CraftViewModel craftViewModel;
            int iIntValue;
            List<CraftElement> listOfLevelUpElements;
            Object obj2;
            int i;
            List arrayList;
            JSONArray jSONArray;
            Object objFromJson2;
            int i2;
            Map<Integer, List<CraftElement>> mapOfCraftElements;
            Iterator it2;
            int i3;
            Object listWithStorageItems;
            Object obj3;
            int i4;
            int i5;
            int i6;
            int i7;
            Map map2;
            List<CraftElement> list;
            Map<Integer, List<CraftElement>> map3;
            int i8;
            List list2;
            ArrayList arrayList2;
            int quantityInQueue;
            int i9;
            List listEmptyList2;
            Iterator it3;
            Object next2;
            CraftElement craftElement;
            CraftCraftingControl craftCraftingControlCopy;
            MutableStateFlow<CraftUiState> mutableStateFlow;
            CraftUiState value7;
            CraftUiState craftUiState7;
            Object next3;
            Collection collection;
            Object obj4;
            Collection collection2;
            List<CraftElement> list3;
            Object listWithProductionItems2;
            Object obj5;
            Map<Integer, List<CraftElement>> map4;
            CraftViewModel craftViewModel2;
            CraftElement craftElementCopy;
            List<CraftElement> list4;
            Iterator it4;
            Object obj6;
            ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default;
            int i10;
            List<CraftElement> list5;
            MutableStateFlow<CraftUiState> mutableStateFlow2;
            CraftUiState value8;
            CraftUiState craftUiState8;
            Iterator it5;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                int iOptInt4 = this.$json.optInt("t");
                if (iOptInt4 != 1) {
                    if (iOptInt4 == 3) {
                        int iOptInt5 = this.$json.optInt("id", -1);
                        if (iOptInt5 >= 0) {
                            List<CraftElement> listWithStorageItems2 = this.this$0.getUiState().getValue().getListWithStorageItems();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj7 : listWithStorageItems2) {
                                if (((CraftElement) obj7).getServerId() != iOptInt5) {
                                    arrayList3.add(obj7);
                                }
                            }
                            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                            int size = mutableList.size();
                            if (this.this$0.getUiState().getValue().getCurrentScreen() == CraftScreenTypeEnum.STASH) {
                                MutableStateFlow<CraftUiState> mutableStateFlow3 = this.this$0.get_uiState();
                                do {
                                    value4 = mutableStateFlow3.getValue();
                                    craftUiState4 = value4;
                                } while (!mutableStateFlow3.compareAndSet(value4, craftUiState4.copy(((-268435457) & 1) != 0 ? craftUiState4.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState4.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState4.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState4.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState4.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState4.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState4.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState4.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState4.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState4.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState4.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState4.quantityInStorage : size, ((-268435457) & 4096) != 0 ? craftUiState4.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState4.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState4.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState4.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState4.listWithStorageItems : mutableList, ((-268435457) & 131072) != 0 ? craftUiState4.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState4.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState4.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState4.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState4.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState4.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState4.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState4.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState4.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState4.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState4.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState4.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState4.allElementsForCraftAfterFilter : mutableList, ((-268435457) & 1073741824) != 0 ? craftUiState4.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState4.selectedCategory : null, (1019 & 1) != 0 ? craftUiState4.filterList : null, (1019 & 2) != 0 ? craftUiState4.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState4.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState4.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState4.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState4.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState4.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState4.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState4.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState4.isBlockingLoading : false)));
                            } else {
                                MutableStateFlow<CraftUiState> mutableStateFlow4 = this.this$0.get_uiState();
                                do {
                                    value3 = mutableStateFlow4.getValue();
                                    craftUiState3 = value3;
                                } while (!mutableStateFlow4.compareAndSet(value3, craftUiState3.copy(((-268435457) & 1) != 0 ? craftUiState3.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState3.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState3.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState3.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState3.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState3.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState3.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState3.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState3.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState3.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState3.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState3.quantityInStorage : size, ((-268435457) & 4096) != 0 ? craftUiState3.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState3.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState3.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState3.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState3.listWithStorageItems : mutableList, ((-268435457) & 131072) != 0 ? craftUiState3.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState3.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState3.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState3.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState3.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState3.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState3.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState3.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState3.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState3.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState3.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState3.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState3.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState3.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState3.selectedCategory : null, (1019 & 1) != 0 ? craftUiState3.filterList : null, (1019 & 2) != 0 ? craftUiState3.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState3.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState3.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState3.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState3.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState3.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState3.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState3.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState3.isBlockingLoading : false)));
                            }
                        } else {
                            ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default2 = ButtonAnimatedAttachment.copy$default(this.this$0.getUiState().getValue().getButtonAnimatedAttachment(), false, false, false, 3, null);
                            if (this.this$0.getUiState().getValue().getCurrentScreen() == CraftScreenTypeEnum.STASH) {
                                MutableStateFlow<CraftUiState> mutableStateFlow5 = this.this$0.get_uiState();
                                do {
                                    value2 = mutableStateFlow5.getValue();
                                    craftUiState2 = value2;
                                } while (!mutableStateFlow5.compareAndSet(value2, craftUiState2.copy(((-268435457) & 1) != 0 ? craftUiState2.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState2.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState2.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState2.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState2.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState2.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState2.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState2.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState2.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState2.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState2.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState2.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState2.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState2.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState2.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState2.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState2.listWithStorageItems : CollectionsKt__CollectionsKt.emptyList(), ((-268435457) & 131072) != 0 ? craftUiState2.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState2.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState2.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState2.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default2, ((-268435457) & 2097152) != 0 ? craftUiState2.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState2.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState2.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState2.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState2.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState2.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState2.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState2.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState2.allElementsForCraftAfterFilter : CollectionsKt__CollectionsKt.emptyList(), ((-268435457) & 1073741824) != 0 ? craftUiState2.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState2.selectedCategory : null, (1019 & 1) != 0 ? craftUiState2.filterList : null, (1019 & 2) != 0 ? craftUiState2.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState2.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState2.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState2.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState2.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState2.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState2.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState2.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState2.isBlockingLoading : false)));
                            } else {
                                MutableStateFlow<CraftUiState> mutableStateFlow6 = this.this$0.get_uiState();
                                do {
                                    value = mutableStateFlow6.getValue();
                                    craftUiState = value;
                                } while (!mutableStateFlow6.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : CollectionsKt__CollectionsKt.emptyList(), ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default2, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                            }
                        }
                    } else if (iOptInt4 == 4) {
                        final int iOptInt6 = this.$json.optInt("id");
                        int iOptInt7 = this.$json.optInt("vm");
                        JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray(CraftKeys.COMPONENTS_ARRAY_KEY);
                        if (jSONArrayOptJSONArray == null) {
                            listEmptyList = null;
                            if (listEmptyList == null) {
                            }
                            List list6 = listEmptyList;
                            final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10)), 16));
                            while (r0.hasNext()) {
                            }
                            List list7 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.this$0.getUiState().getValue().getListWithProductionItems()), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$productionList$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(@NotNull CraftElement productionItem) {
                                    Intrinsics.checkNotNullParameter(productionItem, "productionItem");
                                    return Boolean.valueOf(productionItem.getServerId() != iOptInt6);
                                }
                            }), new Function1<CraftElement, CraftElement>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$productionList$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final CraftElement invoke(@NotNull CraftElement productionCraftElement) {
                                    CraftIngredient craftIngredientCopy3;
                                    Intrinsics.checkNotNullParameter(productionCraftElement, "productionCraftElement");
                                    List<CraftIngredient> componentsList2 = productionCraftElement.getComponentsList();
                                    Map<Integer, CraftComponentServerItem> map5 = linkedHashMap;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
                                    for (CraftIngredient craftIngredient : componentsList2) {
                                        CraftComponentServerItem craftComponentServerItem = map5.get(Integer.valueOf(craftIngredient.getId()));
                                        if (craftComponentServerItem != null && (craftIngredientCopy3 = craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : craftComponentServerItem.getQuantity(), (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : false)) != null) {
                                            craftIngredient = craftIngredientCopy3;
                                        }
                                        arrayList4.add(craftIngredient);
                                    }
                                    return productionCraftElement.copy((57085 & 1) != 0 ? productionCraftElement.elementId : 0, (57085 & 2) != 0 ? productionCraftElement.serverId : 0, (57085 & 4) != 0 ? productionCraftElement.imageName : null, (57085 & 8) != 0 ? productionCraftElement.imageType : 0, (57085 & 16) != 0 ? productionCraftElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? productionCraftElement.preparationTime : 0, (57085 & 64) != 0 ? productionCraftElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? productionCraftElement.elementRarity : null, (57085 & 256) != 0 ? productionCraftElement.elementState : null, (57085 & 512) != 0 ? productionCraftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? productionCraftElement.textBlock : null, (57085 & 2048) != 0 ? productionCraftElement.componentsList : arrayList4, (57085 & 4096) != 0 ? productionCraftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? productionCraftElement.valueOfTimer : null, (57085 & 16384) != 0 ? productionCraftElement.craftingCost : 0, (57085 & 32768) != 0 ? productionCraftElement.itemCategory : 0);
                                }
                            }));
                            List list8 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.this$0.getUiState().getValue().getListWithStorageItems()), new Function1<CraftElement, CraftElement>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$storageList$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final CraftElement invoke(@NotNull CraftElement storageCraftElement) {
                                    CraftIngredient craftIngredientCopy3;
                                    Intrinsics.checkNotNullParameter(storageCraftElement, "storageCraftElement");
                                    List<CraftIngredient> componentsList2 = storageCraftElement.getComponentsList();
                                    Map<Integer, CraftComponentServerItem> map5 = linkedHashMap;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
                                    for (CraftIngredient craftIngredient : componentsList2) {
                                        CraftComponentServerItem craftComponentServerItem = map5.get(Integer.valueOf(craftIngredient.getId()));
                                        if (craftComponentServerItem != null && (craftIngredientCopy3 = craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : craftComponentServerItem.getQuantity(), (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : false)) != null) {
                                            craftIngredient = craftIngredientCopy3;
                                        }
                                        arrayList4.add(craftIngredient);
                                    }
                                    return storageCraftElement.copy((57085 & 1) != 0 ? storageCraftElement.elementId : 0, (57085 & 2) != 0 ? storageCraftElement.serverId : 0, (57085 & 4) != 0 ? storageCraftElement.imageName : null, (57085 & 8) != 0 ? storageCraftElement.imageType : 0, (57085 & 16) != 0 ? storageCraftElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? storageCraftElement.preparationTime : 0, (57085 & 64) != 0 ? storageCraftElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? storageCraftElement.elementRarity : null, (57085 & 256) != 0 ? storageCraftElement.elementState : null, (57085 & 512) != 0 ? storageCraftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? storageCraftElement.textBlock : null, (57085 & 2048) != 0 ? storageCraftElement.componentsList : arrayList4, (57085 & 4096) != 0 ? storageCraftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? storageCraftElement.valueOfTimer : null, (57085 & 16384) != 0 ? storageCraftElement.craftingCost : 0, (57085 & 32768) != 0 ? storageCraftElement.itemCategory : 0);
                                }
                            }));
                            Map<Integer, List<CraftElement>> mapOfCraftElements2 = this.this$0.getUiState().getValue().getMapOfCraftElements();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements2.size()));
                            it = mapOfCraftElements2.entrySet().iterator();
                            while (it.hasNext()) {
                            }
                            int quantityInQueue2 = this.this$0.getUiState().getValue().getQuantityInQueue() - 1;
                            if (this.this$0.getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.PROGRESS) {
                            }
                        } else {
                            try {
                                ArrayList arrayList4 = new ArrayList();
                                int length = jSONArrayOptJSONArray.length();
                                for (int i12 = 0; i12 < length; i12++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
                                    Intrinsics.checkNotNull(jSONObject2);
                                    try {
                                        Gson gson = new Gson();
                                        String string = jSONObject2.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CraftComponentServerItem.class);
                                    } catch (Exception e) {
                                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics.log(e.toString());
                                        firebaseCrashlytics.recordException(e);
                                        objFromJson = null;
                                    }
                                    if (objFromJson != null) {
                                        Boxing.boxBoolean(arrayList4.add(objFromJson));
                                    }
                                }
                                listEmptyList = arrayList4;
                            } catch (Exception e2) {
                                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics2.log(e2.toString());
                                firebaseCrashlytics2.recordException(e2);
                            }
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List list62 = listEmptyList;
                            final Map<Integer, CraftComponentServerItem> linkedHashMap3 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10)), 16));
                            for (Object obj8 : list62) {
                                linkedHashMap3.put(Boxing.boxInt(((CraftComponentServerItem) obj8).getId()), obj8);
                            }
                            List list72 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.this$0.getUiState().getValue().getListWithProductionItems()), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$productionList$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(@NotNull CraftElement productionItem) {
                                    Intrinsics.checkNotNullParameter(productionItem, "productionItem");
                                    return Boolean.valueOf(productionItem.getServerId() != iOptInt6);
                                }
                            }), new Function1<CraftElement, CraftElement>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$productionList$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final CraftElement invoke(@NotNull CraftElement productionCraftElement) {
                                    CraftIngredient craftIngredientCopy3;
                                    Intrinsics.checkNotNullParameter(productionCraftElement, "productionCraftElement");
                                    List<CraftIngredient> componentsList2 = productionCraftElement.getComponentsList();
                                    Map<Integer, CraftComponentServerItem> map5 = linkedHashMap3;
                                    ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
                                    for (CraftIngredient craftIngredient : componentsList2) {
                                        CraftComponentServerItem craftComponentServerItem = map5.get(Integer.valueOf(craftIngredient.getId()));
                                        if (craftComponentServerItem != null && (craftIngredientCopy3 = craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : craftComponentServerItem.getQuantity(), (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : false)) != null) {
                                            craftIngredient = craftIngredientCopy3;
                                        }
                                        arrayList42.add(craftIngredient);
                                    }
                                    return productionCraftElement.copy((57085 & 1) != 0 ? productionCraftElement.elementId : 0, (57085 & 2) != 0 ? productionCraftElement.serverId : 0, (57085 & 4) != 0 ? productionCraftElement.imageName : null, (57085 & 8) != 0 ? productionCraftElement.imageType : 0, (57085 & 16) != 0 ? productionCraftElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? productionCraftElement.preparationTime : 0, (57085 & 64) != 0 ? productionCraftElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? productionCraftElement.elementRarity : null, (57085 & 256) != 0 ? productionCraftElement.elementState : null, (57085 & 512) != 0 ? productionCraftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? productionCraftElement.textBlock : null, (57085 & 2048) != 0 ? productionCraftElement.componentsList : arrayList42, (57085 & 4096) != 0 ? productionCraftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? productionCraftElement.valueOfTimer : null, (57085 & 16384) != 0 ? productionCraftElement.craftingCost : 0, (57085 & 32768) != 0 ? productionCraftElement.itemCategory : 0);
                                }
                            }));
                            List list82 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.this$0.getUiState().getValue().getListWithStorageItems()), new Function1<CraftElement, CraftElement>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$updateJson$1$storageList$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final CraftElement invoke(@NotNull CraftElement storageCraftElement) {
                                    CraftIngredient craftIngredientCopy3;
                                    Intrinsics.checkNotNullParameter(storageCraftElement, "storageCraftElement");
                                    List<CraftIngredient> componentsList2 = storageCraftElement.getComponentsList();
                                    Map<Integer, CraftComponentServerItem> map5 = linkedHashMap3;
                                    ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
                                    for (CraftIngredient craftIngredient : componentsList2) {
                                        CraftComponentServerItem craftComponentServerItem = map5.get(Integer.valueOf(craftIngredient.getId()));
                                        if (craftComponentServerItem != null && (craftIngredientCopy3 = craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : craftComponentServerItem.getQuantity(), (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : false)) != null) {
                                            craftIngredient = craftIngredientCopy3;
                                        }
                                        arrayList42.add(craftIngredient);
                                    }
                                    return storageCraftElement.copy((57085 & 1) != 0 ? storageCraftElement.elementId : 0, (57085 & 2) != 0 ? storageCraftElement.serverId : 0, (57085 & 4) != 0 ? storageCraftElement.imageName : null, (57085 & 8) != 0 ? storageCraftElement.imageType : 0, (57085 & 16) != 0 ? storageCraftElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? storageCraftElement.preparationTime : 0, (57085 & 64) != 0 ? storageCraftElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? storageCraftElement.elementRarity : null, (57085 & 256) != 0 ? storageCraftElement.elementState : null, (57085 & 512) != 0 ? storageCraftElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? storageCraftElement.textBlock : null, (57085 & 2048) != 0 ? storageCraftElement.componentsList : arrayList42, (57085 & 4096) != 0 ? storageCraftElement.valueOfPercent : 0, (57085 & 8192) != 0 ? storageCraftElement.valueOfTimer : null, (57085 & 16384) != 0 ? storageCraftElement.craftingCost : 0, (57085 & 32768) != 0 ? storageCraftElement.itemCategory : 0);
                                }
                            }));
                            Map<Integer, List<CraftElement>> mapOfCraftElements22 = this.this$0.getUiState().getValue().getMapOfCraftElements();
                            LinkedHashMap linkedHashMap22 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements22.size()));
                            it = mapOfCraftElements22.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Iterable<CraftElement> iterable = (Iterable) entry.getValue();
                                int i13 = 10;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                                for (CraftElement craftElement2 : iterable) {
                                    List<CraftIngredient> componentsList2 = craftElement2.getComponentsList();
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, i13));
                                    for (CraftIngredient craftIngredient : componentsList2) {
                                        CraftComponentServerItem craftComponentServerItem = (CraftComponentServerItem) linkedHashMap3.get(Boxing.boxInt(craftIngredient.getId()));
                                        if (craftComponentServerItem != null && (craftIngredientCopy2 = craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : craftComponentServerItem.getQuantity(), (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : false)) != null) {
                                            craftIngredient = craftIngredientCopy2;
                                        }
                                        arrayList6.add(craftIngredient);
                                    }
                                    int size2 = arrayList6.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < size2) {
                                            if (!((CraftIngredient) arrayList6.get(i14)).isEnough()) {
                                                craftElementStatusEnum = CraftElementStatusEnum.DEFAULT;
                                                break;
                                            }
                                            i14++;
                                        } else {
                                            craftElementStatusEnum = CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING;
                                            break;
                                        }
                                    }
                                    arrayList5.add(craftElement2.copy((57085 & 1) != 0 ? craftElement2.elementId : 0, (57085 & 2) != 0 ? craftElement2.serverId : 0, (57085 & 4) != 0 ? craftElement2.imageName : null, (57085 & 8) != 0 ? craftElement2.imageType : 0, (57085 & 16) != 0 ? craftElement2.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElement2.preparationTime : 0, (57085 & 64) != 0 ? craftElement2.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElement2.elementRarity : null, (57085 & 256) != 0 ? craftElement2.elementState : craftElementStatusEnum, (57085 & 512) != 0 ? craftElement2.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElement2.textBlock : null, (57085 & 2048) != 0 ? craftElement2.componentsList : arrayList6, (57085 & 4096) != 0 ? craftElement2.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElement2.valueOfTimer : null, (57085 & 16384) != 0 ? craftElement2.craftingCost : 0, (57085 & 32768) != 0 ? craftElement2.itemCategory : 0));
                                    i13 = 10;
                                }
                                linkedHashMap22.put(key, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5));
                            }
                            int quantityInQueue22 = this.this$0.getUiState().getValue().getQuantityInQueue() - 1;
                            if (this.this$0.getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.PROGRESS) {
                                MutableStateFlow<CraftUiState> mutableStateFlow7 = this.this$0.get_uiState();
                                do {
                                    value6 = mutableStateFlow7.getValue();
                                    craftUiState6 = value6;
                                } while (!mutableStateFlow7.compareAndSet(value6, craftUiState6.copy(((-268435457) & 1) != 0 ? craftUiState6.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState6.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState6.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState6.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState6.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState6.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState6.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState6.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState6.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState6.quantityInQueue : quantityInQueue22, ((-268435457) & 1024) != 0 ? craftUiState6.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState6.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState6.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState6.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState6.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState6.mapOfCraftElements : linkedHashMap22, ((-268435457) & 65536) != 0 ? craftUiState6.listWithStorageItems : list82, ((-268435457) & 131072) != 0 ? craftUiState6.listWithProductionItems : list72, ((-268435457) & 262144) != 0 ? craftUiState6.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState6.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState6.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState6.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState6.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState6.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState6.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState6.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState6.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState6.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState6.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState6.allElementsForCraftAfterFilter : list72, ((-268435457) & 1073741824) != 0 ? craftUiState6.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState6.selectedCategory : null, (1019 & 1) != 0 ? craftUiState6.filterList : null, (1019 & 2) != 0 ? craftUiState6.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState6.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState6.valueOfRubles : iOptInt7, (1019 & 16) != 0 ? craftUiState6.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState6.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState6.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState6.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState6.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState6.isBlockingLoading : false)));
                            } else {
                                MutableStateFlow<CraftUiState> mutableStateFlow8 = this.this$0.get_uiState();
                                do {
                                    value5 = mutableStateFlow8.getValue();
                                    craftUiState5 = value5;
                                } while (!mutableStateFlow8.compareAndSet(value5, craftUiState5.copy(((-268435457) & 1) != 0 ? craftUiState5.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState5.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState5.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState5.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState5.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState5.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState5.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState5.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState5.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState5.quantityInQueue : quantityInQueue22, ((-268435457) & 1024) != 0 ? craftUiState5.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState5.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState5.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState5.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState5.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState5.mapOfCraftElements : linkedHashMap22, ((-268435457) & 65536) != 0 ? craftUiState5.listWithStorageItems : list82, ((-268435457) & 131072) != 0 ? craftUiState5.listWithProductionItems : list72, ((-268435457) & 262144) != 0 ? craftUiState5.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState5.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState5.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState5.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState5.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState5.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState5.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState5.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState5.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState5.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState5.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState5.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState5.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState5.selectedCategory : null, (1019 & 1) != 0 ? craftUiState5.filterList : null, (1019 & 2) != 0 ? craftUiState5.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState5.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState5.valueOfRubles : iOptInt7, (1019 & 16) != 0 ? craftUiState5.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState5.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState5.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState5.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState5.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState5.isBlockingLoading : false)));
                            }
                        }
                    } else if (iOptInt4 == 5) {
                        jSONObject = this.$json;
                        craftViewModel = this.this$0;
                        int iOptInt8 = jSONObject.optInt(CraftKeys.LEVEL_OF_SKILL_KEY, -1);
                        int i15 = (craftViewModel.getUiState().getValue().isNeedToShowLevelUpDialog() || iOptInt8 > -1) ? 1 : 0;
                        Integer numBoxInt = Boxing.boxInt(jSONObject.optInt(CraftKeys.PERCENT_OF_SKILL_KEY, -1));
                        if (numBoxInt.intValue() < 0) {
                            numBoxInt = null;
                        }
                        int iIntValue2 = numBoxInt != null ? numBoxInt.intValue() : craftViewModel.getUiState().getValue().getPercentOfSkill();
                        Integer numBoxInt2 = Boxing.boxInt(jSONObject.optInt("pc", -1));
                        if (numBoxInt2.intValue() < 0) {
                            numBoxInt2 = null;
                        }
                        int iIntValue3 = numBoxInt2 != null ? numBoxInt2.intValue() : craftViewModel.getUiState().getValue().getQuantityInQueue();
                        Integer numBoxInt3 = Boxing.boxInt(jSONObject.optInt(CraftKeys.QUEUE_MAX_KEY, -1));
                        if (numBoxInt3.intValue() < 0) {
                            numBoxInt3 = null;
                        }
                        int iIntValue4 = numBoxInt3 != null ? numBoxInt3.intValue() : craftViewModel.getUiState().getValue().getQueueMax();
                        Integer numBoxInt4 = Boxing.boxInt(jSONObject.optInt("ps", -1));
                        if (numBoxInt4.intValue() < 0) {
                            numBoxInt4 = null;
                        }
                        int iIntValue5 = numBoxInt4 != null ? numBoxInt4.intValue() : craftViewModel.getUiState().getValue().getQuantityInStorage();
                        Integer numBoxInt5 = Boxing.boxInt(jSONObject.optInt(CraftKeys.STORAGE_MAX_KEY, -1));
                        if (numBoxInt5.intValue() < 0) {
                            numBoxInt5 = null;
                        }
                        iIntValue = numBoxInt5 != null ? numBoxInt5.intValue() : craftViewModel.getUiState().getValue().getStorageMax();
                        if (i15 != 0 && iOptInt8 > -1) {
                            listOfLevelUpElements = craftViewModel.getLevelUpElementsList(iOptInt8);
                        } else {
                            listOfLevelUpElements = craftViewModel.get_uiState().getValue().getListOfLevelUpElements();
                        }
                        List<CraftElement> list9 = listOfLevelUpElements;
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(CraftKeys.NEW_ITEMS_ARRAY_KEY);
                        if (jSONArrayOptJSONArray2 != null) {
                            try {
                                arrayList = new ArrayList();
                                obj2 = coroutine_suspended;
                                try {
                                    int length2 = jSONArrayOptJSONArray2.length();
                                    i = iIntValue2;
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        try {
                                            JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i16);
                                            Intrinsics.checkNotNull(jSONObject3);
                                            int i17 = length2;
                                            try {
                                                Gson gson2 = new Gson();
                                                String string2 = jSONObject3.toString();
                                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                jSONArray = jSONArrayOptJSONArray2;
                                                try {
                                                    objFromJson2 = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) CraftItemsWithNotificationServerItem.class);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                                    firebaseCrashlytics3.log(e.toString());
                                                    firebaseCrashlytics3.recordException(e);
                                                    objFromJson2 = null;
                                                    if (objFromJson2 == null) {
                                                    }
                                                    i16++;
                                                    length2 = i17;
                                                    jSONArrayOptJSONArray2 = jSONArray;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                jSONArray = jSONArrayOptJSONArray2;
                                            }
                                            if (objFromJson2 == null) {
                                                Boxing.boxBoolean(arrayList.add(objFromJson2));
                                            }
                                            i16++;
                                            length2 = i17;
                                            jSONArrayOptJSONArray2 = jSONArray;
                                        } catch (Exception e5) {
                                            e = e5;
                                            FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                                            firebaseCrashlytics4.log(e.toString());
                                            firebaseCrashlytics4.recordException(e);
                                            arrayList = null;
                                            if (arrayList == null) {
                                            }
                                            if (!arrayList.isEmpty()) {
                                            }
                                            List listFlatten = CollectionsKt__IterablesKt.flatten(mapOfCraftElements.values());
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten, 10)), 16));
                                            while (r2.hasNext()) {
                                            }
                                            this.L$0 = craftViewModel;
                                            this.L$1 = jSONObject;
                                            this.L$2 = list9;
                                            this.L$3 = mapOfCraftElements;
                                            this.L$4 = linkedHashMap4;
                                            this.I$0 = iOptInt8;
                                            this.I$1 = i15;
                                            this.I$2 = iIntValue4;
                                            this.I$3 = iIntValue5;
                                            this.I$4 = iIntValue;
                                            i3 = i2;
                                            this.I$5 = i3;
                                            int i18 = i;
                                            this.I$6 = i18;
                                            this.label = 2;
                                            listWithStorageItems = craftViewModel.parseListWithStorageItems(jSONObject, mapOfCraftElements, this);
                                            obj3 = obj2;
                                            if (listWithStorageItems != obj3) {
                                            }
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    i = iIntValue2;
                                    FirebaseCrashlytics firebaseCrashlytics42 = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics42.log(e.toString());
                                    firebaseCrashlytics42.recordException(e);
                                    arrayList = null;
                                    if (arrayList == null) {
                                    }
                                    if (!arrayList.isEmpty()) {
                                    }
                                    List listFlatten2 = CollectionsKt__IterablesKt.flatten(mapOfCraftElements.values());
                                    LinkedHashMap linkedHashMap42 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten2, 10)), 16));
                                    while (r2.hasNext()) {
                                    }
                                    this.L$0 = craftViewModel;
                                    this.L$1 = jSONObject;
                                    this.L$2 = list9;
                                    this.L$3 = mapOfCraftElements;
                                    this.L$4 = linkedHashMap42;
                                    this.I$0 = iOptInt8;
                                    this.I$1 = i15;
                                    this.I$2 = iIntValue4;
                                    this.I$3 = iIntValue5;
                                    this.I$4 = iIntValue;
                                    i3 = i2;
                                    this.I$5 = i3;
                                    int i182 = i;
                                    this.I$6 = i182;
                                    this.label = 2;
                                    listWithStorageItems = craftViewModel.parseListWithStorageItems(jSONObject, mapOfCraftElements, this);
                                    obj3 = obj2;
                                    if (listWithStorageItems != obj3) {
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                obj2 = coroutine_suspended;
                            }
                            if (arrayList == null) {
                                arrayList = CollectionsKt__CollectionsKt.emptyList();
                            }
                            if (!arrayList.isEmpty()) {
                                mapOfCraftElements = craftViewModel.getUiState().getValue().getMapOfCraftElements();
                                i2 = iIntValue3;
                            } else {
                                Map<Integer, List<CraftElement>> mapOfCraftElements3 = craftViewModel.get_uiState().getValue().getMapOfCraftElements();
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements3.size()));
                                Iterator it6 = mapOfCraftElements3.entrySet().iterator();
                                while (it6.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it6.next();
                                    Object key2 = entry2.getKey();
                                    Iterable iterable2 = (Iterable) entry2.getValue();
                                    Iterator it7 = it6;
                                    int i19 = iIntValue3;
                                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                                    Iterator it8 = iterable2.iterator();
                                    while (it8.hasNext()) {
                                        CraftElement craftElementCopy2 = (CraftElement) it8.next();
                                        List list10 = arrayList;
                                        if ((list10 instanceof Collection) && list10.isEmpty()) {
                                            it2 = it8;
                                        } else {
                                            Iterator it9 = list10.iterator();
                                            while (it9.hasNext()) {
                                                it2 = it8;
                                                if (((CraftItemsWithNotificationServerItem) it9.next()).getId() == craftElementCopy2.getElementId()) {
                                                    craftElementCopy2 = craftElementCopy2.copy((57085 & 1) != 0 ? craftElementCopy2.elementId : 0, (57085 & 2) != 0 ? craftElementCopy2.serverId : 0, (57085 & 4) != 0 ? craftElementCopy2.imageName : null, (57085 & 8) != 0 ? craftElementCopy2.imageType : 0, (57085 & 16) != 0 ? craftElementCopy2.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy2.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy2.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy2.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy2.elementState : CraftElementStatusEnum.NEW_ELEMENT, (57085 & 512) != 0 ? craftElementCopy2.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy2.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy2.componentsList : null, (57085 & 4096) != 0 ? craftElementCopy2.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy2.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy2.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy2.itemCategory : 0);
                                                    break;
                                                }
                                                it8 = it2;
                                            }
                                            it2 = it8;
                                        }
                                        arrayList7.add(craftElementCopy2);
                                        it8 = it2;
                                    }
                                    linkedHashMap5.put(key2, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList7));
                                    iIntValue3 = i19;
                                    it6 = it7;
                                }
                                i2 = iIntValue3;
                                mapOfCraftElements = linkedHashMap5;
                            }
                            List listFlatten22 = CollectionsKt__IterablesKt.flatten(mapOfCraftElements.values());
                            LinkedHashMap linkedHashMap422 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten22, 10)), 16));
                            for (Object obj9 : listFlatten22) {
                                linkedHashMap422.put(Boxing.boxInt(((CraftElement) obj9).getElementId()), obj9);
                            }
                            this.L$0 = craftViewModel;
                            this.L$1 = jSONObject;
                            this.L$2 = list9;
                            this.L$3 = mapOfCraftElements;
                            this.L$4 = linkedHashMap422;
                            this.I$0 = iOptInt8;
                            this.I$1 = i15;
                            this.I$2 = iIntValue4;
                            this.I$3 = iIntValue5;
                            this.I$4 = iIntValue;
                            i3 = i2;
                            this.I$5 = i3;
                            int i1822 = i;
                            this.I$6 = i1822;
                            this.label = 2;
                            listWithStorageItems = craftViewModel.parseListWithStorageItems(jSONObject, mapOfCraftElements, this);
                            obj3 = obj2;
                            if (listWithStorageItems != obj3) {
                                return obj3;
                            }
                            i4 = i15;
                            i5 = iIntValue4;
                            i6 = iOptInt8;
                            i7 = iIntValue5;
                            map2 = linkedHashMap422;
                            list = list9;
                            map3 = mapOfCraftElements;
                            i8 = i1822;
                            collection = (Collection) listWithStorageItems;
                            if (collection.isEmpty()) {
                            }
                            list3 = (List) collection2;
                            this.L$0 = craftViewModel;
                            this.L$1 = list;
                            this.L$2 = map3;
                            this.L$3 = list3;
                            this.L$4 = null;
                            this.I$0 = i6;
                            this.I$1 = i4;
                            this.I$2 = i5;
                            this.I$3 = i7;
                            this.I$4 = iIntValue;
                            this.I$5 = i3;
                            this.I$6 = i8;
                            this.label = 3;
                            listWithProductionItems2 = craftViewModel.parseListWithProductionItems(jSONObject, map3, this);
                            obj5 = obj4;
                            if (listWithProductionItems2 != obj5) {
                            }
                        } else {
                            obj2 = coroutine_suspended;
                            i = iIntValue2;
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        List listFlatten222 = CollectionsKt__IterablesKt.flatten(mapOfCraftElements.values());
                        LinkedHashMap linkedHashMap4222 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten222, 10)), 16));
                        while (r2.hasNext()) {
                        }
                        this.L$0 = craftViewModel;
                        this.L$1 = jSONObject;
                        this.L$2 = list9;
                        this.L$3 = mapOfCraftElements;
                        this.L$4 = linkedHashMap4222;
                        this.I$0 = iOptInt8;
                        this.I$1 = i15;
                        this.I$2 = iIntValue4;
                        this.I$3 = iIntValue5;
                        this.I$4 = iIntValue;
                        i3 = i2;
                        this.I$5 = i3;
                        int i18222 = i;
                        this.I$6 = i18222;
                        this.label = 2;
                        listWithStorageItems = craftViewModel.parseListWithStorageItems(jSONObject, mapOfCraftElements, this);
                        obj3 = obj2;
                        if (listWithStorageItems != obj3) {
                        }
                    }
                } else if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("s")))) {
                    iOptInt = this.$json.optInt("vm");
                    iOptInt2 = this.$json.optInt("id");
                    iOptInt3 = this.$json.optInt("ct");
                    Map<Integer, List<CraftElement>> mapOfCraftElements4 = this.this$0.get_uiState().getValue().getMapOfCraftElements();
                    List listFlatten3 = CollectionsKt__IterablesKt.flatten(mapOfCraftElements4.values());
                    Iterator it10 = listFlatten3.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it10.next();
                        if (((CraftElement) next).getElementId() == iOptInt2) {
                            break;
                        }
                    }
                    CraftElement craftElement3 = (CraftElement) next;
                    ArrayList<CraftIngredient> arrayList8 = new ArrayList();
                    Iterator it11 = listFlatten3.iterator();
                    while (it11.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList8, ((CraftElement) it11.next()).getComponentsList());
                    }
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10)), 16));
                    for (CraftIngredient craftIngredient2 : arrayList8) {
                        Pair pairM7112to = TuplesKt.m7112to(Boxing.boxInt(craftIngredient2.getId()), Boxing.boxInt(craftIngredient2.getQuantityInStock()));
                        linkedHashMap6.put(pairM7112to.getFirst(), pairM7112to.getSecond());
                    }
                    Map mutableMap = MapsKt__MapsKt.toMutableMap(linkedHashMap6);
                    if (craftElement3 != null && (componentsList = craftElement3.getComponentsList()) != null) {
                        int size3 = componentsList.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            CraftIngredient craftIngredient3 = componentsList.get(i20);
                            Integer num = (Integer) mutableMap.get(Boxing.boxInt(craftIngredient3.getId()));
                            if (num != null) {
                                mutableMap.put(Boxing.boxInt(craftIngredient3.getId()), Boxing.boxInt(num.intValue() - (craftIngredient3.getQuantityNeeded() * iOptInt3)));
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements4.size()));
                    Iterator<T> it12 = mapOfCraftElements4.entrySet().iterator();
                    while (it12.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it12.next();
                        Object key3 = entry3.getKey();
                        Iterable<CraftElement> iterable3 = (Iterable) entry3.getValue();
                        int i21 = 10;
                        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable3, 10));
                        for (CraftElement craftElement4 : iterable3) {
                            List<CraftIngredient> componentsList3 = craftElement4.getComponentsList();
                            ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList3, i21));
                            for (CraftIngredient craftIngredient4 : componentsList3) {
                                Integer num2 = (Integer) mutableMap.get(Boxing.boxInt(craftIngredient4.getId()));
                                if (num2 != null && (craftIngredientCopy = craftIngredient4.copy((1791 & 1) != 0 ? craftIngredient4.id : 0, (1791 & 2) != 0 ? craftIngredient4.rarity : null, (1791 & 4) != 0 ? craftIngredient4.name : null, (1791 & 8) != 0 ? craftIngredient4.description : null, (1791 & 16) != 0 ? craftIngredient4.imageName : null, (1791 & 32) != 0 ? craftIngredient4.imageType : 0, (1791 & 64) != 0 ? craftIngredient4.count : 0, (1791 & 128) != 0 ? craftIngredient4.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient4.quantityInStock : num2.intValue(), (1791 & 512) != 0 ? craftIngredient4.isInWork : false, (1791 & 1024) != 0 ? craftIngredient4.isInStorage : false)) != null) {
                                    craftIngredient4 = craftIngredientCopy;
                                }
                                arrayList10.add(craftIngredient4);
                            }
                            if (craftElement4.getElementState() != CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING && craftElement4.getElementState() != CraftElementStatusEnum.DEFAULT) {
                                elementState = craftElement4.getElementState();
                            } else {
                                int size4 = arrayList10.size();
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size4) {
                                        if (!((CraftIngredient) arrayList10.get(i22)).isEnough()) {
                                            elementState = CraftElementStatusEnum.DEFAULT;
                                            break;
                                        }
                                        i22++;
                                    } else {
                                        elementState = CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING;
                                        break;
                                    }
                                }
                            }
                            arrayList9.add(craftElement4.copy((57085 & 1) != 0 ? craftElement4.elementId : 0, (57085 & 2) != 0 ? craftElement4.serverId : 0, (57085 & 4) != 0 ? craftElement4.imageName : null, (57085 & 8) != 0 ? craftElement4.imageType : 0, (57085 & 16) != 0 ? craftElement4.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElement4.preparationTime : 0, (57085 & 64) != 0 ? craftElement4.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElement4.elementRarity : null, (57085 & 256) != 0 ? craftElement4.elementState : elementState, (57085 & 512) != 0 ? craftElement4.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElement4.textBlock : null, (57085 & 2048) != 0 ? craftElement4.componentsList : arrayList10, (57085 & 4096) != 0 ? craftElement4.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElement4.valueOfTimer : null, (57085 & 16384) != 0 ? craftElement4.craftingCost : 0, (57085 & 32768) != 0 ? craftElement4.itemCategory : 0));
                            i21 = 10;
                        }
                        linkedHashMap7.put(key3, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList9));
                    }
                    CraftViewModel craftViewModel3 = this.this$0;
                    JSONObject jSONObject4 = this.$json;
                    this.L$0 = linkedHashMap7;
                    this.I$0 = iOptInt;
                    this.I$1 = iOptInt2;
                    this.I$2 = iOptInt3;
                    this.label = 1;
                    listWithProductionItems = craftViewModel3.parseListWithProductionItems(jSONObject4, linkedHashMap7, this);
                    if (listWithProductionItems == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap7;
                    list2 = (List) listWithProductionItems;
                    List<CraftElement> listWithStorageItems3 = this.this$0.getUiState().getValue().getListWithStorageItems();
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listWithStorageItems3, 10));
                    while (r6.hasNext()) {
                    }
                    quantityInQueue = this.this$0.getUiState().getValue().getQuantityInQueue() + iOptInt3;
                    i9 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getUiState().getValue().getCurrentScreen().ordinal()];
                    if (i9 != 1) {
                    }
                    it3 = CollectionsKt__IterablesKt.flatten(map.values()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                        }
                    }
                    craftElement = (CraftElement) next2;
                    if (craftElement == null) {
                    }
                    if (iOptInt > this.this$0.get_uiState().getValue().getValueOfRubles()) {
                    }
                    int textQuantityColor$default = CraftViewModel.getTextQuantityColor$default(this.this$0, craftElement, 0, 2, null);
                    CraftCraftingControl craftingControlInfo = this.this$0.get_uiState().getValue().getCraftingControlInfo();
                    if (craftElement.isEnoughResources()) {
                        craftCraftingControlCopy = craftingControlInfo.copy((805 & 1) != 0 ? craftingControlInfo.typeOfBlock : 0, (805 & 2) != 0 ? craftingControlInfo.selectedValueOfItem : 1, (805 & 4) != 0 ? craftingControlInfo.maxValueOfItems : 0, (805 & 8) != 0 ? craftingControlInfo.selectedWeight : craftElement.getTextBlock().getWeight(), (805 & 16) != 0 ? craftingControlInfo.craftingCost : String.valueOf(craftElement.getCraftingCost()), (805 & 32) != 0 ? craftingControlInfo.timeUntilItemWillBePrepared : 0, (805 & 64) != 0 ? craftingControlInfo.isEnoughMoney : z, (805 & 128) != 0 ? craftingControlInfo.isEnoughResources : craftElement.isEnoughResources(), (805 & 256) != 0 ? craftingControlInfo.isLowLevel : false, (805 & 512) != 0 ? craftingControlInfo.isWorkbenchLevelInsufficient : false, (805 & 1024) != 0 ? craftingControlInfo.isEnabledMainButton : !craftElement.isEnoughResources() && z, (805 & 2048) != 0 ? craftingControlInfo.textSelectedValueOfItemColor : textQuantityColor$default);
                        mutableStateFlow = this.this$0.get_uiState();
                        do {
                            value7 = mutableStateFlow.getValue();
                            craftUiState7 = value7;
                        } while (!mutableStateFlow.compareAndSet(value7, craftUiState7.copy(((-268435457) & 1) != 0 ? craftUiState7.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState7.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState7.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState7.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState7.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState7.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState7.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState7.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState7.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState7.quantityInQueue : quantityInQueue, ((-268435457) & 1024) != 0 ? craftUiState7.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState7.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState7.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState7.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState7.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState7.mapOfCraftElements : map, ((-268435457) & 65536) != 0 ? craftUiState7.listWithStorageItems : arrayList2, ((-268435457) & 131072) != 0 ? craftUiState7.listWithProductionItems : list2, ((-268435457) & 262144) != 0 ? craftUiState7.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState7.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState7.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState7.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState7.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState7.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState7.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState7.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState7.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState7.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState7.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState7.allElementsForCraftAfterFilter : listEmptyList2, ((-268435457) & 1073741824) != 0 ? craftUiState7.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState7.selectedCategory : null, (1019 & 1) != 0 ? craftUiState7.filterList : null, (1019 & 2) != 0 ? craftUiState7.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState7.craftingControlInfo : craftCraftingControlCopy, (1019 & 8) != 0 ? craftUiState7.valueOfRubles : iOptInt, (1019 & 16) != 0 ? craftUiState7.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState7.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState7.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState7.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState7.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState7.isBlockingLoading : false)));
                    }
                }
            } else if (i11 == 1) {
                iOptInt3 = this.I$2;
                iOptInt2 = this.I$1;
                iOptInt = this.I$0;
                map = (Map) this.L$0;
                ResultKt.throwOnFailure(obj);
                listWithProductionItems = obj;
                list2 = (List) listWithProductionItems;
                List<CraftElement> listWithStorageItems32 = this.this$0.getUiState().getValue().getListWithStorageItems();
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listWithStorageItems32, 10));
                for (CraftElement craftElementCopy3 : listWithStorageItems32) {
                    Iterator it13 = CollectionsKt__IterablesKt.flatten(map.values()).iterator();
                    while (true) {
                        if (!it13.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it13.next();
                        if (((CraftElement) next3).getElementId() == craftElementCopy3.getElementId()) {
                            break;
                        }
                    }
                    CraftElement craftElement5 = (CraftElement) next3;
                    if (craftElement5 != null) {
                        craftElementCopy3 = craftElementCopy3.copy((57085 & 1) != 0 ? craftElementCopy3.elementId : 0, (57085 & 2) != 0 ? craftElementCopy3.serverId : 0, (57085 & 4) != 0 ? craftElementCopy3.imageName : null, (57085 & 8) != 0 ? craftElementCopy3.imageType : 0, (57085 & 16) != 0 ? craftElementCopy3.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy3.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy3.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy3.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy3.elementState : null, (57085 & 512) != 0 ? craftElementCopy3.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy3.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy3.componentsList : craftElement5.getComponentsList(), (57085 & 4096) != 0 ? craftElementCopy3.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy3.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy3.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy3.itemCategory : 0);
                    }
                    arrayList2.add(craftElementCopy3);
                }
                quantityInQueue = this.this$0.getUiState().getValue().getQuantityInQueue() + iOptInt3;
                i9 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getUiState().getValue().getCurrentScreen().ordinal()];
                if (i9 != 1) {
                    listEmptyList2 = (List) map.get(Boxing.boxInt(this.this$0.getUiState().getValue().getSelectedCategory().getCategoryId()));
                    if (listEmptyList2 == null) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                } else if (i9 == 2) {
                    listEmptyList2 = arrayList2;
                } else {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listEmptyList2 = list2;
                }
                it3 = CollectionsKt__IterablesKt.flatten(map.values()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (((CraftElement) next2).getElementId() == iOptInt2) {
                        break;
                    }
                }
                craftElement = (CraftElement) next2;
                if (craftElement == null) {
                    craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                }
                boolean z = iOptInt > this.this$0.get_uiState().getValue().getValueOfRubles();
                int textQuantityColor$default2 = CraftViewModel.getTextQuantityColor$default(this.this$0, craftElement, 0, 2, null);
                CraftCraftingControl craftingControlInfo2 = this.this$0.get_uiState().getValue().getCraftingControlInfo();
                craftCraftingControlCopy = craftingControlInfo2.copy((805 & 1) != 0 ? craftingControlInfo2.typeOfBlock : 0, (805 & 2) != 0 ? craftingControlInfo2.selectedValueOfItem : 1, (805 & 4) != 0 ? craftingControlInfo2.maxValueOfItems : 0, (805 & 8) != 0 ? craftingControlInfo2.selectedWeight : craftElement.getTextBlock().getWeight(), (805 & 16) != 0 ? craftingControlInfo2.craftingCost : String.valueOf(craftElement.getCraftingCost()), (805 & 32) != 0 ? craftingControlInfo2.timeUntilItemWillBePrepared : 0, (805 & 64) != 0 ? craftingControlInfo2.isEnoughMoney : z, (805 & 128) != 0 ? craftingControlInfo2.isEnoughResources : craftElement.isEnoughResources(), (805 & 256) != 0 ? craftingControlInfo2.isLowLevel : false, (805 & 512) != 0 ? craftingControlInfo2.isWorkbenchLevelInsufficient : false, (805 & 1024) != 0 ? craftingControlInfo2.isEnabledMainButton : !craftElement.isEnoughResources() && z, (805 & 2048) != 0 ? craftingControlInfo2.textSelectedValueOfItemColor : textQuantityColor$default2);
                mutableStateFlow = this.this$0.get_uiState();
                do {
                    value7 = mutableStateFlow.getValue();
                    craftUiState7 = value7;
                } while (!mutableStateFlow.compareAndSet(value7, craftUiState7.copy(((-268435457) & 1) != 0 ? craftUiState7.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState7.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState7.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState7.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState7.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState7.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState7.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState7.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState7.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState7.quantityInQueue : quantityInQueue, ((-268435457) & 1024) != 0 ? craftUiState7.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState7.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState7.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState7.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState7.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState7.mapOfCraftElements : map, ((-268435457) & 65536) != 0 ? craftUiState7.listWithStorageItems : arrayList2, ((-268435457) & 131072) != 0 ? craftUiState7.listWithProductionItems : list2, ((-268435457) & 262144) != 0 ? craftUiState7.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState7.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState7.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState7.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState7.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState7.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState7.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState7.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState7.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState7.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState7.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState7.allElementsForCraftAfterFilter : listEmptyList2, ((-268435457) & 1073741824) != 0 ? craftUiState7.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState7.selectedCategory : null, (1019 & 1) != 0 ? craftUiState7.filterList : null, (1019 & 2) != 0 ? craftUiState7.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState7.craftingControlInfo : craftCraftingControlCopy, (1019 & 8) != 0 ? craftUiState7.valueOfRubles : iOptInt, (1019 & 16) != 0 ? craftUiState7.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState7.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState7.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState7.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState7.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState7.isBlockingLoading : false)));
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = this.I$6;
                i3 = this.I$5;
                int i23 = this.I$4;
                i7 = this.I$3;
                i5 = this.I$2;
                i4 = this.I$1;
                i6 = this.I$0;
                list3 = (List) this.L$3;
                Map<Integer, List<CraftElement>> map5 = (Map) this.L$2;
                list = (List) this.L$1;
                CraftViewModel craftViewModel4 = (CraftViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                craftViewModel2 = craftViewModel4;
                map4 = map5;
                iIntValue = i23;
                listWithProductionItems2 = obj;
                list4 = (List) listWithProductionItems2;
                it4 = list3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    Object next4 = it4.next();
                    it5 = it4;
                    if (((CraftElement) next4).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                        obj6 = next4;
                        break;
                    }
                    it4 = it5;
                }
                buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(craftViewModel2.getUiState().getValue().getButtonAnimatedAttachment(), false, false, AnyExtensionKt.isNotNull(obj6), 3, null);
                i10 = WhenMappings.$EnumSwitchMapping$0[craftViewModel2.getUiState().getValue().getCurrentScreen().ordinal()];
                if (i10 != 1) {
                    List<CraftElement> listEmptyList3 = map4.get(Boxing.boxInt(craftViewModel2.getUiState().getValue().getSelectedCategory().getCategoryId()));
                    if (listEmptyList3 == null) {
                        listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    list5 = listEmptyList3;
                } else if (i10 == 2) {
                    list5 = list3;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list5 = list4;
                }
                mutableStateFlow2 = craftViewModel2.get_uiState();
                do {
                    value8 = mutableStateFlow2.getValue();
                    craftUiState8 = value8;
                } while (!mutableStateFlow2.compareAndSet(value8, craftUiState8.copy(((-268435457) & 1) != 0 ? craftUiState8.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState8.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState8.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState8.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState8.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState8.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState8.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState8.levelOfSkill : (i4 != 0 || i6 <= -1) ? craftViewModel2.getUiState().getValue().getLevelOfSkill() : i6, ((-268435457) & 256) != 0 ? craftUiState8.percentOfSkill : i8, ((-268435457) & 512) != 0 ? craftUiState8.quantityInQueue : i3, ((-268435457) & 1024) != 0 ? craftUiState8.queueMax : i5, ((-268435457) & 2048) != 0 ? craftUiState8.quantityInStorage : i7, ((-268435457) & 4096) != 0 ? craftUiState8.storageMax : iIntValue, ((-268435457) & 8192) != 0 ? craftUiState8.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState8.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState8.mapOfCraftElements : map4, ((-268435457) & 65536) != 0 ? craftUiState8.listWithStorageItems : list3, ((-268435457) & 131072) != 0 ? craftUiState8.listWithProductionItems : list4, ((-268435457) & 262144) != 0 ? craftUiState8.listOfLevelUpElements : list, ((-268435457) & 524288) != 0 ? craftUiState8.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState8.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState8.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState8.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState8.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState8.isNeedToShowLevelUpDialog : i4 == 0, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState8.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState8.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState8.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState8.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState8.allElementsForCraftAfterFilter : list5, ((-268435457) & 1073741824) != 0 ? craftUiState8.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState8.selectedCategory : null, (1019 & 1) != 0 ? craftUiState8.filterList : null, (1019 & 2) != 0 ? craftUiState8.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState8.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState8.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState8.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState8.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState8.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState8.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState8.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState8.isBlockingLoading : false)));
            } else {
                i8 = this.I$6;
                int i24 = this.I$5;
                int i25 = this.I$4;
                i7 = this.I$3;
                i5 = this.I$2;
                i4 = this.I$1;
                i6 = this.I$0;
                map2 = (Map) this.L$4;
                Map<Integer, List<CraftElement>> map6 = (Map) this.L$3;
                List<CraftElement> list11 = (List) this.L$2;
                jSONObject = (JSONObject) this.L$1;
                CraftViewModel craftViewModel5 = (CraftViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                map3 = map6;
                iIntValue = i25;
                obj3 = coroutine_suspended;
                i3 = i24;
                list = list11;
                craftViewModel = craftViewModel5;
                listWithStorageItems = obj;
                collection = (Collection) listWithStorageItems;
                if (collection.isEmpty()) {
                    obj4 = obj3;
                    collection2 = collection;
                } else {
                    List<CraftElement> listWithStorageItems4 = craftViewModel.getUiState().getValue().getListWithStorageItems();
                    obj4 = obj3;
                    Collection arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listWithStorageItems4, 10));
                    Iterator it14 = listWithStorageItems4.iterator();
                    while (it14.hasNext()) {
                        CraftElement craftElement6 = (CraftElement) it14.next();
                        Iterator it15 = it14;
                        CraftElement craftElement7 = (CraftElement) map2.get(Boxing.boxInt(craftElement6.getElementId()));
                        if (craftElement7 != null && (craftElementCopy = craftElement6.copy((57085 & 1) != 0 ? craftElement6.elementId : 0, (57085 & 2) != 0 ? craftElement6.serverId : 0, (57085 & 4) != 0 ? craftElement6.imageName : null, (57085 & 8) != 0 ? craftElement6.imageType : 0, (57085 & 16) != 0 ? craftElement6.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElement6.preparationTime : 0, (57085 & 64) != 0 ? craftElement6.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElement6.elementRarity : null, (57085 & 256) != 0 ? craftElement6.elementState : null, (57085 & 512) != 0 ? craftElement6.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElement6.textBlock : null, (57085 & 2048) != 0 ? craftElement6.componentsList : craftElement7.getComponentsList(), (57085 & 4096) != 0 ? craftElement6.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElement6.valueOfTimer : null, (57085 & 16384) != 0 ? craftElement6.craftingCost : 0, (57085 & 32768) != 0 ? craftElement6.itemCategory : 0)) != null) {
                            craftElement6 = craftElementCopy;
                        }
                        arrayList11.add(craftElement6);
                        it14 = it15;
                    }
                    collection2 = arrayList11;
                }
                list3 = (List) collection2;
                this.L$0 = craftViewModel;
                this.L$1 = list;
                this.L$2 = map3;
                this.L$3 = list3;
                this.L$4 = null;
                this.I$0 = i6;
                this.I$1 = i4;
                this.I$2 = i5;
                this.I$3 = i7;
                this.I$4 = iIntValue;
                this.I$5 = i3;
                this.I$6 = i8;
                this.label = 3;
                listWithProductionItems2 = craftViewModel.parseListWithProductionItems(jSONObject, map3, this);
                obj5 = obj4;
                if (listWithProductionItems2 != obj5) {
                    return obj5;
                }
                map4 = map3;
                craftViewModel2 = craftViewModel;
                list4 = (List) listWithProductionItems2;
                it4 = list3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                    }
                    it4 = it5;
                }
                buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(craftViewModel2.getUiState().getValue().getButtonAnimatedAttachment(), false, false, AnyExtensionKt.isNotNull(obj6), 3, null);
                i10 = WhenMappings.$EnumSwitchMapping$0[craftViewModel2.getUiState().getValue().getCurrentScreen().ordinal()];
                if (i10 != 1) {
                }
                mutableStateFlow2 = craftViewModel2.get_uiState();
                do {
                    value8 = mutableStateFlow2.getValue();
                    craftUiState8 = value8;
                } while (!mutableStateFlow2.compareAndSet(value8, craftUiState8.copy(((-268435457) & 1) != 0 ? craftUiState8.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState8.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState8.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState8.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState8.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState8.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState8.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState8.levelOfSkill : (i4 != 0 || i6 <= -1) ? craftViewModel2.getUiState().getValue().getLevelOfSkill() : i6, ((-268435457) & 256) != 0 ? craftUiState8.percentOfSkill : i8, ((-268435457) & 512) != 0 ? craftUiState8.quantityInQueue : i3, ((-268435457) & 1024) != 0 ? craftUiState8.queueMax : i5, ((-268435457) & 2048) != 0 ? craftUiState8.quantityInStorage : i7, ((-268435457) & 4096) != 0 ? craftUiState8.storageMax : iIntValue, ((-268435457) & 8192) != 0 ? craftUiState8.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState8.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState8.mapOfCraftElements : map4, ((-268435457) & 65536) != 0 ? craftUiState8.listWithStorageItems : list3, ((-268435457) & 131072) != 0 ? craftUiState8.listWithProductionItems : list4, ((-268435457) & 262144) != 0 ? craftUiState8.listOfLevelUpElements : list, ((-268435457) & 524288) != 0 ? craftUiState8.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState8.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState8.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState8.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState8.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState8.isNeedToShowLevelUpDialog : i4 == 0, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState8.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState8.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState8.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState8.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState8.allElementsForCraftAfterFilter : list5, ((-268435457) & 1073741824) != 0 ? craftUiState8.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState8.selectedCategory : null, (1019 & 1) != 0 ? craftUiState8.filterList : null, (1019 & 2) != 0 ? craftUiState8.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState8.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState8.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState8.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState8.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState8.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState8.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState8.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState8.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38601(json, this, null), 1, null);
    }

    public final List<CraftElement> getLevelUpElementsList(int levelOfSkill) {
        Map<Integer, List<CraftElement>> mapOfCraftElements = get_uiState().getValue().getMapOfCraftElements();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, List<CraftElement>>> it = mapOfCraftElements.entrySet().iterator();
        while (it.hasNext()) {
            List<CraftElement> value = it.next().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                if (((CraftElement) obj).getElementRarity().getValue() == levelOfSkill) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt___CollectionsKt.sortedWith(arrayList2, ComparisonsKt__ComparisonsKt.compareBy(new Function1<CraftElement, Comparable<?>>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$getLevelUpElementsList$1$2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull CraftElement it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Integer.valueOf(it2.getItemCategory());
                }
            }, new Function1<CraftElement, Comparable<?>>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel$getLevelUpElementsList$1$3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull CraftElement it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Integer.valueOf(it2.getElementId());
                }
            })));
        }
        return arrayList;
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onCategoryClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onCategoryClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onCategoryClick$1\n*L\n670#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onCategoryClick$1 */
    /* loaded from: classes.dex */
    public static final class C38511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CommonButtonCategory $category;
        public final /* synthetic */ int $index;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38511(int i, CommonButtonCategory commonButtonCategory, Continuation<? super C38511> continuation) {
            super(2, continuation);
            this.$index = i;
            this.$category = commonButtonCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38511(this.$index, this.$category, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            CraftScreenTypeEnum craftScreenTypeEnum;
            CraftScreenTypeObject craftScreenTypeObject;
            CraftElement craftElement;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CraftViewModel.this.returnToDefaultValueOldSelectedElement();
                int selectedCategoryIndex = CraftViewModel.this.getUiState().getValue().getSelectedCategoryIndex();
                if (selectedCategoryIndex != this.$index) {
                    CommonButtonCategory commonButtonCategoryCopy$default = CommonButtonCategory.copy$default(this.$category, 0, null, null, true, false, null, null, 119, null);
                    CommonButtonCategory commonButtonCategoryCopy$default2 = CommonButtonCategory.copy$default(CraftViewModel.this.getUiState().getValue().getSelectedCategory(), 0, null, null, false, false, null, null, 119, null);
                    List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) CraftViewModel.this.getUiState().getValue().getCategories());
                    mutableList.set(this.$index, commonButtonCategoryCopy$default);
                    mutableList.set(selectedCategoryIndex, commonButtonCategoryCopy$default2);
                    CraftViewModel craftViewModel = CraftViewModel.this;
                    List listSortingList$default = CraftViewModel.sortingList$default(craftViewModel, craftViewModel.get_uiState().getValue().getMapOfCraftElements().getOrDefault(Boxing.boxInt(commonButtonCategoryCopy$default.getCategoryId()), CollectionsKt__CollectionsKt.emptyList()), null, 2, null);
                    MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
                    int i = this.$index;
                    do {
                        value = mutableStateFlow.getValue();
                        craftUiState = value;
                        craftScreenTypeEnum = CraftScreenTypeEnum.CRAFT;
                        craftScreenTypeObject = new CraftScreenTypeObject(commonButtonCategoryCopy$default.getIconCDN(), commonButtonCategoryCopy$default.getCategoryName());
                        craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull(listSortingList$default);
                        if (craftElement == null) {
                            craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : craftScreenTypeEnum, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listSortingList$default, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : mutableList, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : commonButtonCategoryCopy$default, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : i, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCategoryClick(@NotNull CommonButtonCategory category, int index) {
        Intrinsics.checkNotNullParameter(category, "category");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38511(index, category, null), 1, null);
    }

    public final void onArrowBottomClick() {
        int selectedCategoryIndex = getUiState().getValue().getSelectedCategoryIndex();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        int i = selectedCategoryIndex + 1;
        if (i != categories.size()) {
            onCategoryClick(categories.get(i), i);
        }
    }

    public final void onArrowTopClick() {
        int selectedCategoryIndex = getUiState().getValue().getSelectedCategoryIndex();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        int i = selectedCategoryIndex - 1;
        if (i >= 0) {
            onCategoryClick(categories.get(i), i);
        }
    }

    public final void showOrHideFilter() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : !craftUiState.isNeedToShowFilter(), ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    public final void onInfoButtonClicked() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : true, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    public final void onCloseHintsClick() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    public final void onCloseLevelUpDialog() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    public static /* synthetic */ void onButtonCraftClick$default(CraftViewModel craftViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !craftViewModel.get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded();
        }
        craftViewModel.onButtonCraftClick(z);
    }

    public final void onButtonCraftClick(boolean isButtonsExpanded) {
        CraftUiState value;
        CraftUiState craftUiState;
        ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), isButtonsExpanded, false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.CRAFT) {
            ViewModelExtensionKt.launchOnDefault$default(this, null, new C38471(buttonAnimatedAttachmentCopy$default, null), 1, null);
            return;
        }
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonCraftClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonCraftClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonCraftClick$1\n*L\n749#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonCraftClick$1 */
    /* loaded from: classes.dex */
    public static final class C38471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ButtonAnimatedAttachment $buttonAnimatedAttachment;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38471(ButtonAnimatedAttachment buttonAnimatedAttachment, Continuation<? super C38471> continuation) {
            super(2, continuation);
            this.$buttonAnimatedAttachment = buttonAnimatedAttachment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38471(this.$buttonAnimatedAttachment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List listSortingList$default = CraftViewModel.sortingList$default(CraftViewModel.this, null, null, 3, null);
            MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
            CraftViewModel craftViewModel = CraftViewModel.this;
            ButtonAnimatedAttachment buttonAnimatedAttachment = this.$buttonAnimatedAttachment;
            while (true) {
                CraftUiState value = mutableStateFlow.getValue();
                CraftUiState craftUiState = value;
                ButtonAnimatedAttachment buttonAnimatedAttachment2 = buttonAnimatedAttachment;
                if (mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : CraftScreenTypeEnum.CRAFT, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : new CraftScreenTypeObject(craftViewModel.get_uiState().getValue().getSelectedCategory().getIconCDN(), craftViewModel.get_uiState().getValue().getSelectedCategory().getCategoryName()), ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachment2, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listSortingList$default, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                buttonAnimatedAttachment = buttonAnimatedAttachment2;
            }
        }
    }

    public final void onButtonStashClick() {
        CraftUiState value;
        CraftUiState craftUiState;
        ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), !get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded(), false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.STASH) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C38491(buttonAnimatedAttachmentCopy$default, null), 1, null);
            return;
        }
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonStashClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonStashClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonStashClick$1\n*L\n782#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonStashClick$1 */
    /* loaded from: classes.dex */
    public static final class C38491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ButtonAnimatedAttachment $buttonAnimatedAttachment;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38491(ButtonAnimatedAttachment buttonAnimatedAttachment, Continuation<? super C38491> continuation) {
            super(2, continuation);
            this.$buttonAnimatedAttachment = buttonAnimatedAttachment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38491(this.$buttonAnimatedAttachment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Resources resources = CraftViewModel.this.application.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Bitmap bitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_stash);
                String string = CraftViewModel.this.stringResources.getString(R.string.craft_get_all_craft);
                MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
                CraftViewModel craftViewModel = CraftViewModel.this;
                ButtonAnimatedAttachment buttonAnimatedAttachment = this.$buttonAnimatedAttachment;
                while (true) {
                    CraftUiState value = mutableStateFlow.getValue();
                    CraftUiState craftUiState = value;
                    CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.STASH;
                    CraftScreenTypeObject craftScreenTypeObject = new CraftScreenTypeObject(bitmap, craftViewModel.stringResources.getString(R.string.craft_storage));
                    List<CraftElement> listWithStorageItems = craftViewModel.getUiState().getValue().getListWithStorageItems();
                    CraftElement craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull((List) craftViewModel.getUiState().getValue().getListWithStorageItems());
                    if (craftElement == null) {
                        craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                    }
                    ButtonAnimatedAttachment buttonAnimatedAttachment2 = buttonAnimatedAttachment;
                    CraftViewModel craftViewModel2 = craftViewModel;
                    if (mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : craftScreenTypeEnum, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachment2, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listWithStorageItems, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : string, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false))) {
                        return Unit.INSTANCE;
                    }
                    buttonAnimatedAttachment = buttonAnimatedAttachment2;
                    craftViewModel = craftViewModel2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onButtonProgressClick() {
        CraftUiState value;
        CraftUiState craftUiState;
        ButtonAnimatedAttachment buttonAnimatedAttachmentCopy$default = ButtonAnimatedAttachment.copy$default(get_uiState().getValue().getButtonAnimatedAttachment(), !get_uiState().getValue().getButtonAnimatedAttachment().isButtonsExpanded(), false, false, 6, null);
        if (getUiState().getValue().getCurrentScreen() != CraftScreenTypeEnum.PROGRESS) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C38481(buttonAnimatedAttachmentCopy$default, null), 1, null);
            return;
        }
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachmentCopy$default, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonProgressClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonProgressClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onButtonProgressClick$1\n*L\n819#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onButtonProgressClick$1 */
    /* loaded from: classes.dex */
    public static final class C38481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ButtonAnimatedAttachment $buttonAnimatedAttachment;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38481(ButtonAnimatedAttachment buttonAnimatedAttachment, Continuation<? super C38481> continuation) {
            super(2, continuation);
            this.$buttonAnimatedAttachment = buttonAnimatedAttachment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38481(this.$buttonAnimatedAttachment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Resources resources = CraftViewModel.this.application.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Bitmap bitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_progress);
                String string = CraftViewModel.this.stringResources.getString(R.string.common_add);
                MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
                CraftViewModel craftViewModel = CraftViewModel.this;
                ButtonAnimatedAttachment buttonAnimatedAttachment = this.$buttonAnimatedAttachment;
                while (true) {
                    CraftUiState value = mutableStateFlow.getValue();
                    CraftUiState craftUiState = value;
                    CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.PROGRESS;
                    CraftScreenTypeObject craftScreenTypeObject = new CraftScreenTypeObject(bitmap, craftViewModel.stringResources.getString(R.string.craft_process));
                    List<CraftElement> listWithProductionItems = craftViewModel.getUiState().getValue().getListWithProductionItems();
                    CraftElement craftElement = (CraftElement) CollectionsKt___CollectionsKt.firstOrNull((List) craftViewModel.getUiState().getValue().getListWithStorageItems());
                    if (craftElement == null) {
                        craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, null, null, 0, null, 0, 0, 65535, null);
                    }
                    ButtonAnimatedAttachment buttonAnimatedAttachment2 = buttonAnimatedAttachment;
                    CraftViewModel craftViewModel2 = craftViewModel;
                    if (mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : craftScreenTypeEnum, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : craftScreenTypeObject, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachment2, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElement, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listWithProductionItems, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : string, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false))) {
                        return Unit.INSTANCE;
                    }
                    buttonAnimatedAttachment = buttonAnimatedAttachment2;
                    craftViewModel = craftViewModel2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$sendCloseScreen$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$sendCloseScreen$1\n*L\n855#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$sendCloseScreen$1 */
    /* loaded from: classes.dex */
    public static final class C38551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38551(Continuation<? super C38551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CraftViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    craftUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : true, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38551(null), 1, null);
    }

    public final void selectCraftElement(@NotNull CraftElement element) throws JSONException {
        ArrayList arrayList;
        CraftElement craftElementCopy;
        boolean z;
        int i;
        int i2;
        CraftUiState value;
        CraftUiState craftUiState;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        int elementId;
        Intrinsics.checkNotNullParameter(element, "element");
        returnToDefaultValueOldSelectedElement();
        CraftScreenTypeEnum currentScreen = getUiState().getValue().getCurrentScreen();
        List<CommonButtonCategory> categories = getUiState().getValue().getCategories();
        CommonButtonCategory selectedCategory = getUiState().getValue().getSelectedCategory();
        if (getUiState().getValue().getMapOfCraftElements().get(Integer.valueOf(getUiState().getValue().getSelectedCategory().getCategoryId())) == null) {
            CollectionsKt__CollectionsKt.emptyList();
        }
        Map<Integer, List<CraftElement>> mapOfCraftElements = getUiState().getValue().getMapOfCraftElements();
        List<CraftElement> listWithStorageItems = getUiState().getValue().getListWithStorageItems();
        List<CraftElement> allElementsForCraftAfterFilter = getUiState().getValue().getAllElementsForCraftAfterFilter();
        ButtonAnimatedAttachment buttonAnimatedAttachment = getUiState().getValue().getButtonAnimatedAttachment();
        int i3 = WhenMappings.$EnumSwitchMapping$0[currentScreen.ordinal()];
        if (i3 == 1) {
            List<CraftIngredient> componentsList = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            for (CraftIngredient craftIngredient : componentsList) {
                arrayList.add(craftIngredient.copy((1791 & 1) != 0 ? craftIngredient.id : 0, (1791 & 2) != 0 ? craftIngredient.rarity : null, (1791 & 4) != 0 ? craftIngredient.name : null, (1791 & 8) != 0 ? craftIngredient.description : null, (1791 & 16) != 0 ? craftIngredient.imageName : null, (1791 & 32) != 0 ? craftIngredient.imageType : 0, (1791 & 64) != 0 ? craftIngredient.count : 0, (1791 & 128) != 0 ? craftIngredient.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient.quantityInStock : 0, (1791 & 512) != 0 ? craftIngredient.isInWork : false, (1791 & 1024) != 0 ? craftIngredient.isInStorage : true));
            }
        } else if (i3 == 2) {
            List<CraftIngredient> componentsList2 = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList2, 10));
            for (CraftIngredient craftIngredient2 : componentsList2) {
                arrayList.add(craftIngredient2.copy((1791 & 1) != 0 ? craftIngredient2.id : 0, (1791 & 2) != 0 ? craftIngredient2.rarity : null, (1791 & 4) != 0 ? craftIngredient2.name : null, (1791 & 8) != 0 ? craftIngredient2.description : null, (1791 & 16) != 0 ? craftIngredient2.imageName : null, (1791 & 32) != 0 ? craftIngredient2.imageType : 0, (1791 & 64) != 0 ? craftIngredient2.count : 0, (1791 & 128) != 0 ? craftIngredient2.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient2.quantityInStock : 0, (1791 & 512) != 0 ? craftIngredient2.isInWork : true, (1791 & 1024) != 0 ? craftIngredient2.isInStorage : false));
            }
        } else {
            List<CraftIngredient> componentsList3 = element.getComponentsList();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList3, 10));
            for (CraftIngredient craftIngredient3 : componentsList3) {
                arrayList.add(craftIngredient3.copy((1791 & 1) != 0 ? craftIngredient3.id : 0, (1791 & 2) != 0 ? craftIngredient3.rarity : null, (1791 & 4) != 0 ? craftIngredient3.name : null, (1791 & 8) != 0 ? craftIngredient3.description : null, (1791 & 16) != 0 ? craftIngredient3.imageName : null, (1791 & 32) != 0 ? craftIngredient3.imageType : 0, (1791 & 64) != 0 ? craftIngredient3.count : 0, (1791 & 128) != 0 ? craftIngredient3.quantityNeeded : 0, (1791 & 256) != 0 ? craftIngredient3.quantityInStock : 0, (1791 & 512) != 0 ? craftIngredient3.isInWork : false, (1791 & 1024) != 0 ? craftIngredient3.isInStorage : false));
            }
        }
        ArrayList arrayList3 = arrayList;
        if (WhenMappings.$EnumSwitchMapping$1[element.getElementState().ordinal()] == 1) {
            List<CraftIngredient> componentsList4 = element.getComponentsList();
            int size = componentsList4.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    if (!componentsList4.get(i4).isEnough()) {
                        break;
                    } else {
                        i4++;
                    }
                } else if (currentScreen == CraftScreenTypeEnum.CRAFT) {
                    craftElementCopy = element.copy((57085 & 1) != 0 ? element.elementId : 0, (57085 & 2) != 0 ? element.serverId : 0, (57085 & 4) != 0 ? element.imageName : null, (57085 & 8) != 0 ? element.imageType : 0, (57085 & 16) != 0 ? element.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? element.preparationTime : 0, (57085 & 64) != 0 ? element.timeWhenElementCreated : null, (57085 & 128) != 0 ? element.elementRarity : null, (57085 & 256) != 0 ? element.elementState : CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING, (57085 & 512) != 0 ? element.valueOfPipeline : 0, (57085 & 1024) != 0 ? element.textBlock : null, (57085 & 2048) != 0 ? element.componentsList : arrayList3, (57085 & 4096) != 0 ? element.valueOfPercent : 0, (57085 & 8192) != 0 ? element.valueOfTimer : null, (57085 & 16384) != 0 ? element.craftingCost : 0, (57085 & 32768) != 0 ? element.itemCategory : 0);
                }
            }
            craftElementCopy = element.copy((57085 & 1) != 0 ? element.elementId : 0, (57085 & 2) != 0 ? element.serverId : 0, (57085 & 4) != 0 ? element.imageName : null, (57085 & 8) != 0 ? element.imageType : 0, (57085 & 16) != 0 ? element.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? element.preparationTime : 0, (57085 & 64) != 0 ? element.timeWhenElementCreated : null, (57085 & 128) != 0 ? element.elementRarity : null, (57085 & 256) != 0 ? element.elementState : CraftElementStatusEnum.DEFAULT, (57085 & 512) != 0 ? element.valueOfPipeline : 0, (57085 & 1024) != 0 ? element.textBlock : null, (57085 & 2048) != 0 ? element.componentsList : arrayList3, (57085 & 4096) != 0 ? element.valueOfPercent : 0, (57085 & 8192) != 0 ? element.valueOfTimer : null, (57085 & 16384) != 0 ? element.craftingCost : 0, (57085 & 32768) != 0 ? element.itemCategory : 0);
            CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.STASH;
            int i5 = currentScreen == craftScreenTypeEnum ? 7 : 2;
            if (currentScreen == craftScreenTypeEnum) {
                elementId = craftElementCopy.getServerId();
            } else {
                elementId = craftElementCopy.getElementId();
            }
            this.actionWithJSON.sendNewItemPressed(i5, elementId);
            z = true;
        } else {
            craftElementCopy = element.copy((57085 & 1) != 0 ? element.elementId : 0, (57085 & 2) != 0 ? element.serverId : 0, (57085 & 4) != 0 ? element.imageName : null, (57085 & 8) != 0 ? element.imageType : 0, (57085 & 16) != 0 ? element.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? element.preparationTime : 0, (57085 & 64) != 0 ? element.timeWhenElementCreated : null, (57085 & 128) != 0 ? element.elementRarity : null, (57085 & 256) != 0 ? element.elementState : null, (57085 & 512) != 0 ? element.valueOfPipeline : 0, (57085 & 1024) != 0 ? element.textBlock : null, (57085 & 2048) != 0 ? element.componentsList : arrayList3, (57085 & 4096) != 0 ? element.valueOfPercent : 0, (57085 & 8192) != 0 ? element.valueOfTimer : null, (57085 & 16384) != 0 ? element.craftingCost : 0, (57085 & 32768) != 0 ? element.itemCategory : 0);
            z = false;
        }
        int valueOfRubles = get_uiState().getValue().getValueOfRubles();
        int levelOfSkill = get_uiState().getValue().getLevelOfSkill();
        int workbenchLevel = getUiState().getValue().getWorkbenchLevel();
        boolean z4 = valueOfRubles >= craftElementCopy.getCraftingCost();
        boolean zIsEnoughResources = element.isEnoughResources();
        int value2 = element.getElementRarity().getValue();
        boolean z5 = levelOfSkill < value2;
        boolean z6 = workbenchLevel < value2;
        CraftScreenTypeEnum currentScreen2 = getUiState().getValue().getCurrentScreen();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i6 = iArr[currentScreen2.ordinal()];
        if (i6 != 1) {
            i = 2;
            if (i6 == 2) {
                int i7 = WhenMappings.$EnumSwitchMapping$1[craftElementCopy.getElementState().ordinal()];
                i2 = i7 != 2 ? i7 != 3 ? 0 : 4 : 3;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1;
            }
        } else {
            i = 2;
            i2 = 2;
        }
        Object obj = null;
        CraftCraftingControl craftCraftingControlCopy = get_uiState().getValue().getCraftingControlInfo().copy(i2, 1, 10, craftElementCopy.getTextBlock().getWeight(), String.valueOf(craftElementCopy.getCraftingCost()), craftElementCopy.getTimeUntilItemPreparation(), z4, zIsEnoughResources, z5, z6, z4 && zIsEnoughResources && !z5 && !z6, getTextQuantityColor$default(this, craftElementCopy, 0, i, null));
        if (z) {
            int i8 = iArr[currentScreen.ordinal()];
            if (i8 == 1) {
                List<CraftElement> allElementsForCraftAfterFilter2 = getUiState().getValue().getAllElementsForCraftAfterFilter();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allElementsForCraftAfterFilter2, 10));
                for (CraftElement craftElementCopy2 : allElementsForCraftAfterFilter2) {
                    if (craftElementCopy.getServerId() == craftElementCopy2.getServerId()) {
                        craftElementCopy2 = craftElementCopy2.copy((57085 & 1) != 0 ? craftElementCopy2.elementId : 0, (57085 & 2) != 0 ? craftElementCopy2.serverId : 0, (57085 & 4) != 0 ? craftElementCopy2.imageName : null, (57085 & 8) != 0 ? craftElementCopy2.imageType : 0, (57085 & 16) != 0 ? craftElementCopy2.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy2.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy2.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy2.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy2.elementState : craftElementCopy.getElementState(), (57085 & 512) != 0 ? craftElementCopy2.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy2.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy2.componentsList : null, (57085 & 4096) != 0 ? craftElementCopy2.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy2.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy2.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy2.itemCategory : 0);
                    }
                    arrayList4.add(craftElementCopy2);
                }
                List<CraftElement> listWithStorageItems2 = getUiState().getValue().getListWithStorageItems();
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listWithStorageItems2, 10));
                for (CraftElement craftElementCopy3 : listWithStorageItems2) {
                    if (craftElementCopy3.getServerId() == craftElementCopy.getServerId()) {
                        craftElementCopy3 = craftElementCopy3.copy((57085 & 1) != 0 ? craftElementCopy3.elementId : 0, (57085 & 2) != 0 ? craftElementCopy3.serverId : 0, (57085 & 4) != 0 ? craftElementCopy3.imageName : null, (57085 & 8) != 0 ? craftElementCopy3.imageType : 0, (57085 & 16) != 0 ? craftElementCopy3.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy3.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy3.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy3.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy3.elementState : craftElementCopy.getElementState(), (57085 & 512) != 0 ? craftElementCopy3.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy3.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy3.componentsList : null, (57085 & 4096) != 0 ? craftElementCopy3.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy3.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy3.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy3.itemCategory : 0);
                    }
                    arrayList5.add(craftElementCopy3);
                }
                if (arrayList5.isEmpty()) {
                    z2 = false;
                    buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, false, z2, 3, null);
                    allElementsForCraftAfterFilter = arrayList4;
                    listWithStorageItems = arrayList5;
                } else {
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        if (((CraftElement) it.next()).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, false, z2, 3, null);
                    allElementsForCraftAfterFilter = arrayList4;
                    listWithStorageItems = arrayList5;
                }
            } else if (i8 == 3) {
                List<CraftElement> allElementsForCraftAfterFilter3 = getUiState().getValue().getAllElementsForCraftAfterFilter();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allElementsForCraftAfterFilter3, 10));
                for (CraftElement craftElementCopy4 : allElementsForCraftAfterFilter3) {
                    if (craftElementCopy.getElementId() == craftElementCopy4.getElementId()) {
                        craftElementCopy4 = craftElementCopy4.copy((57085 & 1) != 0 ? craftElementCopy4.elementId : 0, (57085 & 2) != 0 ? craftElementCopy4.serverId : 0, (57085 & 4) != 0 ? craftElementCopy4.imageName : null, (57085 & 8) != 0 ? craftElementCopy4.imageType : 0, (57085 & 16) != 0 ? craftElementCopy4.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy4.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy4.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy4.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy4.elementState : craftElementCopy.getElementState(), (57085 & 512) != 0 ? craftElementCopy4.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy4.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy4.componentsList : null, (57085 & 4096) != 0 ? craftElementCopy4.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy4.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy4.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy4.itemCategory : 0);
                    }
                    arrayList6.add(craftElementCopy4);
                }
                Map<Integer, List<CraftElement>> mapOfCraftElements2 = get_uiState().getValue().getMapOfCraftElements();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOfCraftElements2.size()));
                Iterator<T> it2 = mapOfCraftElements2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Iterable<CraftElement> iterable = (Iterable) entry.getValue();
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (CraftElement craftElementCopy5 : iterable) {
                        if (craftElementCopy.getElementId() == craftElementCopy5.getElementId()) {
                            craftElementCopy5 = craftElementCopy5.copy((57085 & 1) != 0 ? craftElementCopy5.elementId : 0, (57085 & 2) != 0 ? craftElementCopy5.serverId : 0, (57085 & 4) != 0 ? craftElementCopy5.imageName : null, (57085 & 8) != 0 ? craftElementCopy5.imageType : 0, (57085 & 16) != 0 ? craftElementCopy5.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? craftElementCopy5.preparationTime : 0, (57085 & 64) != 0 ? craftElementCopy5.timeWhenElementCreated : null, (57085 & 128) != 0 ? craftElementCopy5.elementRarity : null, (57085 & 256) != 0 ? craftElementCopy5.elementState : craftElementCopy.getElementState(), (57085 & 512) != 0 ? craftElementCopy5.valueOfPipeline : 0, (57085 & 1024) != 0 ? craftElementCopy5.textBlock : null, (57085 & 2048) != 0 ? craftElementCopy5.componentsList : null, (57085 & 4096) != 0 ? craftElementCopy5.valueOfPercent : 0, (57085 & 8192) != 0 ? craftElementCopy5.valueOfTimer : null, (57085 & 16384) != 0 ? craftElementCopy5.craftingCost : 0, (57085 & 32768) != 0 ? craftElementCopy5.itemCategory : 0);
                        }
                        arrayList7.add(craftElementCopy5);
                    }
                    linkedHashMap.put(key, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList7));
                }
                List list = (List) linkedHashMap.get(Integer.valueOf(selectedCategory.getCategoryId()));
                if (list != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Object objPrevious = listIterator.previous();
                        if (((CraftElement) objPrevious).getElementState() == CraftElementStatusEnum.NEW_ELEMENT) {
                            obj = objPrevious;
                            break;
                        }
                    }
                    obj = (CraftElement) obj;
                }
                boolean zIsNotNull = AnyExtensionKt.isNotNull(obj);
                selectedCategory = CommonButtonCategory.copy$default(getUiState().getValue().getSelectedCategory(), 0, null, null, false, zIsNotNull, null, null, 111, null);
                List<CommonButtonCategory> categories2 = getUiState().getValue().getCategories();
                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(categories2, 10));
                for (CommonButtonCategory commonButtonCategoryCopy$default : categories2) {
                    if (commonButtonCategoryCopy$default.getCategoryId() == selectedCategory.getCategoryId()) {
                        arrayList2 = arrayList8;
                        commonButtonCategoryCopy$default = CommonButtonCategory.copy$default(commonButtonCategoryCopy$default, 0, null, null, false, zIsNotNull, null, null, 111, null);
                    } else {
                        arrayList2 = arrayList8;
                    }
                    arrayList2.add(commonButtonCategoryCopy$default);
                    arrayList8 = arrayList2;
                }
                ArrayList arrayList9 = arrayList8;
                if (arrayList9.isEmpty()) {
                    z3 = false;
                    buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, z3, false, 5, null);
                    allElementsForCraftAfterFilter = arrayList6;
                    categories = arrayList9;
                    mapOfCraftElements = linkedHashMap;
                } else {
                    Iterator it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        if (((CommonButtonCategory) it3.next()).getHasUpdates()) {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                    buttonAnimatedAttachment = ButtonAnimatedAttachment.copy$default(getUiState().getValue().getButtonAnimatedAttachment(), false, z3, false, 5, null);
                    allElementsForCraftAfterFilter = arrayList6;
                    categories = arrayList9;
                    mapOfCraftElements = linkedHashMap;
                }
            }
        }
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : mapOfCraftElements, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : listWithStorageItems, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : buttonAnimatedAttachment, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElementCopy, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : allElementsForCraftAfterFilter, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : categories, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : selectedCategory, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : craftCraftingControlCopy, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$getOrAddElementForStorage$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$getOrAddElementForStorage$1 */
    /* loaded from: classes.dex */
    public static final class C38441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* compiled from: CraftViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$getOrAddElementForStorage$1$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CraftScreenTypeEnum.values().length];
                try {
                    iArr[CraftScreenTypeEnum.STASH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C38441(Continuation<? super C38441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[CraftViewModel.this.getUiState().getValue().getCurrentScreen().ordinal()];
            if (i == 1) {
                CraftViewModel.showDialogConfirmation$default(CraftViewModel.this, 4, null, 0, 0, 14, null);
            } else if (i == 2) {
                CraftViewModel.this.onButtonCraftClick(false);
            }
            return Unit.INSTANCE;
        }
    }

    public final void getOrAddElementForStorage() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38441(null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$checkFilter$1", m7120f = "CraftViewModel.kt", m7121i = {0, 0}, m7122l = {1118}, m7123m = "invokeSuspend", m7124n = {"sortedList", "isWithIndicationFilter"}, m7125s = {"L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$checkFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1747#2,3:1754\n230#3,5:1757\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$checkFilter$1\n*L\n1103#1:1754,3\n1120#1:1757,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$checkFilter$1 */
    /* loaded from: classes.dex */
    public static final class C38411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CraftItemCategoryFilter $filterCheckBox;
        public int I$0;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CraftViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38411(CraftItemCategoryFilter craftItemCategoryFilter, CraftViewModel craftViewModel, Continuation<? super C38411> continuation) {
            super(2, continuation);
            this.$filterCheckBox = craftItemCategoryFilter;
            this.this$0 = craftViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C38411 c38411 = new C38411(this.$filterCheckBox, this.this$0, continuation);
            c38411.L$0 = obj;
            return c38411;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            List listListOf;
            int i2;
            Ref.ObjectRef objectRef;
            CraftUiState value;
            CraftUiState craftUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.$filterCheckBox.setStateOfCheckBox(!r5.getStateOfCheckBox());
                boolean stateOfCheckBox = this.$filterCheckBox.getStateOfCheckBox();
                if (this.$filterCheckBox.getStateOfCheckBox()) {
                    i = 1;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = CollectionsKt__CollectionsKt.emptyList();
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CraftViewModel$checkFilter$1$deferredTasks$1(this.this$0, this.$filterCheckBox, stateOfCheckBox ? 1 : 0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CraftViewModel$checkFilter$1$deferredTasks$2(objectRef2, this.this$0, null), 3, null)});
                    this.L$0 = objectRef2;
                    this.I$0 = i;
                    this.label = 1;
                    if (AwaitKt.awaitAll(listListOf, this) != coroutine_suspended) {
                    }
                } else {
                    List<CraftCategoryFilter> filterList = this.this$0.getUiState().getValue().getFilterList();
                    if (!(filterList instanceof Collection) || !filterList.isEmpty()) {
                        Iterator<T> it = filterList.iterator();
                        loop1: while (it.hasNext()) {
                            List<CraftItemCategoryFilter> filters = ((CraftCategoryFilter) it.next()).getFilters();
                            if (!(filters instanceof Collection) || !filters.isEmpty()) {
                                Iterator<T> it2 = filters.iterator();
                                while (it2.hasNext()) {
                                    if (((CraftItemCategoryFilter) it2.next()).getStateOfCheckBox()) {
                                        i = 1;
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                    i = 0;
                    Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                    objectRef22.element = CollectionsKt__CollectionsKt.emptyList();
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CraftViewModel$checkFilter$1$deferredTasks$1(this.this$0, this.$filterCheckBox, stateOfCheckBox ? 1 : 0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CraftViewModel$checkFilter$1$deferredTasks$2(objectRef22, this.this$0, null), 3, null)});
                    this.L$0 = objectRef22;
                    this.I$0 = i;
                    this.label = 1;
                    if (AwaitKt.awaitAll(listListOf, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    objectRef = objectRef22;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow<CraftUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                craftUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : i2 != 0, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : (List) objectRef.element, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void checkFilter(@NotNull CraftItemCategoryFilter filterCheckBox) {
        Intrinsics.checkNotNullParameter(filterCheckBox, "filterCheckBox");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38411(filterCheckBox, this, null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$refreshFilter$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$refreshFilter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1549#2:1754\n1620#2,2:1755\n1549#2:1757\n1620#2,3:1758\n1622#2:1761\n230#3,5:1762\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$refreshFilter$1\n*L\n1131#1:1754\n1131#1:1755,2\n1132#1:1757\n1132#1:1758,3\n1131#1:1761\n1158#1:1762,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$refreshFilter$1 */
    /* loaded from: classes.dex */
    public static final class C38541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38541(Continuation<? super C38541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CraftCategoryFilter> filterList = CraftViewModel.this.getUiState().getValue().getFilterList();
            CraftViewModel craftViewModel = CraftViewModel.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterList, 10));
            for (CraftCategoryFilter craftCategoryFilter : filterList) {
                List<CraftItemCategoryFilter> filters = craftCategoryFilter.getFilters();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filters, 10));
                for (CraftItemCategoryFilter craftItemCategoryFilter : filters) {
                    if (craftItemCategoryFilter.getStateOfCheckBox()) {
                        craftViewModel.preferencesRepository.putInteger(craftItemCategoryFilter.getPreferenceKey(), 0);
                    }
                    arrayList2.add(craftItemCategoryFilter.m14450copyT042LqI((191 & 1) != 0 ? craftItemCategoryFilter.filterId : craftItemCategoryFilter.getFilterId(), (191 & 2) != 0 ? craftItemCategoryFilter.filterName : craftItemCategoryFilter.getFilterName(), (191 & 4) != 0 ? craftItemCategoryFilter.color : craftItemCategoryFilter.m14451getColor0d7_KjU(), (191 & 8) != 0 ? craftItemCategoryFilter.categoryId : craftItemCategoryFilter.getCategoryId(), (191 & 16) != 0 ? craftItemCategoryFilter.preferenceKey : craftItemCategoryFilter.getPreferenceKey(), (191 & 32) != 0 ? craftItemCategoryFilter.customEndPadding : craftItemCategoryFilter.getCustomEndPadding(), (191 & 64) != 0 ? craftItemCategoryFilter.stateOfCheckBox : false, (191 & 128) != 0 ? craftItemCategoryFilter.iconCDNBitmap : null));
                }
                arrayList.add(craftCategoryFilter.copy(craftCategoryFilter.getCategoryFilterId(), craftCategoryFilter.getCategoryFilterName(), arrayList2));
            }
            MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
            CraftViewModel craftViewModel2 = CraftViewModel.this;
            while (true) {
                CraftUiState value = mutableStateFlow.getValue();
                CraftUiState craftUiState = value;
                List<CraftElement> listEmptyList = craftViewModel2.getUiState().getValue().getMapOfCraftElements().get(Boxing.boxInt(craftViewModel2.getUiState().getValue().getSelectedCategory().getCategoryId()));
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                ArrayList arrayList3 = arrayList;
                if (mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : listEmptyList, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : arrayList3, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList3;
            }
        }
    }

    public final void refreshFilter() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38541(null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$subtractItemForCrafting$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$subtractItemForCrafting$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1549#2:1754\n1620#2,3:1755\n230#3,5:1758\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$subtractItemForCrafting$1\n*L\n1173#1:1754\n1173#1:1755,3\n1184#1:1758,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$subtractItemForCrafting$1 */
    /* loaded from: classes.dex */
    public static final class C38591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38591(Continuation<? super C38591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CraftIngredient> componentsList = CraftViewModel.this.get_uiState().getValue().getSelectedElement().getComponentsList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            for (CraftIngredient craftIngredient : componentsList) {
                craftIngredient.setCount(craftIngredient.getCount() - 1);
                arrayList.add(craftIngredient);
            }
            CraftElement selectedElement = CraftViewModel.this.get_uiState().getValue().getSelectedElement();
            CraftElement craftElementCopy = selectedElement.copy((57085 & 1) != 0 ? selectedElement.elementId : 0, (57085 & 2) != 0 ? selectedElement.serverId : 0, (57085 & 4) != 0 ? selectedElement.imageName : null, (57085 & 8) != 0 ? selectedElement.imageType : 0, (57085 & 16) != 0 ? selectedElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? selectedElement.preparationTime : 0, (57085 & 64) != 0 ? selectedElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? selectedElement.elementRarity : null, (57085 & 256) != 0 ? selectedElement.elementState : null, (57085 & 512) != 0 ? selectedElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? selectedElement.textBlock : null, (57085 & 2048) != 0 ? selectedElement.componentsList : arrayList, (57085 & 4096) != 0 ? selectedElement.valueOfPercent : 0, (57085 & 8192) != 0 ? selectedElement.valueOfTimer : null, (57085 & 16384) != 0 ? selectedElement.craftingCost : 0, (57085 & 32768) != 0 ? selectedElement.itemCategory : 0);
            CraftCraftingControl craftCraftingControlUpdateCraftCraftingControl = CraftViewModel.this.updateCraftCraftingControl(false, craftElementCopy);
            MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                craftUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElementCopy, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : craftCraftingControlUpdateCraftCraftingControl, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void subtractItemForCrafting() {
        if (get_uiState().getValue().getCraftingControlInfo().getSelectedValueOfItem() > 1) {
            ViewModelExtensionKt.launchOnDefault$default(this, null, new C38591(null), 1, null);
        }
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$addItemForCrafting$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$addItemForCrafting$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n1549#2:1754\n1620#2,3:1755\n230#3,5:1758\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$addItemForCrafting$1\n*L\n1197#1:1754\n1197#1:1755,3\n1208#1:1758,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$addItemForCrafting$1 */
    /* loaded from: classes.dex */
    public static final class C38401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38401(Continuation<? super C38401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CraftIngredient> componentsList = CraftViewModel.this.get_uiState().getValue().getSelectedElement().getComponentsList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            for (CraftIngredient craftIngredient : componentsList) {
                craftIngredient.setCount(craftIngredient.getCount() + 1);
                arrayList.add(craftIngredient);
            }
            CraftElement selectedElement = CraftViewModel.this.get_uiState().getValue().getSelectedElement();
            CraftElement craftElementCopy = selectedElement.copy((57085 & 1) != 0 ? selectedElement.elementId : 0, (57085 & 2) != 0 ? selectedElement.serverId : 0, (57085 & 4) != 0 ? selectedElement.imageName : null, (57085 & 8) != 0 ? selectedElement.imageType : 0, (57085 & 16) != 0 ? selectedElement.timeUntilItemPreparation : 0, (57085 & 32) != 0 ? selectedElement.preparationTime : 0, (57085 & 64) != 0 ? selectedElement.timeWhenElementCreated : null, (57085 & 128) != 0 ? selectedElement.elementRarity : null, (57085 & 256) != 0 ? selectedElement.elementState : null, (57085 & 512) != 0 ? selectedElement.valueOfPipeline : 0, (57085 & 1024) != 0 ? selectedElement.textBlock : null, (57085 & 2048) != 0 ? selectedElement.componentsList : arrayList, (57085 & 4096) != 0 ? selectedElement.valueOfPercent : 0, (57085 & 8192) != 0 ? selectedElement.valueOfTimer : null, (57085 & 16384) != 0 ? selectedElement.craftingCost : 0, (57085 & 32768) != 0 ? selectedElement.itemCategory : 0);
            CraftCraftingControl craftCraftingControlUpdateCraftCraftingControl = CraftViewModel.this.updateCraftCraftingControl(true, craftElementCopy);
            MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                craftUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : craftElementCopy, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : craftCraftingControlUpdateCraftCraftingControl, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void addItemForCrafting() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38401(null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onActionCraftingClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onActionCraftingClick$1 */
    /* loaded from: classes.dex */
    public static final class C38461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38461(Continuation<? super C38461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CraftCraftingControl craftingControlInfo = CraftViewModel.this.get_uiState().getValue().getCraftingControlInfo();
            CraftElement selectedElement = CraftViewModel.this.get_uiState().getValue().getSelectedElement();
            boolean zIsQueueFilled = CraftViewModel.this.getUiState().getValue().isQueueFilled();
            int workbenchLevel = CraftViewModel.this.get_uiState().getValue().getWorkbenchLevel();
            int typeOfBlock = craftingControlInfo.getTypeOfBlock();
            if (typeOfBlock != 1) {
                if (typeOfBlock == 2) {
                    int serverId = selectedElement.getServerId();
                    CraftViewModel.showDialogConfirmation$default(CraftViewModel.this, 3, selectedElement.getTextBlock().getName(), serverId, 0, 8, null);
                } else if (typeOfBlock == 4) {
                    int serverId2 = selectedElement.getServerId();
                    CraftViewModel.showDialogConfirmation$default(CraftViewModel.this, 1, selectedElement.getTextBlock().getName(), serverId2, 0, 8, null);
                }
            } else if (craftingControlInfo.isLowLevel()) {
                CraftViewModel.this.getLocalNotification().showErrorNotification(CraftViewModel.this.stringResources.getString(R.string.craft_crafting_error_low_level, Boxing.boxInt(selectedElement.getElementRarity().getValue())));
            } else if (craftingControlInfo.isWorkbenchLevelInsufficient()) {
                CraftViewModel.this.getLocalNotification().showErrorNotification(CraftViewModel.this.stringResources.getString(R.string.craft_crafting_error_insufficient_workbench_level, Boxing.boxInt(workbenchLevel + 1)));
            } else if (!craftingControlInfo.isEnoughResources()) {
                CraftViewModel.this.getLocalNotification().showErrorNotification(CraftViewModel.this.stringResources.getString(R.string.craft_crafting_error_with_resources));
            } else if (zIsQueueFilled) {
                CraftViewModel.this.getLocalNotification().showErrorNotification(CraftViewModel.this.stringResources.getString(R.string.craft_crafting_error_queue));
            } else if (!craftingControlInfo.isEnoughMoney()) {
                CraftViewModel.this.getLocalNotification().showErrorNotification(CraftViewModel.this.stringResources.getString(R.string.craft_crafting_error_not_enough_money));
            } else {
                int elementId = selectedElement.getElementId();
                CraftViewModel.this.showDialogConfirmation(2, selectedElement.getTextBlock().getName(), elementId, craftingControlInfo.getSelectedValueOfItem());
            }
            return Unit.INSTANCE;
        }
    }

    public final void onActionCraftingClick() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38461(null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onDialogConfirmationClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onDialogConfirmationClick$1 */
    /* loaded from: classes.dex */
    public static final class C38521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38521(Continuation<? super C38521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CraftDialogConfirmationAttachment dialogConfirmationAttachment = CraftViewModel.this.getUiState().getValue().getDialogConfirmationAttachment();
            int typeOfDialog = dialogConfirmationAttachment.getTypeOfDialog();
            if (typeOfDialog == 1) {
                CraftViewModel.this.actionWithJSON.sendCancelCreation(dialogConfirmationAttachment.getIdSelectedElement());
            } else if (typeOfDialog == 2) {
                CraftViewModel.this.actionWithJSON.sendStartCreation(dialogConfirmationAttachment.getIdSelectedElement(), dialogConfirmationAttachment.getValueOfElements());
            } else if (typeOfDialog == 3) {
                CraftViewModel.this.actionWithJSON.receivingElement(Boxing.boxInt(dialogConfirmationAttachment.getIdSelectedElement()));
            } else if (typeOfDialog == 4) {
                CraftActionWithJSON.receivingElement$default(CraftViewModel.this.actionWithJSON, null, 1, null);
            }
            CraftViewModel.this.closeDialogConfirmation();
            return Unit.INSTANCE;
        }
    }

    public final void onDialogConfirmationClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38521(null), 1, null);
    }

    public final void onCloseDialogConfirmationClick() {
        closeDialogConfirmation();
    }

    public final void closeForcedTutorial() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCraftElement(CraftJsonItem craftJsonItem, List<CraftJsonItem> list, List<CraftComponentServerItem> list2, List<CraftItemsWithNotificationServerItem> list3, int i, int i2, float f, Continuation<? super CraftElement> continuation) throws Throwable {
        C38421 c38421;
        CraftJsonItem craftJsonItem2;
        List<CraftItemsWithNotificationServerItem> list4;
        int i3;
        int i4;
        float f2;
        CraftViewModel craftViewModel;
        Object objAwaitAll;
        String itemDescription;
        if (continuation instanceof C38421) {
            c38421 = (C38421) continuation;
            int i5 = c38421.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c38421.label = i5 - Integer.MIN_VALUE;
            } else {
                c38421 = new C38421(continuation);
            }
        }
        C38421 c384212 = c38421;
        Object obj = c384212.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c384212.label;
        List<CraftIngredient> listEmptyList = null;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            List<CraftJsonComponentItem> craftingComponents = craftJsonItem.getCraftingComponents();
            if (craftingComponents == null) {
                craftJsonItem2 = craftJsonItem;
                list4 = list3;
                i3 = i;
                i4 = i2;
                f2 = f;
                craftViewModel = this;
                CraftElementStatusEnum craftElementStatusEnumDetermineElementState = craftViewModel.determineElementState(craftJsonItem2, list4, i3, listEmptyList, i4);
                float f3 = 100;
                int craftingChancePercent = (int) (craftJsonItem2.getCraftingChancePercent() * f3);
                int i7 = (int) (f2 * f3);
                int itemId = craftJsonItem2.getItemId();
                String imageCDN = craftJsonItem2.getImageCDN();
                int itemCategory = craftJsonItem2.getItemCategory();
                int craftingCost = craftJsonItem2.getCraftingCost();
                CommonRarityEnum commonRarityEnumFromInt = CommonRarityEnum.INSTANCE.fromInt(craftJsonItem2.getItemClassId());
                int craftingTimeSec = craftJsonItem2.getCraftingTimeSec();
                String itemName = craftJsonItem2.getItemName();
                String durationWithLocale = IntExtensionKt.formatDurationWithLocale(craftJsonItem2.getCraftingTimeSec(), Locale.INSTANCE.getCurrent());
                int i8 = craftingChancePercent + i7;
                float itemWeight = craftJsonItem2.getItemWeight();
                itemDescription = craftJsonItem2.getItemDescription();
                if (itemDescription == null) {
                    itemDescription = "";
                }
                CraftItemTextBlock craftItemTextBlock = new CraftItemTextBlock(itemName, durationWithLocale, craftingChancePercent, i8, itemWeight, itemDescription);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                return new CraftElement(itemId, 0, imageCDN, itemCategory, 0, craftingTimeSec, null, commonRarityEnumFromInt, craftElementStatusEnumDetermineElementState, 0, craftItemTextBlock, listEmptyList, i7, null, craftingCost, craftJsonItem2.getItemCategory(), 8786, null);
            }
            List<CraftJsonComponentItem> list5 = craftingComponents;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(ViewModelExtensionKt.asyncOnDefault$default(this, null, new CraftViewModel$createCraftElement$listOfCraftIngredient$1$1(this, (CraftJsonComponentItem) it.next(), list, list2, null), 1, null));
            }
            c384212.L$0 = this;
            craftJsonItem2 = craftJsonItem;
            c384212.L$1 = craftJsonItem2;
            list4 = list3;
            c384212.L$2 = list4;
            i3 = i;
            c384212.I$0 = i3;
            i4 = i2;
            c384212.I$1 = i4;
            f2 = f;
            c384212.F$0 = f2;
            c384212.label = 1;
            objAwaitAll = AwaitKt.awaitAll(arrayList, c384212);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            craftViewModel = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f4 = c384212.F$0;
            int i9 = c384212.I$1;
            int i10 = c384212.I$0;
            List<CraftItemsWithNotificationServerItem> list6 = (List) c384212.L$2;
            CraftJsonItem craftJsonItem3 = (CraftJsonItem) c384212.L$1;
            craftViewModel = (CraftViewModel) c384212.L$0;
            ResultKt.throwOnFailure(obj);
            objAwaitAll = obj;
            craftJsonItem2 = craftJsonItem3;
            f2 = f4;
            list4 = list6;
            i4 = i9;
            i3 = i10;
        }
        List list7 = (List) objAwaitAll;
        if (list7 != null) {
            listEmptyList = CollectionsKt___CollectionsKt.filterNotNull(list7);
        }
        CraftElementStatusEnum craftElementStatusEnumDetermineElementState2 = craftViewModel.determineElementState(craftJsonItem2, list4, i3, listEmptyList, i4);
        float f32 = 100;
        int craftingChancePercent2 = (int) (craftJsonItem2.getCraftingChancePercent() * f32);
        int i72 = (int) (f2 * f32);
        int itemId2 = craftJsonItem2.getItemId();
        String imageCDN2 = craftJsonItem2.getImageCDN();
        int itemCategory2 = craftJsonItem2.getItemCategory();
        int craftingCost2 = craftJsonItem2.getCraftingCost();
        CommonRarityEnum commonRarityEnumFromInt2 = CommonRarityEnum.INSTANCE.fromInt(craftJsonItem2.getItemClassId());
        int craftingTimeSec2 = craftJsonItem2.getCraftingTimeSec();
        String itemName2 = craftJsonItem2.getItemName();
        String durationWithLocale2 = IntExtensionKt.formatDurationWithLocale(craftJsonItem2.getCraftingTimeSec(), Locale.INSTANCE.getCurrent());
        int i82 = craftingChancePercent2 + i72;
        float itemWeight2 = craftJsonItem2.getItemWeight();
        itemDescription = craftJsonItem2.getItemDescription();
        if (itemDescription == null) {
        }
        CraftItemTextBlock craftItemTextBlock2 = new CraftItemTextBlock(itemName2, durationWithLocale2, craftingChancePercent2, i82, itemWeight2, itemDescription);
        if (listEmptyList == null) {
        }
        return new CraftElement(itemId2, 0, imageCDN2, itemCategory2, 0, craftingTimeSec2, null, commonRarityEnumFromInt2, craftElementStatusEnumDetermineElementState2, 0, craftItemTextBlock2, listEmptyList, i72, null, craftingCost2, craftJsonItem2.getItemCategory(), 8786, null);
    }

    public final Object parseListWithStorageItems(JSONObject jSONObject, Map<Integer, ? extends List<CraftElement>> map, Continuation<? super List<CraftElement>> continuation) throws JSONException {
        List<CraftStorageServerItem> arrayList;
        Object objFromJson;
        Object next;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cs");
        if (jSONArrayOptJSONArray != null) {
            try {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNull(jSONObject2);
                    try {
                        Gson gson = new Gson();
                        String string = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CraftStorageServerItem.class);
                    } catch (Exception e) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics.log(e.toString());
                        firebaseCrashlytics.recordException(e);
                        objFromJson = null;
                    }
                    if (objFromJson != null) {
                        Boxing.boxBoolean(arrayList.add(objFromJson));
                    }
                }
            } catch (Exception e2) {
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics2.log(e2.toString());
                firebaseCrashlytics2.recordException(e2);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (CraftStorageServerItem craftStorageServerItem : arrayList) {
            Iterator it = CollectionsKt__IterablesKt.flatten(map.values()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CraftElement) next).getElementId() == craftStorageServerItem.getId()) {
                    break;
                }
            }
            CraftElement craftElement = (CraftElement) next;
            Deferred deferredAsyncOnDefault$default = craftElement != null ? ViewModelExtensionKt.asyncOnDefault$default(this, null, new C3853x643daed(craftStorageServerItem, craftElement, AnyExtensionKt.isNotNull(craftStorageServerItem.isItemNew()) ? CraftElementStatusEnum.NEW_ELEMENT : CraftElementStatusEnum.DEFAULT, null), 1, null) : null;
            if (deferredAsyncOnDefault$default != null) {
                arrayList2.add(deferredAsyncOnDefault$default);
            }
        }
        return AwaitKt.awaitAll(arrayList2, continuation);
    }

    public final Object parseListWithProductionItems(JSONObject jSONObject, Map<Integer, ? extends List<CraftElement>> map, Continuation<? super List<CraftElement>> continuation) throws JSONException {
        List<CraftProductionServerItem> arrayList;
        Object objFromJson;
        Object next;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY);
        if (jSONArrayOptJSONArray != null) {
            try {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNull(jSONObject2);
                    try {
                        Gson gson = new Gson();
                        String string = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CraftProductionServerItem.class);
                    } catch (Exception e) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics.log(e.toString());
                        firebaseCrashlytics.recordException(e);
                        objFromJson = null;
                    }
                    if (objFromJson != null) {
                        Boxing.boxBoolean(arrayList.add(objFromJson));
                    }
                }
            } catch (Exception e2) {
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics2.log(e2.toString());
                firebaseCrashlytics2.recordException(e2);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (CraftProductionServerItem craftProductionServerItem : arrayList) {
            Iterator it = CollectionsKt__IterablesKt.flatten(map.values()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CraftElement) next).getElementId() == craftProductionServerItem.getId()) {
                    break;
                }
            }
            CraftElement craftElement = (CraftElement) next;
            Deferred deferredAsyncOnDefault$default = craftElement != null ? ViewModelExtensionKt.asyncOnDefault$default(this, null, new CraftViewModel$parseListWithProductionItems$2$1$1(craftProductionServerItem, craftElement, null), 1, null) : null;
            if (deferredAsyncOnDefault$default != null) {
                arrayList2.add(deferredAsyncOnDefault$default);
            }
        }
        return AwaitKt.awaitAll(arrayList2, continuation);
    }

    public final void showSplit(boolean value) {
        CraftUiState value2;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value2 = mutableStateFlow.getValue();
            craftUiState = value2;
        } while (!mutableStateFlow.compareAndSet(value2, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : value, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$onBuyVipClick$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onBuyVipClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n230#2,5:1754\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$onBuyVipClick$1\n*L\n1478#1:1754,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$onBuyVipClick$1 */
    /* loaded from: classes.dex */
    public static final class C38501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38501(Continuation<? super C38501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CraftViewModel.this.actionWithJSON.sendBuyVipClick();
                MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    craftUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : true, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onBuyVipClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38501(null), 1, null);
    }

    /* compiled from: CraftViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$deleteElementFromStash$1", m7120f = "CraftViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$deleteElementFromStash$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1753:1\n766#2:1754\n857#2,2:1755\n230#3,5:1757\n*S KotlinDebug\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$deleteElementFromStash$1\n*L\n1487#1:1754\n1487#1:1755,2\n1491#1:1757,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.craft.CraftViewModel$deleteElementFromStash$1 */
    /* loaded from: classes.dex */
    public static final class C38431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CraftElement $element;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38431(CraftElement craftElement, Continuation<? super C38431> continuation) {
            super(2, continuation);
            this.$element = craftElement;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CraftViewModel.this.new C38431(this.$element, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CraftUiState value;
            CraftUiState craftUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CraftElement> listWithStorageItems = CraftViewModel.this.getUiState().getValue().getListWithStorageItems();
            CraftElement craftElement = this.$element;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listWithStorageItems) {
                if (((CraftElement) obj2).getServerId() != craftElement.getServerId()) {
                    arrayList.add(obj2);
                }
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            int size = mutableList.size();
            MutableStateFlow<CraftUiState> mutableStateFlow = CraftViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                craftUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : size, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : mutableList, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void deleteElementFromStash(@NotNull CraftElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38431(element, null), 1, null);
    }

    public final CraftIngredient findCraftIngredient(CraftJsonComponentItem craftComponent, List<CraftJsonItem> listOfCraftItems, List<CraftComponentServerItem> componentsArray) {
        CraftIngredient craftIngredient;
        Object next;
        Iterator<T> it = listOfCraftItems.iterator();
        do {
            craftIngredient = null;
            craftIngredient = null;
            if (!it.hasNext()) {
                break;
            }
            CraftJsonItem craftJsonItem = (CraftJsonItem) it.next();
            if (craftJsonItem.getItemId() == craftComponent.getComponentId()) {
                int componentId = craftComponent.getComponentId();
                CommonRarityEnum commonRarityEnumFromInt = CommonRarityEnum.INSTANCE.fromInt(craftJsonItem.getItemClassId());
                String itemName = craftJsonItem.getItemName();
                String itemDescription = craftJsonItem.getItemDescription();
                if (itemDescription == null) {
                    itemDescription = "";
                }
                String str = itemDescription;
                String imageCDN = craftJsonItem.getImageCDN();
                int itemCategory = craftJsonItem.getItemCategory();
                int requiredQuantity = craftComponent.getRequiredQuantity();
                Iterator<T> it2 = componentsArray.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((CraftComponentServerItem) next).getId() == craftJsonItem.getItemId()) {
                        break;
                    }
                }
                CraftComponentServerItem craftComponentServerItem = (CraftComponentServerItem) next;
                craftIngredient = new CraftIngredient(componentId, commonRarityEnumFromInt, itemName, str, imageCDN, itemCategory, 0, requiredQuantity, IntExtensionKt.getOrZero(craftComponentServerItem != null ? Integer.valueOf(craftComponentServerItem.getQuantity()) : null), false, false, 1600, null);
            }
        } while (craftIngredient == null);
        return craftIngredient;
    }

    public final CraftElementStatusEnum determineElementState(CraftJsonItem craftJsonItem, List<CraftItemsWithNotificationServerItem> newItemsArray, int levelOfSkill, List<CraftIngredient> componentsList, int workbenchLevel) {
        List<CraftItemsWithNotificationServerItem> list = newItemsArray;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CraftItemsWithNotificationServerItem) it.next()).getId() == craftJsonItem.getItemId()) {
                    return CraftElementStatusEnum.NEW_ELEMENT;
                }
            }
        }
        if (levelOfSkill < craftJsonItem.getItemClassId() || workbenchLevel < craftJsonItem.getItemClassId()) {
            return CraftElementStatusEnum.UNAVAILABLE;
        }
        if (componentsList != null) {
            int size = componentsList.size();
            for (int i = 0; i < size; i++) {
                if (componentsList.get(i).isEnough()) {
                }
            }
            return CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING;
        }
        return CraftElementStatusEnum.DEFAULT;
    }

    public final Object createCategories(List<CraftJsonItemCategory> list, Map<Integer, List<CraftElement>> map, Continuation<? super List<CommonButtonCategory>> continuation) {
        List<CraftJsonItemCategory> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ViewModelExtensionKt.asyncOnDefault$default(this, null, new CraftViewModel$createCategories$2$1((CraftJsonItemCategory) it.next(), this, map, null), 1, null));
        }
        return AwaitKt.awaitAll(arrayList, continuation);
    }

    public final CraftCraftingControl updateCraftCraftingControl(boolean isAdd, CraftElement selectedItem) {
        int selectedValueOfItem;
        int valueOfRubles = get_uiState().getValue().getValueOfRubles();
        CraftCraftingControl craftingControlInfo = get_uiState().getValue().getCraftingControlInfo();
        if (isAdd) {
            selectedValueOfItem = craftingControlInfo.getSelectedValueOfItem() + 1;
        } else {
            selectedValueOfItem = craftingControlInfo.getSelectedValueOfItem() - 1;
        }
        int i = selectedValueOfItem;
        int textQuantityColor$default = getTextQuantityColor$default(this, null, i, 1, null);
        float weight = i * selectedItem.getTextBlock().getWeight();
        int craftingCost = selectedItem.getCraftingCost() * i;
        boolean z = valueOfRubles >= craftingCost;
        boolean zIsEnoughResources = selectedItem.isEnoughResources();
        int value = selectedItem.getElementRarity().getValue();
        boolean z2 = getUiState().getValue().getLevelOfSkill() < value;
        boolean z3 = getUiState().getValue().getWorkbenchLevel() < value;
        return craftingControlInfo.copy((805 & 1) != 0 ? craftingControlInfo.typeOfBlock : 0, (805 & 2) != 0 ? craftingControlInfo.selectedValueOfItem : i, (805 & 4) != 0 ? craftingControlInfo.maxValueOfItems : 0, (805 & 8) != 0 ? craftingControlInfo.selectedWeight : weight, (805 & 16) != 0 ? craftingControlInfo.craftingCost : String.valueOf(craftingCost), (805 & 32) != 0 ? craftingControlInfo.timeUntilItemWillBePrepared : 0, (805 & 64) != 0 ? craftingControlInfo.isEnoughMoney : z, (805 & 128) != 0 ? craftingControlInfo.isEnoughResources : zIsEnoughResources, (805 & 256) != 0 ? craftingControlInfo.isLowLevel : z2, (805 & 512) != 0 ? craftingControlInfo.isWorkbenchLevelInsufficient : z3, (805 & 1024) != 0 ? craftingControlInfo.isEnabledMainButton : z && zIsEnoughResources && !z2 && !z3, (805 & 2048) != 0 ? craftingControlInfo.textSelectedValueOfItemColor : textQuantityColor$default);
    }

    public static /* synthetic */ void showDialogConfirmation$default(CraftViewModel craftViewModel, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        craftViewModel.showDialogConfirmation(i, str, i2, i3);
    }

    public final void showDialogConfirmation(int typeOfDialog, String nameOfSelectedElement, int idSelectedElement, int valueOfElements) {
        String string;
        CraftUiState value;
        CraftUiState craftUiState;
        if (typeOfDialog == 1) {
            string = this.stringResources.getString(R.string.craft_dialog_cancel_creation, nameOfSelectedElement);
        } else if (typeOfDialog == 2) {
            string = this.stringResources.getString(R.string.craft_dialog_start_creation, nameOfSelectedElement, Integer.valueOf(valueOfElements));
        } else if (typeOfDialog == 3) {
            string = this.stringResources.getString(R.string.craft_dialog_receiving_single_item, nameOfSelectedElement);
        } else if (typeOfDialog == 4) {
            string = this.stringResources.getString(R.string.craft_dialog_receiving_all_items);
        } else {
            string = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        String str = string;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : true, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : new CraftDialogConfirmationAttachment(typeOfDialog, str, idSelectedElement, nameOfSelectedElement, valueOfElements), (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDialogConfirmation() {
        CraftUiState value;
        CraftUiState craftUiState;
        MutableStateFlow<CraftUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            craftUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, craftUiState.copy(((-268435457) & 1) != 0 ? craftUiState.currentScreen : null, ((-268435457) & 2) != 0 ? craftUiState.craftScreenTypeObject : null, ((-268435457) & 4) != 0 ? craftUiState.craftItemTextBlock : null, ((-268435457) & 8) != 0 ? craftUiState.craftIconAlarmText : null, ((-268435457) & 16) != 0 ? craftUiState.stashIconAlarmText : null, ((-268435457) & 32) != 0 ? craftUiState.progressIconAlarmText : null, ((-268435457) & 64) != 0 ? craftUiState.workbenchLevel : 0, ((-268435457) & 128) != 0 ? craftUiState.levelOfSkill : 0, ((-268435457) & 256) != 0 ? craftUiState.percentOfSkill : 0, ((-268435457) & 512) != 0 ? craftUiState.quantityInQueue : 0, ((-268435457) & 1024) != 0 ? craftUiState.queueMax : 0, ((-268435457) & 2048) != 0 ? craftUiState.quantityInStorage : 0, ((-268435457) & 4096) != 0 ? craftUiState.storageMax : 0, ((-268435457) & 8192) != 0 ? craftUiState.isPlayerHasVip : false, ((-268435457) & 16384) != 0 ? craftUiState.quantityOfNewItemsInStorage : 0, ((-268435457) & 32768) != 0 ? craftUiState.mapOfCraftElements : null, ((-268435457) & 65536) != 0 ? craftUiState.listWithStorageItems : null, ((-268435457) & 131072) != 0 ? craftUiState.listWithProductionItems : null, ((-268435457) & 262144) != 0 ? craftUiState.listOfLevelUpElements : null, ((-268435457) & 524288) != 0 ? craftUiState.backgroundImage : null, ((-268435457) & 1048576) != 0 ? craftUiState.buttonAnimatedAttachment : null, ((-268435457) & 2097152) != 0 ? craftUiState.isNeedToShowFilter : false, ((-268435457) & 4194304) != 0 ? craftUiState.isNeedToShowTutorial : false, ((-268435457) & 8388608) != 0 ? craftUiState.isNeedToShowHints : false, ((-268435457) & 16777216) != 0 ? craftUiState.isNeedToShowLevelUpDialog : false, ((-268435457) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? craftUiState.isNeedToShowSplit : false, ((-268435457) & 67108864) != 0 ? craftUiState.isNeedClose : false, ((-268435457) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? craftUiState.isWithIndicationFilter : false, ((-268435457) & 268435456) != 0 ? craftUiState.selectedElement : null, ((-268435457) & 536870912) != 0 ? craftUiState.allElementsForCraftAfterFilter : null, ((-268435457) & 1073741824) != 0 ? craftUiState.categories : null, ((-268435457) & Integer.MIN_VALUE) != 0 ? craftUiState.selectedCategory : null, (1019 & 1) != 0 ? craftUiState.filterList : null, (1019 & 2) != 0 ? craftUiState.buttonWithLineText : null, (1019 & 4) != 0 ? craftUiState.craftingControlInfo : null, (1019 & 8) != 0 ? craftUiState.valueOfRubles : 0, (1019 & 16) != 0 ? craftUiState.selectedCategoryIndex : 0, (1019 & 32) != 0 ? craftUiState.isNeedToShowDialogConfirmation : false, (1019 & 64) != 0 ? craftUiState.dialogConfirmationAttachment : null, (1019 & 128) != 0 ? craftUiState.isNeedToShowForcedTutorial : false, (1019 & 256) != 0 ? craftUiState.forcedTutorialAttachment : null, (1019 & 512) != 0 ? craftUiState.isBlockingLoading : false)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List sortingList$default(CraftViewModel craftViewModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return craftViewModel.sortingList(list, list2);
    }

    public final List<CraftElement> sortingList(List<CraftElement> selectedList, List<CraftCategoryFilter> filterList) {
        final List listEmptyList;
        final List listEmptyList2;
        List<CraftItemCategoryFilter> filters;
        List<CraftItemCategoryFilter> filters2;
        List<CraftItemCategoryFilter> filters3;
        if (selectedList == null && (selectedList = getUiState().getValue().getMapOfCraftElements().get(Integer.valueOf(getUiState().getValue().getSelectedCategory().getCategoryId()))) == null) {
            selectedList = CollectionsKt__CollectionsKt.emptyList();
        }
        Sequence sequenceAsSequence = CollectionsKt___CollectionsKt.asSequence(selectedList);
        if (filterList == null) {
            filterList = getUiState().getValue().getFilterList();
        }
        CraftCategoryFilter craftCategoryFilter = (CraftCategoryFilter) CollectionsKt___CollectionsKt.firstOrNull((List) filterList);
        final List listEmptyList3 = null;
        if (craftCategoryFilter == null || (filters3 = craftCategoryFilter.getFilters()) == null) {
            listEmptyList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : filters3) {
                if (((CraftItemCategoryFilter) obj).getStateOfCheckBox()) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(Integer.valueOf(((CraftItemCategoryFilter) it.next()).getFilterId()));
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        CraftCategoryFilter craftCategoryFilter2 = (CraftCategoryFilter) CollectionsKt___CollectionsKt.getOrNull(filterList, 1);
        if (craftCategoryFilter2 == null || (filters2 = craftCategoryFilter2.getFilters()) == null) {
            listEmptyList2 = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : filters2) {
                if (((CraftItemCategoryFilter) obj2).getStateOfCheckBox()) {
                    arrayList2.add(obj2);
                }
            }
            listEmptyList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                listEmptyList2.add(Integer.valueOf(((CraftItemCategoryFilter) it2.next()).getFilterId()));
            }
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        CraftCategoryFilter craftCategoryFilter3 = (CraftCategoryFilter) CollectionsKt___CollectionsKt.getOrNull(filterList, 2);
        if (craftCategoryFilter3 != null && (filters = craftCategoryFilter3.getFilters()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : filters) {
                if (((CraftItemCategoryFilter) obj3).getStateOfCheckBox()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(((CraftItemCategoryFilter) it3.next()).getFilterId()));
            }
            listEmptyList3 = arrayList4;
        }
        if (listEmptyList3 == null) {
            listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty() && listEmptyList2.isEmpty() && listEmptyList3.isEmpty()) {
            return SequencesKt___SequencesKt.toList(sequenceAsSequence);
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(sequenceAsSequence, new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel.sortingList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                return Boolean.valueOf(listEmptyList.isEmpty() ^ true ? listEmptyList.contains(Integer.valueOf(element.getElementRarity().getValue())) : true);
            }
        }), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel.sortingList.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                boolean z = true;
                if ((!listEmptyList2.contains(6) || !listEmptyList2.contains(7)) && (!listEmptyList2.contains(6) ? !(!listEmptyList2.contains(7) || element.getElementState() != CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING) : element.getElementState() != CraftElementStatusEnum.AVAILABLE_FOR_CRAFTING)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new Function1<CraftElement, Boolean>() { // from class: com.blackhub.bronline.game.gui.craft.CraftViewModel.sortingList.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CraftElement element) {
                Intrinsics.checkNotNullParameter(element, "element");
                boolean z = true;
                if ((!listEmptyList3.contains(8) || !listEmptyList3.contains(9)) && (!listEmptyList3.contains(8) ? !(!listEmptyList3.contains(9) || element.getElementState() == CraftElementStatusEnum.UNAVAILABLE) : element.getElementState() == CraftElementStatusEnum.UNAVAILABLE)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    public static /* synthetic */ int getTextQuantityColor$default(CraftViewModel craftViewModel, CraftElement craftElement, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            craftElement = craftViewModel.getUiState().getValue().getSelectedElement();
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return craftViewModel.getTextQuantityColor(craftElement, i);
    }

    public final int getTextQuantityColor(CraftElement element, int newValue) {
        return (element.getCraftingCost() > getUiState().getValue().getValueOfRubles() || !element.isEnoughResources() || getUiState().getValue().getQuantityInQueue() + newValue > getUiState().getValue().getQueueMax() || getUiState().getValue().getQuantityInStorage() + newValue > getUiState().getValue().getStorageMax()) ? R.color.rose_red : R.color.white;
    }

    public final void returnToDefaultValueOldSelectedElement() {
        Object next;
        Iterator<T> it = get_uiState().getValue().getAllElementsForCraftAfterFilter().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual((CraftElement) next, get_uiState().getValue().getSelectedElement())) {
                    break;
                }
            }
        }
        CraftElement craftElement = (CraftElement) next;
        if (craftElement != null) {
            List<CraftIngredient> componentsList = craftElement.getComponentsList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(componentsList, 10));
            Iterator<T> it2 = componentsList.iterator();
            while (it2.hasNext()) {
                ((CraftIngredient) it2.next()).setCount(1);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }
}
