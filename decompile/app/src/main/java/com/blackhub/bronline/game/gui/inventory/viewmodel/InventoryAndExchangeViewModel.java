package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
import com.blackhub.bronline.game.gui.inventory.MigrateItemsFromAny;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: InventoryAndExchangeViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\t2\u0006\u0010y\u001a\u00020\t2\b\u0010z\u001a\u0004\u0018\u00010!2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)J&\u0010|\u001a\u00020w2\b\u0010}\u001a\u0004\u0018\u00010~2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)2\u0006\u0010\u007f\u001a\u00020\tJ\u0010\u0010\u0080\u0001\u001a\u00020w2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0010\u0010\u0082\u0001\u001a\u00020w2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0016\u0010\u0083\u0001\u001a\u00020w2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ)\u0010\u0085\u0001\u001a\u00020w2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010~2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0)2\u0007\u0010\u0087\u0001\u001a\u00020\tJ\u0019\u0010\u0088\u0001\u001a\u00020w2\u0007\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\tJ\u0019\u0010\u008b\u0001\u001a\u00020w2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\tJ\u0019\u0010\u008e\u0001\u001a\u00020w2\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\tJ\u0019\u0010\u0091\u0001\u001a\u00020w2\u0007\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u0093\u0001\u001a\u00020\tJ\u0019\u0010\u0094\u0001\u001a\u00020w2\u0007\u0010\u0095\u0001\u001a\u00020\t2\u0007\u0010\u0096\u0001\u001a\u00020\tJ\u0006\u0010n\u001a\u00020wJ\u0006\u0010p\u001a\u00020wJ\u0010\u0010\u0097\u0001\u001a\u00020w2\u0007\u0010\u0098\u0001\u001a\u00020\u0007J\u000f\u0010\u0099\u0001\u001a\u00020w2\u0006\u00106\u001a\u00020\tJ\u000f\u0010\u009a\u0001\u001a\u00020w2\u0006\u0010:\u001a\u00020\tJ\u0007\u0010\u009b\u0001\u001a\u00020wJ\u000f\u0010\u009c\u0001\u001a\u00020w2\u0006\u0010@\u001a\u00020\tJ\u000f\u0010\u009d\u0001\u001a\u00020w2\u0006\u0010H\u001a\u00020\tJ\u0010\u0010\u009e\u0001\u001a\u00020w2\u0007\u0010\u009f\u0001\u001a\u00020\u0019J\u0017\u0010 \u0001\u001a\u00020w2\b\u0010X\u001a\u0004\u0018\u00010\t¢\u0006\u0003\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020w2\b\u0010Z\u001a\u0004\u0018\u00010!J\u000f\u0010£\u0001\u001a\u00020w2\u0006\u0010\\\u001a\u00020\tJ\u000f\u0010¤\u0001\u001a\u00020w2\u0006\u0010^\u001a\u00020\tJ\u000f\u0010¥\u0001\u001a\u00020w2\u0006\u0010`\u001a\u00020!J\u0010\u0010¦\u0001\u001a\u00020w2\u0007\u0010§\u0001\u001a\u00020\tJ\u0016\u0010¨\u0001\u001a\u00020w2\r\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020*0)J\u000f\u0010ª\u0001\u001a\u00020w2\u0006\u0010j\u001a\u00020\tJ\u000f\u0010«\u0001\u001a\u00020w2\u0006\u0010l\u001a\u00020\tJ$\u0010¬\u0001\u001a\u00020w2\u0007\u0010\u00ad\u0001\u001a\u00020\t2\u0007\u0010®\u0001\u001a\u00020\t2\t\u0010¯\u0001\u001a\u0004\u0018\u00010!J\u000f\u0010°\u0001\u001a\u00020w2\u0006\u0010\u007f\u001a\u00020\tJ\u000f\u0010±\u0001\u001a\u00020w2\u0006\u00108\u001a\u00020\tJ\u0010\u0010²\u0001\u001a\u00020w2\u0007\u0010³\u0001\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e03¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001303¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001903¢\u0006\b\n\u0000\u001a\u0004\bM\u00105R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u001d\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bS\u00105R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bU\u00105R\u001d\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0019\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t03¢\u0006\b\n\u0000\u001a\u0004\bY\u00105R\u0019\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!03¢\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b]\u00105R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020!03¢\u0006\b\n\u0000\u001a\u0004\ba\u00105R\u001d\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bc\u00105R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\be\u00105R\u001d\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r03¢\u0006\b\n\u0000\u001a\u0004\bg\u00105R\u001d\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r03¢\u0006\b\n\u0000\u001a\u0004\bi\u00105R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bk\u00105R\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\t03¢\u0006\b\n\u0000\u001a\u0004\bm\u00105R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\bo\u00105R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000703¢\u0006\b\n\u0000\u001a\u0004\bq\u00105R\u001d\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)03¢\u0006\b\n\u0000\u001a\u0004\bs\u00105R\u001d\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)03¢\u0006\b\n\u0000\u001a\u0004\bu\u00105¨\u0006´\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionWithJSONArray", "Lcom/blackhub/bronline/game/gui/inventory/MigrateItemsFromAny;", "mutableBlockStatus", "Landroidx/lifecycle/MutableLiveData;", "", "mutableCurrentWeight", "", "mutableExchangeStatus", "mutableHungerParameter", "mutableInvItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "mutableItemFromSlot", "mutableMaxWeight", "mutableMediatorInvItemsAndSize", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvSizeAndItemsObj;", "mutableMyExchangeItemPos", "mutableMyExchangeItems", "mutableMyMoney", "mutableNewInvPosition", "mutableNewMessage", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "mutableNewSlotPosition", "mutableOldInvPosition", "mutableOldPosFromInv", "mutableOtherExchangeItemPos", "mutableOtherExchangeItems", "mutableOtherMoney", "mutableOtherPlayersNick", "", "mutablePlayersId", "mutablePlayersLevel", "mutablePlayersNick", "mutableReturnToTheOldValueOfMoney", "mutableSaveTheOldValueOfMoney", "mutableSavedInitPosInInv", "mutableSkinItems", "", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "mutableSkinModelId", "mutableSlotItems", "mutableSlotsInInventory", "mutableTypeInterface", "mutableVIPStatus", "mutableVehicleItems", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "newBlockStatus", "Landroidx/lifecycle/LiveData;", "getNewBlockStatus", "()Landroidx/lifecycle/LiveData;", "newCurrentWeight", "getNewCurrentWeight", "newExchangeStatus", "getNewExchangeStatus", "newHungerParameter", "getNewHungerParameter", "newInvItems", "getNewInvItems", "newItemFromSlot", "getNewItemFromSlot", "newMaxWeight", "getNewMaxWeight", "newMediatorInvItemsAndSize", "getNewMediatorInvItemsAndSize", "newMyExchangeItemPos", "getNewMyExchangeItemPos", "newMyExchangeItems", "getNewMyExchangeItems", "newMyMoney", "getNewMyMoney", "newNewInvPosition", "getNewNewInvPosition", "newNewMessage", "getNewNewMessage", "newNewSlotPosition", "getNewNewSlotPosition", "newOldInvPosition", "getNewOldInvPosition", "newOldPosFromInv", "getNewOldPosFromInv", "newOtherExchangeItemPos", "getNewOtherExchangeItemPos", "newOtherExchangeItems", "getNewOtherExchangeItems", "newOtherMoney", "getNewOtherMoney", "newOtherPlayersNick", "getNewOtherPlayersNick", "newPlayersId", "getNewPlayersId", "newPlayersLevel", "getNewPlayersLevel", "newPlayersNick", "getNewPlayersNick", "newSavedInitPosInInv", "getNewSavedInitPosInInv", "newSkinModelId", "getNewSkinModelId", "newSlotItems", "getNewSlotItems", "newSlotsInInventory", "getNewSlotsInInventory", "newTypeInterface", "getNewTypeInterface", "newVIPStatus", "getNewVIPStatus", "returnToTheOldValueOfMoney", "getReturnToTheOldValueOfMoney", "saveTheOldValueOfMoney", "getSaveTheOldValueOfMoney", "skinItems", "getSkinItems", "vehicleItems", "getVehicleItems", "addNewOtherItem", "", "newItemId", "newItemValue", "newPlateNumber", "allItemsFromJSON", "initInvItems", "playersItemsInInventoryArray", "Lorg/json/JSONArray;", "sizeActiveSlots", "initMyExchangeItems", "inventorySize", "initOtherExchangeItems", "initSavedPos", "allItems", "initSlotItems", "itemsInSlotArray", "simCardNumber", "migrateItem", "newPosition", "oldPosition", "migrateItemFromExchangeToInv", "posFromExchange", "migrateValue", "migrateItemFromInvToExchange", "itemPos", "itemValue", "migrateItemFromInvToSlot", "posFromInv", "posInSlot", "migrateItemFromSlotToInv", "posFromSlot", "newPosInInv", "setBlockStatus", "newStatus", "setCurrentWeight", "setHungerParameter", "setInitState", "setMaxWeight", "setMyMoney", "setNewMessage", "newMessage", "setOtherMoney", "(Ljava/lang/Integer;)V", "setOtherPlayersNick", "setPlayersId", "setPlayersLevel", "setPlayersNick", "setSkinModelId", "newModelId", "setSkins", "skinsList", "setTypeInterface", "setVIPStatus", "subtractionOtherItem", "itemId", "subItemValue", "oldPlateNumber", "updateActiveSlots", "updateExchangeStatus", "useOrDeleteTheItem", "currentPosition", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class InventoryAndExchangeViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MigrateItemsFromAny actionWithJSONArray = new MigrateItemsFromAny();

    @NotNull
    public final MutableLiveData<Boolean> mutableBlockStatus;

    @NotNull
    public final MutableLiveData<Integer> mutableCurrentWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableExchangeStatus;

    @NotNull
    public final MutableLiveData<Integer> mutableHungerParameter;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableInvItems;

    @NotNull
    public final MutableLiveData<InvItems> mutableItemFromSlot;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxWeight;

    @NotNull
    public final MediatorLiveData<InvSizeAndItemsObj> mutableMediatorInvItemsAndSize;

    @NotNull
    public final MutableLiveData<Integer> mutableMyExchangeItemPos;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableMyExchangeItems;

    @NotNull
    public final MutableLiveData<Integer> mutableMyMoney;

    @NotNull
    public final MutableLiveData<Integer> mutableNewInvPosition;

    @NotNull
    public final MutableLiveData<InvMessageObj> mutableNewMessage;

    @NotNull
    public final MutableLiveData<Integer> mutableNewSlotPosition;

    @NotNull
    public final MutableLiveData<Integer> mutableOldInvPosition;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableOldPosFromInv;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherExchangeItemPos;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableOtherExchangeItems;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherMoney;

    @NotNull
    public final MutableLiveData<String> mutableOtherPlayersNick;

    @NotNull
    public final MutableLiveData<Integer> mutablePlayersId;

    @NotNull
    public final MutableLiveData<Integer> mutablePlayersLevel;

    @NotNull
    public final MutableLiveData<String> mutablePlayersNick;

    @NotNull
    public final MutableLiveData<Boolean> mutableReturnToTheOldValueOfMoney;

    @NotNull
    public final MutableLiveData<Boolean> mutableSaveTheOldValueOfMoney;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableSavedInitPosInInv;

    @NotNull
    public final MutableLiveData<List<SkinsDTO>> mutableSkinItems;

    @NotNull
    public final MutableLiveData<Integer> mutableSkinModelId;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableSlotItems;

    @NotNull
    public final MutableLiveData<List<Integer>> mutableSlotsInInventory;

    @NotNull
    public final MutableLiveData<Integer> mutableTypeInterface;

    @NotNull
    public final MutableLiveData<Integer> mutableVIPStatus;

    @NotNull
    public final MutableLiveData<List<VehiclesDTO>> mutableVehicleItems;

    @NotNull
    public final LiveData<Boolean> newBlockStatus;

    @NotNull
    public final LiveData<Integer> newCurrentWeight;

    @NotNull
    public final LiveData<Integer> newExchangeStatus;

    @NotNull
    public final LiveData<Integer> newHungerParameter;

    @NotNull
    public final LiveData<List<InvItems>> newInvItems;

    @NotNull
    public final LiveData<InvItems> newItemFromSlot;

    @NotNull
    public final LiveData<Integer> newMaxWeight;

    @NotNull
    public final LiveData<InvSizeAndItemsObj> newMediatorInvItemsAndSize;

    @NotNull
    public final LiveData<Integer> newMyExchangeItemPos;

    @NotNull
    public final LiveData<List<InvItems>> newMyExchangeItems;

    @NotNull
    public final LiveData<Integer> newMyMoney;

    @NotNull
    public final LiveData<Integer> newNewInvPosition;

    @NotNull
    public final LiveData<InvMessageObj> newNewMessage;

    @NotNull
    public final LiveData<Integer> newNewSlotPosition;

    @NotNull
    public final LiveData<Integer> newOldInvPosition;

    @NotNull
    public final LiveData<List<Integer>> newOldPosFromInv;

    @NotNull
    public final LiveData<Integer> newOtherExchangeItemPos;

    @NotNull
    public final LiveData<List<InvItems>> newOtherExchangeItems;

    @NotNull
    public final LiveData<Integer> newOtherMoney;

    @NotNull
    public final LiveData<String> newOtherPlayersNick;

    @NotNull
    public final LiveData<Integer> newPlayersId;

    @NotNull
    public final LiveData<Integer> newPlayersLevel;

    @NotNull
    public final LiveData<String> newPlayersNick;

    @NotNull
    public final LiveData<List<Integer>> newSavedInitPosInInv;

    @NotNull
    public final LiveData<Integer> newSkinModelId;

    @NotNull
    public final LiveData<List<InvItems>> newSlotItems;

    @NotNull
    public final LiveData<List<Integer>> newSlotsInInventory;

    @NotNull
    public final LiveData<Integer> newTypeInterface;

    @NotNull
    public final LiveData<Integer> newVIPStatus;

    @NotNull
    public final LiveData<Boolean> returnToTheOldValueOfMoney;

    @NotNull
    public final LiveData<Boolean> saveTheOldValueOfMoney;

    @NotNull
    public final LiveData<List<SkinsDTO>> skinItems;

    @NotNull
    public final LiveData<List<VehiclesDTO>> vehicleItems;

    public InventoryAndExchangeViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableTypeInterface = mutableLiveData;
        this.newTypeInterface = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.mutablePlayersNick = mutableLiveData2;
        this.newPlayersNick = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutablePlayersLevel = mutableLiveData3;
        this.newPlayersLevel = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.mutablePlayersId = mutableLiveData4;
        this.newPlayersId = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableCurrentWeight = mutableLiveData5;
        this.newCurrentWeight = mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.mutableMaxWeight = mutableLiveData6;
        this.newMaxWeight = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.mutableHungerParameter = mutableLiveData7;
        this.newHungerParameter = mutableLiveData7;
        MutableLiveData<Integer> mutableLiveData8 = new MutableLiveData<>();
        this.mutableVIPStatus = mutableLiveData8;
        this.newVIPStatus = mutableLiveData8;
        MutableLiveData<List<Integer>> mutableLiveData9 = new MutableLiveData<>();
        this.mutableSlotsInInventory = mutableLiveData9;
        this.newSlotsInInventory = mutableLiveData9;
        MutableLiveData<List<InvItems>> mutableLiveData10 = new MutableLiveData<>();
        this.mutableInvItems = mutableLiveData10;
        this.newInvItems = mutableLiveData10;
        MediatorLiveData<InvSizeAndItemsObj> mediatorLiveData = new MediatorLiveData<>();
        this.mutableMediatorInvItemsAndSize = mediatorLiveData;
        this.newMediatorInvItemsAndSize = mediatorLiveData;
        MutableLiveData<List<InvItems>> mutableLiveData11 = new MutableLiveData<>();
        this.mutableSlotItems = mutableLiveData11;
        this.newSlotItems = mutableLiveData11;
        MutableLiveData<Integer> mutableLiveData12 = new MutableLiveData<>();
        this.mutableSkinModelId = mutableLiveData12;
        this.newSkinModelId = mutableLiveData12;
        MutableLiveData<Integer> mutableLiveData13 = new MutableLiveData<>();
        this.mutableOldInvPosition = mutableLiveData13;
        this.newOldInvPosition = mutableLiveData13;
        MutableLiveData<Integer> mutableLiveData14 = new MutableLiveData<>();
        this.mutableNewInvPosition = mutableLiveData14;
        this.newNewInvPosition = mutableLiveData14;
        MutableLiveData<Integer> mutableLiveData15 = new MutableLiveData<>();
        this.mutableNewSlotPosition = mutableLiveData15;
        this.newNewSlotPosition = mutableLiveData15;
        MutableLiveData<Integer> mutableLiveData16 = new MutableLiveData<>();
        this.mutableMyMoney = mutableLiveData16;
        this.newMyMoney = mutableLiveData16;
        MutableLiveData<String> mutableLiveData17 = new MutableLiveData<>();
        this.mutableOtherPlayersNick = mutableLiveData17;
        this.newOtherPlayersNick = mutableLiveData17;
        MutableLiveData<List<InvItems>> mutableLiveData18 = new MutableLiveData<>();
        this.mutableMyExchangeItems = mutableLiveData18;
        this.newMyExchangeItems = mutableLiveData18;
        MutableLiveData<List<InvItems>> mutableLiveData19 = new MutableLiveData<>();
        this.mutableOtherExchangeItems = mutableLiveData19;
        this.newOtherExchangeItems = mutableLiveData19;
        MutableLiveData<Integer> mutableLiveData20 = new MutableLiveData<>();
        this.mutableOtherExchangeItemPos = mutableLiveData20;
        this.newOtherExchangeItemPos = mutableLiveData20;
        MutableLiveData<Integer> mutableLiveData21 = new MutableLiveData<>();
        this.mutableOtherMoney = mutableLiveData21;
        this.newOtherMoney = mutableLiveData21;
        MutableLiveData<InvMessageObj> mutableLiveData22 = new MutableLiveData<>();
        this.mutableNewMessage = mutableLiveData22;
        this.newNewMessage = mutableLiveData22;
        MutableLiveData<List<Integer>> mutableLiveData23 = new MutableLiveData<>();
        this.mutableOldPosFromInv = mutableLiveData23;
        this.newOldPosFromInv = mutableLiveData23;
        MutableLiveData<List<Integer>> mutableLiveData24 = new MutableLiveData<>();
        this.mutableSavedInitPosInInv = mutableLiveData24;
        this.newSavedInitPosInInv = mutableLiveData24;
        MutableLiveData<Integer> mutableLiveData25 = new MutableLiveData<>();
        this.mutableMyExchangeItemPos = mutableLiveData25;
        this.newMyExchangeItemPos = mutableLiveData25;
        MutableLiveData<InvItems> mutableLiveData26 = new MutableLiveData<>();
        this.mutableItemFromSlot = mutableLiveData26;
        this.newItemFromSlot = mutableLiveData26;
        MutableLiveData<Integer> mutableLiveData27 = new MutableLiveData<>();
        this.mutableExchangeStatus = mutableLiveData27;
        this.newExchangeStatus = mutableLiveData27;
        MutableLiveData<Boolean> mutableLiveData28 = new MutableLiveData<>();
        this.mutableBlockStatus = mutableLiveData28;
        this.newBlockStatus = mutableLiveData28;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData29 = new MutableLiveData<>(bool);
        this.mutableReturnToTheOldValueOfMoney = mutableLiveData29;
        this.returnToTheOldValueOfMoney = mutableLiveData29;
        MutableLiveData<Boolean> mutableLiveData30 = new MutableLiveData<>(bool);
        this.mutableSaveTheOldValueOfMoney = mutableLiveData30;
        this.saveTheOldValueOfMoney = mutableLiveData30;
        MutableLiveData<List<VehiclesDTO>> mutableLiveData31 = new MutableLiveData<>();
        this.mutableVehicleItems = mutableLiveData31;
        this.vehicleItems = mutableLiveData31;
        MutableLiveData<List<SkinsDTO>> mutableLiveData32 = new MutableLiveData<>();
        this.mutableSkinItems = mutableLiveData32;
        this.skinItems = mutableLiveData32;
        try {
            mediatorLiveData.addSource(mutableLiveData9, new InventoryAndExchangeViewModel$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel.1
                public C41911() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke */
                public final void invoke2(List<Integer> list) {
                    InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
                    if (invSizeAndItemsObj == null) {
                        invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
                    }
                    invSizeAndItemsObj.setSizeActiveSlots(list.get(0));
                    InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
                }
            }));
            mediatorLiveData.addSource(mutableLiveData10, new InventoryAndExchangeViewModel$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel.2
                public C41922() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke */
                public final void invoke2(List<InvItems> list) {
                    InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
                    if (invSizeAndItemsObj == null) {
                        invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
                    }
                    invSizeAndItemsObj.setItemsList(list);
                    InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
                }
            }));
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    @NotNull
    public final LiveData<Integer> getNewTypeInterface() {
        return this.newTypeInterface;
    }

    @NotNull
    public final LiveData<String> getNewPlayersNick() {
        return this.newPlayersNick;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersLevel() {
        return this.newPlayersLevel;
    }

    @NotNull
    public final LiveData<Integer> getNewPlayersId() {
        return this.newPlayersId;
    }

    @NotNull
    public final LiveData<Integer> getNewCurrentWeight() {
        return this.newCurrentWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxWeight() {
        return this.newMaxWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewHungerParameter() {
        return this.newHungerParameter;
    }

    @NotNull
    public final LiveData<Integer> getNewVIPStatus() {
        return this.newVIPStatus;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewSlotsInInventory() {
        return this.newSlotsInInventory;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewInvItems() {
        return this.newInvItems;
    }

    @NotNull
    public final LiveData<InvSizeAndItemsObj> getNewMediatorInvItemsAndSize() {
        return this.newMediatorInvItemsAndSize;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewSlotItems() {
        return this.newSlotItems;
    }

    @NotNull
    public final LiveData<Integer> getNewSkinModelId() {
        return this.newSkinModelId;
    }

    @NotNull
    public final LiveData<Integer> getNewOldInvPosition() {
        return this.newOldInvPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewNewInvPosition() {
        return this.newNewInvPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewNewSlotPosition() {
        return this.newNewSlotPosition;
    }

    @NotNull
    public final LiveData<Integer> getNewMyMoney() {
        return this.newMyMoney;
    }

    @NotNull
    public final LiveData<String> getNewOtherPlayersNick() {
        return this.newOtherPlayersNick;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewMyExchangeItems() {
        return this.newMyExchangeItems;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewOtherExchangeItems() {
        return this.newOtherExchangeItems;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherExchangeItemPos() {
        return this.newOtherExchangeItemPos;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherMoney() {
        return this.newOtherMoney;
    }

    @NotNull
    public final LiveData<InvMessageObj> getNewNewMessage() {
        return this.newNewMessage;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewOldPosFromInv() {
        return this.newOldPosFromInv;
    }

    @NotNull
    public final LiveData<List<Integer>> getNewSavedInitPosInInv() {
        return this.newSavedInitPosInInv;
    }

    @NotNull
    public final LiveData<Integer> getNewMyExchangeItemPos() {
        return this.newMyExchangeItemPos;
    }

    @NotNull
    public final LiveData<InvItems> getNewItemFromSlot() {
        return this.newItemFromSlot;
    }

    @NotNull
    public final LiveData<Integer> getNewExchangeStatus() {
        return this.newExchangeStatus;
    }

    @NotNull
    public final LiveData<Boolean> getNewBlockStatus() {
        return this.newBlockStatus;
    }

    @NotNull
    public final LiveData<Boolean> getReturnToTheOldValueOfMoney() {
        return this.returnToTheOldValueOfMoney;
    }

    @NotNull
    public final LiveData<Boolean> getSaveTheOldValueOfMoney() {
        return this.saveTheOldValueOfMoney;
    }

    @NotNull
    public final LiveData<List<VehiclesDTO>> getVehicleItems() {
        return this.vehicleItems;
    }

    @NotNull
    public final LiveData<List<SkinsDTO>> getSkinItems() {
        return this.skinItems;
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "_activeSlots", "", "", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$1 */
    /* loaded from: classes.dex */
    public static final class C41911 extends Lambda implements Function1<List<Integer>, Unit> {
        public C41911() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke */
        public final void invoke2(List<Integer> list) {
            InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
            if (invSizeAndItemsObj == null) {
                invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
            }
            invSizeAndItemsObj.setSizeActiveSlots(list.get(0));
            InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
        }
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "_invItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$2 */
    /* loaded from: classes.dex */
    public static final class C41922 extends Lambda implements Function1<List<InvItems>, Unit> {
        public C41922() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke */
        public final void invoke2(List<InvItems> list) {
            InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.getValue();
            if (invSizeAndItemsObj == null) {
                invSizeAndItemsObj = new InvSizeAndItemsObj(null, null);
            }
            invSizeAndItemsObj.setItemsList(list);
            InventoryAndExchangeViewModel.this.mutableMediatorInvItemsAndSize.setValue(invSizeAndItemsObj);
        }
    }

    public final void setTypeInterface(int newTypeInterface) {
        this.mutableTypeInterface.postValue(Integer.valueOf(newTypeInterface));
    }

    public final void setPlayersNick(@NotNull String newPlayersNick) {
        Intrinsics.checkNotNullParameter(newPlayersNick, "newPlayersNick");
        this.mutablePlayersNick.postValue(newPlayersNick);
    }

    public final void setPlayersLevel(int newPlayersLevel) {
        this.mutablePlayersLevel.postValue(Integer.valueOf(newPlayersLevel));
    }

    public final void setPlayersId(int newPlayersId) {
        this.mutablePlayersId.postValue(Integer.valueOf(newPlayersId));
    }

    public final void setCurrentWeight(int newCurrentWeight) {
        this.mutableCurrentWeight.postValue(Integer.valueOf(newCurrentWeight));
    }

    public final void setMaxWeight(int newMaxWeight) {
        this.mutableMaxWeight.postValue(Integer.valueOf(newMaxWeight));
    }

    public final void setHungerParameter(int newHungerParameter) {
        this.mutableHungerParameter.postValue(Integer.valueOf(newHungerParameter));
    }

    public final void setVIPStatus(int newVIPStatus) {
        this.mutableVIPStatus.postValue(Integer.valueOf(newVIPStatus));
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$updateActiveSlots$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$updateActiveSlots$1 */
    /* loaded from: classes.dex */
    public static final class C42071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $sizeActiveSlots;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42071(int i, Continuation<? super C42071> continuation) {
            super(2, continuation);
            this.$sizeActiveSlots = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42071(this.$sizeActiveSlots, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableSlotsInInventory.getValue();
                    if (list != null) {
                        int i = this.$sizeActiveSlots;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list.size() == 2) {
                            list.set(1, list.get(0));
                            list.set(0, Boxing.boxInt(i));
                            inventoryAndExchangeViewModel.mutableSlotsInInventory.postValue(list);
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateActiveSlots(int sizeActiveSlots) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42071(sizeActiveSlots, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initInvItems$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initInvItems$1 */
    /* loaded from: classes.dex */
    public static final class C41941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ JSONArray $playersItemsInInventoryArray;
        public final /* synthetic */ int $sizeActiveSlots;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41941(JSONArray jSONArray, List<InvItems> list, int i, Continuation<? super C41941> continuation) {
            super(2, continuation);
            this.$playersItemsInInventoryArray = jSONArray;
            this.$allItemsFromJSON = list;
            this.$sizeActiveSlots = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C41941(this.$playersItemsInInventoryArray, this.$allItemsFromJSON, this.$sizeActiveSlots, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                InventoryAndExchangeViewModel.this.mutableInvItems.postValue(InventoryAndExchangeViewModel.this.actionWithJSONArray.newMigrateDataFromAnyToObject(this.$playersItemsInInventoryArray, 40, false, this.$allItemsFromJSON));
                InventoryAndExchangeViewModel.this.mutableSlotsInInventory.postValue(CollectionsKt__CollectionsKt.mutableListOf(Boxing.boxInt(this.$sizeActiveSlots - 1), Boxing.boxInt(this.$sizeActiveSlots - 1)));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initInvItems(@Nullable JSONArray playersItemsInInventoryArray, @NotNull List<InvItems> allItemsFromJSON, int sizeActiveSlots) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41941(playersItemsInInventoryArray, allItemsFromJSON, sizeActiveSlots, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initSavedPos$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initSavedPos$1 */
    /* loaded from: classes.dex */
    public static final class C41971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItems;
        public int label;
        public final /* synthetic */ InventoryAndExchangeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41971(List<InvItems> list, InventoryAndExchangeViewModel inventoryAndExchangeViewModel, Continuation<? super C41971> continuation) {
            super(2, continuation);
            this.$allItems = list;
            this.this$0 = inventoryAndExchangeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41971(this.$allItems, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<InvItems> it = this.$allItems.iterator();
                while (it.hasNext()) {
                    if (it.next().getItemsValue() == 0) {
                        arrayList.add(Boxing.boxInt(0));
                    } else {
                        arrayList.add(Boxing.boxInt(1));
                    }
                }
                this.this$0.mutableSavedInitPosInInv.postValue(arrayList);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initSavedPos(@NotNull List<InvItems> allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41971(allItems, this, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initSlotItems$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initSlotItems$1 */
    /* loaded from: classes.dex */
    public static final class C41981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ JSONArray $itemsInSlotArray;
        public final /* synthetic */ int $simCardNumber;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41981(JSONArray jSONArray, List<InvItems> list, int i, Continuation<? super C41981> continuation) {
            super(2, continuation);
            this.$itemsInSlotArray = jSONArray;
            this.$allItemsFromJSON = list;
            this.$simCardNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C41981(this.$itemsInSlotArray, this.$allItemsFromJSON, this.$simCardNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InvItems invItemsInitSimCard;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List<InvItems> listNewMigrateDataFromAnyToObject = InventoryAndExchangeViewModel.this.actionWithJSONArray.newMigrateDataFromAnyToObject(this.$itemsInSlotArray, 8, true, this.$allItemsFromJSON);
                if (this.$simCardNumber != 0 && (invItemsInitSimCard = InventoryAndExchangeViewModel.this.actionWithJSONArray.initSimCard(this.$simCardNumber, this.$allItemsFromJSON)) != null) {
                    listNewMigrateDataFromAnyToObject.set(0, invItemsInitSimCard);
                }
                InventoryAndExchangeViewModel.this.mutableSlotItems.postValue(listNewMigrateDataFromAnyToObject);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initSlotItems(@Nullable JSONArray itemsInSlotArray, @NotNull List<InvItems> allItemsFromJSON, int simCardNumber) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41981(itemsInSlotArray, allItemsFromJSON, simCardNumber, null), 2, null);
    }

    public final void setSkinModelId(int newModelId) {
        this.mutableSkinModelId.postValue(Integer.valueOf(newModelId));
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItem$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItem$1 */
    /* loaded from: classes.dex */
    public static final class C41991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $newPosition;
        public final /* synthetic */ int $oldPosition;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41991(int i, int i2, Continuation<? super C41991> continuation) {
            super(2, continuation);
            this.$newPosition = i;
            this.$oldPosition = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C41991(this.$newPosition, this.$oldPosition, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    if (list != null) {
                        int i = this.$newPosition;
                        int i2 = this.$oldPosition;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        list.set(i, InventoryUtilsKt.getFinalItem((InvItems) list.get(i2), ((InvItems) list.get(i2)).getItemsValue()));
                        list.set(i2, InventoryUtilsKt.emptyItem());
                        inventoryAndExchangeViewModel.mutableOldInvPosition.postValue(Boxing.boxInt(i2));
                        inventoryAndExchangeViewModel.mutableNewInvPosition.postValue(Boxing.boxInt(i));
                        inventoryAndExchangeViewModel.mutableInvItems.postValue(list);
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItem(int newPosition, int oldPosition) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41991(newPosition, oldPosition, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$useOrDeleteTheItem$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$useOrDeleteTheItem$1 */
    /* loaded from: classes.dex */
    public static final class C42081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentPosition;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42081(int i, Continuation<? super C42081> continuation) {
            super(2, continuation);
            this.$currentPosition = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42081(this.$currentPosition, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    if (list != null) {
                        int i = this.$currentPosition;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        switch (((InvItems) list.get(i)).getId()) {
                            case Constants.ID_TACKLE_1 /* 642 */:
                            case Constants.ID_TACKLE_2 /* 643 */:
                            case Constants.ID_TACKLE_3 /* 644 */:
                            case Constants.ID_TACKLE_4 /* 645 */:
                            case Constants.ID_TACKLE_5 /* 646 */:
                                ((InvItems) list.get(i)).setItemsValue(0);
                                break;
                            default:
                                ((InvItems) list.get(i)).setItemsValue(r2.getItemsValue() - 1);
                                break;
                        }
                        if (((InvItems) list.get(i)).getItemsValue() == 0) {
                            list.set(i, InventoryUtilsKt.emptyItem());
                        }
                        inventoryAndExchangeViewModel.mutableOldInvPosition.postValue(Boxing.boxInt(i));
                        inventoryAndExchangeViewModel.mutableInvItems.postValue(list);
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void useOrDeleteTheItem(int currentPosition) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42081(currentPosition, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromSlotToInv$1 */
    /* loaded from: classes.dex */
    public static final class C42031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $newPosInInv;
        public final /* synthetic */ int $posFromSlot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42031(int i, int i2, Continuation<? super C42031> continuation) {
            super(2, continuation);
            this.$newPosInInv = i;
            this.$posFromSlot = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42031(this.$newPosInInv, this.$posFromSlot, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    List list2 = (List) InventoryAndExchangeViewModel.this.mutableSlotItems.getValue();
                    List list3 = (List) InventoryAndExchangeViewModel.this.mutableSavedInitPosInInv.getValue();
                    if (list != null) {
                        int i = this.$newPosInInv;
                        int i2 = this.$posFromSlot;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list2 != null) {
                            list.set(i, InventoryUtilsKt.getFinalItem((InvItems) list2.get(i2), ((InvItems) list2.get(i2)).getItemsValue()));
                            list2.set(i2, InventoryUtilsKt.emptyItem());
                            inventoryAndExchangeViewModel.mutableItemFromSlot.postValue(list.get(i));
                            inventoryAndExchangeViewModel.mutableInvItems.postValue(list);
                            inventoryAndExchangeViewModel.mutableSlotItems.postValue(list2);
                            inventoryAndExchangeViewModel.mutableNewInvPosition.postValue(Boxing.boxInt(i));
                            inventoryAndExchangeViewModel.mutableNewSlotPosition.postValue(Boxing.boxInt(i2));
                            if (list3 != null) {
                                list3.set(i, Boxing.boxInt(1));
                                inventoryAndExchangeViewModel.mutableSavedInitPosInInv.postValue(list3);
                            }
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromSlotToInv(int posFromSlot, int newPosInInv) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42031(newPosInInv, posFromSlot, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToSlot$1 */
    /* loaded from: classes.dex */
    public static final class C42021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $posFromInv;
        public final /* synthetic */ int $posInSlot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42021(int i, int i2, Continuation<? super C42021> continuation) {
            super(2, continuation);
            this.$posInSlot = i;
            this.$posFromInv = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42021(this.$posInSlot, this.$posFromInv, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    List list2 = (List) InventoryAndExchangeViewModel.this.mutableSlotItems.getValue();
                    if (list != null) {
                        int i = this.$posInSlot;
                        int i2 = this.$posFromInv;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list2 != null) {
                            int i3 = i != 6 ? i != 255 ? i + 2 : 0 : 1;
                            if (((InvItems) list2.get(i3)).getItemsValue() != 0) {
                                int id = ((InvItems) list2.get(i3)).getId();
                                if (id == 58) {
                                    String textIfException = ((InvItems) list2.get(i3)).getTextIfException();
                                    ((InvItems) list2.get(i3)).setTextIfException(((InvItems) list.get(i2)).getTextIfException());
                                    ((InvItems) list.get(i2)).setTextIfException(textIfException);
                                } else if (id == 134) {
                                    int modelid = ((InvItems) list2.get(i3)).getModelid();
                                    ((InvItems) list2.get(i3)).setModelid(((InvItems) list.get(i2)).getModelid());
                                    ((InvItems) list.get(i2)).setModelid(modelid);
                                }
                            } else {
                                list2.set(i3, InventoryUtilsKt.getFinalItem((InvItems) list.get(i2), ((InvItems) list.get(i2)).getItemsValue()));
                                list.set(i2, InventoryUtilsKt.emptyItem());
                            }
                            inventoryAndExchangeViewModel.mutableInvItems.postValue(list);
                            inventoryAndExchangeViewModel.mutableSlotItems.postValue(list2);
                            inventoryAndExchangeViewModel.mutableOldInvPosition.postValue(Boxing.boxInt(i2));
                            inventoryAndExchangeViewModel.mutableNewSlotPosition.postValue(Boxing.boxInt(i3));
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromInvToSlot(int posFromInv, int posInSlot) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42021(posInSlot, posFromInv, null), 2, null);
    }

    public final void setMyMoney(int newMyMoney) {
        this.mutableMyMoney.postValue(Integer.valueOf(newMyMoney));
    }

    public final void setOtherPlayersNick(@Nullable String newOtherPlayersNick) {
        this.mutableOtherPlayersNick.postValue(newOtherPlayersNick);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initMyExchangeItems$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initMyExchangeItems$1 */
    /* loaded from: classes.dex */
    public static final class C41951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $inventorySize;
        public int label;
        public final /* synthetic */ InventoryAndExchangeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41951(int i, InventoryAndExchangeViewModel inventoryAndExchangeViewModel, Continuation<? super C41951> continuation) {
            super(2, continuation);
            this.$inventorySize = i;
            this.this$0 = inventoryAndExchangeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41951(this.$inventorySize, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < this.$inventorySize; i++) {
                    arrayList.add(InventoryUtilsKt.emptyItem());
                    arrayList2.add(Boxing.boxInt(-1));
                }
                this.this$0.mutableMyExchangeItems.postValue(arrayList);
                this.this$0.mutableOldPosFromInv.postValue(arrayList2);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initMyExchangeItems(int inventorySize) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41951(inventorySize, this, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initOtherExchangeItems$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$initOtherExchangeItems$1 */
    /* loaded from: classes.dex */
    public static final class C41961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $inventorySize;
        public int label;
        public final /* synthetic */ InventoryAndExchangeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41961(int i, InventoryAndExchangeViewModel inventoryAndExchangeViewModel, Continuation<? super C41961> continuation) {
            super(2, continuation);
            this.$inventorySize = i;
            this.this$0 = inventoryAndExchangeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41961(this.$inventorySize, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.$inventorySize; i++) {
                    arrayList.add(InventoryUtilsKt.emptyItem());
                }
                this.this$0.mutableOtherExchangeItems.postValue(arrayList);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initOtherExchangeItems(int inventorySize) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41961(inventorySize, this, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$setOtherMoney$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$setOtherMoney$1 */
    /* loaded from: classes.dex */
    public static final class C42051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Integer $newOtherMoney;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42051(Integer num, Continuation<? super C42051> continuation) {
            super(2, continuation);
            this.$newOtherMoney = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42051(this.$newOtherMoney, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    int i = ((Integer) InventoryAndExchangeViewModel.this.mutableOtherMoney.getValue()) == null ? 3 : 4;
                    Integer num = this.$newOtherMoney;
                    if (num != null) {
                        InventoryAndExchangeViewModel.this.mutableNewMessage.postValue(new InvMessageObj(false, 2, "", i, "", num.intValue()));
                    }
                    InventoryAndExchangeViewModel.this.mutableOtherMoney.postValue(this.$newOtherMoney);
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setOtherMoney(@Nullable Integer newOtherMoney) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42051(newOtherMoney, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$addNewOtherItem$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInventoryAndExchangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryAndExchangeViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel$addNewOtherItem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$addNewOtherItem$1 */
    /* loaded from: classes.dex */
    public static final class C41931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ int $newItemId;
        public final /* synthetic */ int $newItemValue;
        public final /* synthetic */ String $newPlateNumber;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41931(String str, List<InvItems> list, int i, int i2, Continuation<? super C41931> continuation) {
            super(2, continuation);
            this.$newPlateNumber = str;
            this.$allItemsFromJSON = list;
            this.$newItemId = i;
            this.$newItemValue = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C41931(this.$newPlateNumber, this.$allItemsFromJSON, this.$newItemId, this.$newItemValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x006f A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:92:0x000a, B:96:0x001d, B:97:0x0027, B:99:0x002e, B:105:0x0040, B:107:0x0044, B:115:0x005e, B:116:0x0061, B:120:0x0080, B:122:0x008a, B:123:0x0091, B:125:0x0097, B:129:0x00aa, B:139:0x00cd, B:140:0x00d4, B:142:0x00da, B:145:0x00e8, B:146:0x00eb, B:148:0x00f2, B:149:0x0107, B:153:0x0122, B:130:0x00ad, B:131:0x00b4, B:133:0x00ba, B:137:0x00c9, B:117:0x0068, B:118:0x006f, B:119:0x0076), top: B:160:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object obj2;
            Object next;
            Object next2;
            InvItems invItems;
            Object next3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableOtherExchangeItems.getValue();
                    String str = this.$newPlateNumber;
                    if (str == null) {
                        str = "";
                    }
                    List<InvItems> list2 = this.$allItemsFromJSON;
                    int i = this.$newItemId;
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        obj2 = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((InvItems) next).getId() == i) {
                            break;
                        }
                    }
                    InvItems invItems2 = (InvItems) next;
                    if (invItems2 != null) {
                        int i2 = this.$newItemId;
                        int i3 = this.$newItemValue;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        InvItems finalItem = InventoryUtilsKt.getFinalItem(invItems2, 0);
                        if (list != null) {
                            if (i2 == 58) {
                                finalItem.setTextIfException(String.valueOf(i3));
                                finalItem.setItemsValue(1);
                            } else if (i2 == 59) {
                                finalItem.setItemsValue(1);
                                finalItem.setTextIfException(str);
                            } else if (i2 == 134) {
                                finalItem.setItemsValue(1);
                                finalItem.setModelid(i3);
                            } else {
                                switch (i2) {
                                    case 81:
                                    case 82:
                                    case 83:
                                        break;
                                    default:
                                        finalItem.setItemsValue(i3);
                                        finalItem.setTextIfException(str);
                                        break;
                                }
                            }
                            finalItem.setWhoseItem(2);
                            if (finalItem.getFold() == 0) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next3 = it2.next();
                                        if (((InvItems) next3).getId() == finalItem.getId()) {
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                }
                                invItems = (InvItems) next3;
                            } else {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                        if (((InvItems) next2).getItemsValue() == 0) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                invItems = (InvItems) next2;
                            }
                            if (invItems == null) {
                                Iterator it4 = list.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Object next4 = it4.next();
                                        if (((InvItems) next4).getItemsValue() == 0) {
                                            obj2 = next4;
                                        }
                                    }
                                }
                                invItems = (InvItems) obj2;
                            }
                            int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends InvItems>) list, invItems);
                            if (iIndexOf != -1) {
                                list.set(iIndexOf, finalItem);
                                inventoryAndExchangeViewModel.mutableOtherExchangeItems.postValue(list);
                                inventoryAndExchangeViewModel.mutableOtherExchangeItemPos.postValue(Boxing.boxInt(iIndexOf));
                            }
                            MutableLiveData mutableLiveData = inventoryAndExchangeViewModel.mutableNewMessage;
                            String str2 = (String) UtilsKt.buildTypeMerge(finalItem.get_name(), finalItem.get_nameStore());
                            mutableLiveData.postValue(new InvMessageObj(false, 2, "", 1, str2 == null ? "" : str2, 0));
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void addNewOtherItem(int newItemId, int newItemValue, @Nullable String newPlateNumber, @NotNull List<InvItems> allItemsFromJSON) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41931(newPlateNumber, allItemsFromJSON, newItemId, newItemValue, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$subtractionOtherItem$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$subtractionOtherItem$1 */
    /* loaded from: classes.dex */
    public static final class C42061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $itemId;
        public final /* synthetic */ String $oldPlateNumber;
        public final /* synthetic */ int $subItemValue;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42061(String str, int i, int i2, Continuation<? super C42061> continuation) {
            super(2, continuation);
            this.$oldPlateNumber = str;
            this.$itemId = i;
            this.$subItemValue = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42061(this.$oldPlateNumber, this.$itemId, this.$subItemValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:141:0x00ab A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:99:0x000a, B:101:0x001a, B:104:0x0024, B:106:0x002b, B:107:0x0038, B:109:0x0044, B:113:0x0051, B:114:0x0054, B:133:0x008f, B:135:0x0095, B:139:0x009f, B:140:0x00a2, B:142:0x00b4, B:145:0x00ce, B:141:0x00ab, B:146:0x00da, B:148:0x00de, B:150:0x00ef, B:153:0x00f8, B:156:0x00ff, B:117:0x005b, B:119:0x0061, B:122:0x0068, B:124:0x006e, B:127:0x0079, B:129:0x007f), top: B:163:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x00cc  */
        /* JADX WARN: Type inference failed for: r3v5, types: [T, com.blackhub.bronline.game.gui.inventory.data.InvItems] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            T t;
            String str;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableOtherExchangeItems.getValue();
                    String strEmpty = this.$oldPlateNumber;
                    if (strEmpty == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    if (list != null) {
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        int i = this.$itemId;
                        int i2 = this.$subItemValue;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                InvItems invItems = (InvItems) next;
                                if (i == 58) {
                                    if (invItems.getId() == i && Intrinsics.areEqual(invItems.getTextIfException(), String.valueOf(i2))) {
                                        t = next;
                                    }
                                } else {
                                    if (i != 59) {
                                        if (i == 134) {
                                            if (invItems.getId() == i && invItems.getModelid() == i2) {
                                                t = next;
                                            }
                                        } else {
                                            switch (i) {
                                                case 81:
                                                case 82:
                                                case 83:
                                                    break;
                                                default:
                                                    if (invItems.getId() == i) {
                                                        t = next;
                                                        break;
                                                    }
                                            }
                                        }
                                    }
                                    if (invItems.getId() == i && Intrinsics.areEqual(invItems.getTextIfException(), strEmpty)) {
                                        t = next;
                                    }
                                }
                            } else {
                                t = 0;
                            }
                        }
                        objectRef.element = t;
                        InvItems invItems2 = (InvItems) t;
                        if (invItems2 != null) {
                            int id = invItems2.getId();
                            if (id == 58 || id == 59 || id == 134) {
                                invItems2.setItemsValue(invItems2.getItemsValue() - 1);
                                MutableLiveData mutableLiveData = inventoryAndExchangeViewModel.mutableNewMessage;
                                str = (String) UtilsKt.buildTypeMerge(invItems2.get_name(), invItems2.get_nameStore());
                                if (str == null) {
                                    str = "";
                                }
                                mutableLiveData.postValue(new InvMessageObj(false, 2, "", 2, str, 0));
                            } else {
                                switch (id) {
                                    case 81:
                                    case 82:
                                    case 83:
                                        break;
                                    default:
                                        invItems2.setItemsValue(invItems2.getItemsValue() - i2);
                                        break;
                                }
                                MutableLiveData mutableLiveData2 = inventoryAndExchangeViewModel.mutableNewMessage;
                                str = (String) UtilsKt.buildTypeMerge(invItems2.get_name(), invItems2.get_nameStore());
                                if (str == null) {
                                }
                                mutableLiveData2.postValue(new InvMessageObj(false, 2, "", 2, str, 0));
                            }
                        }
                        T t2 = objectRef.element;
                        if (t2 != 0) {
                            int iIndexOf = CollectionsKt___CollectionsKt.indexOf(list, (Object) t2);
                            T t3 = objectRef.element;
                            Intrinsics.checkNotNull(t3);
                            if (((InvItems) t3).getItemsValue() == 0) {
                                ?? EmptyItem = InventoryUtilsKt.emptyItem();
                                objectRef.element = EmptyItem;
                                if (EmptyItem != 0) {
                                    EmptyItem.setWhoseItem(0);
                                }
                            }
                            if (iIndexOf != -1) {
                                T t4 = objectRef.element;
                                Intrinsics.checkNotNull(t4);
                                list.set(iIndexOf, t4);
                                inventoryAndExchangeViewModel.mutableOtherExchangeItems.postValue(list);
                                inventoryAndExchangeViewModel.mutableOtherExchangeItemPos.postValue(Boxing.boxInt(iIndexOf));
                            }
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void subtractionOtherItem(int itemId, int subItemValue, @Nullable String oldPlateNumber) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42061(oldPlateNumber, itemId, subItemValue, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInventoryAndExchangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryAndExchangeViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1 */
    /* loaded from: classes.dex */
    public static final class C42011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $itemPos;
        public final /* synthetic */ int $itemValue;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42011(int i, int i2, Continuation<? super C42011> continuation) {
            super(2, continuation);
            this.$itemPos = i;
            this.$itemValue = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42011(this.$itemPos, this.$itemValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            InvItems invItems;
            Object next2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    List list2 = (List) InventoryAndExchangeViewModel.this.mutableMyExchangeItems.getValue();
                    List list3 = (List) InventoryAndExchangeViewModel.this.mutableOldPosFromInv.getValue();
                    if (list != null) {
                        int i = this.$itemPos;
                        int i2 = this.$itemValue;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list2 != null && list3 != null) {
                            Object obj2 = list.get(i);
                            Object obj3 = null;
                            if (((InvItems) obj2).getFold() == 0) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    if (((InvItems) next2).getId() == ((InvItems) obj2).getId()) {
                                        break;
                                    }
                                }
                                invItems = (InvItems) next2;
                            } else {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    if (((InvItems) next).getItemsValue() == 0) {
                                        break;
                                    }
                                }
                                invItems = (InvItems) next;
                            }
                            if (invItems == null) {
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (((InvItems) next3).getItemsValue() == 0) {
                                        obj3 = next3;
                                        break;
                                    }
                                }
                                invItems = (InvItems) obj3;
                            }
                            int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends InvItems>) list2, invItems);
                            InvItems finalItem = InventoryUtilsKt.getFinalItem((InvItems) obj2, (invItems != null ? invItems.getItemsValue() : 0) + i2);
                            finalItem.setWhoseItem(1);
                            InvItems invItems2 = (InvItems) obj2;
                            invItems2.setItemsValue(invItems2.getItemsValue() - i2);
                            int itemsValue = ((InvItems) obj2).getItemsValue();
                            Object obj4 = obj2;
                            if (itemsValue == 0) {
                                InvItems invItemsEmptyItem = InventoryUtilsKt.emptyItem();
                                invItemsEmptyItem.setWhoseItem(0);
                                obj4 = invItemsEmptyItem;
                            }
                            if (iIndexOf != -1) {
                                list2.set(iIndexOf, finalItem);
                                list.set(i, obj4);
                                list3.set(iIndexOf, Boxing.boxInt(i));
                                inventoryAndExchangeViewModel.mutableMyExchangeItems.postValue(list2);
                                inventoryAndExchangeViewModel.mutableInvItems.postValue(list);
                                inventoryAndExchangeViewModel.mutableOldPosFromInv.postValue(list3);
                                inventoryAndExchangeViewModel.mutableMyExchangeItemPos.postValue(Boxing.boxInt(iIndexOf));
                                inventoryAndExchangeViewModel.mutableOldInvPosition.postValue(Boxing.boxInt(i));
                            }
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromInvToExchange(int itemPos, int itemValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42011(itemPos, itemValue, null), 2, null);
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromExchangeToInv$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromExchangeToInv$1 */
    /* loaded from: classes.dex */
    public static final class C42001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $migrateValue;
        public final /* synthetic */ int $posFromExchange;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42001(int i, int i2, Continuation<? super C42001> continuation) {
            super(2, continuation);
            this.$posFromExchange = i;
            this.$migrateValue = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42001(this.$posFromExchange, this.$migrateValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableOldPosFromInv.getValue();
                    List list2 = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    List list3 = (List) InventoryAndExchangeViewModel.this.mutableMyExchangeItems.getValue();
                    if (list2 != null) {
                        int i = this.$posFromExchange;
                        int i2 = this.$migrateValue;
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list3 != null && list != null) {
                            InvItems finalItem = InventoryUtilsKt.getFinalItem((InvItems) list3.get(i), ((InvItems) list3.get(i)).getItemsValue() - i2);
                            list2.set(((Number) list.get(i)).intValue(), InventoryUtilsKt.getFinalItem(finalItem, ((InvItems) list2.get(((Number) list.get(i)).intValue())).getItemsValue() + i2));
                            ((InvItems) list2.get(((Number) list.get(i)).intValue())).setWhoseItem(0);
                            inventoryAndExchangeViewModel.mutableNewInvPosition.postValue(list.get(i));
                            if (finalItem.getItemsValue() == 0) {
                                finalItem = InventoryUtilsKt.emptyItem();
                                list.set(i, Boxing.boxInt(-1));
                            } else {
                                finalItem.setWhoseItem(1);
                            }
                            list3.set(i, finalItem);
                            inventoryAndExchangeViewModel.mutableInvItems.postValue(list2);
                            inventoryAndExchangeViewModel.mutableMyExchangeItems.postValue(list3);
                            inventoryAndExchangeViewModel.mutableOldPosFromInv.postValue(list);
                            inventoryAndExchangeViewModel.mutableMyExchangeItemPos.postValue(Boxing.boxInt(i));
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromExchangeToInv(int posFromExchange, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42001(posFromExchange, migrateValue, null), 2, null);
    }

    public final void updateExchangeStatus(int newExchangeStatus) {
        this.mutableExchangeStatus.postValue(Integer.valueOf(newExchangeStatus));
    }

    public final void setBlockStatus(boolean newStatus) {
        this.mutableBlockStatus.setValue(Boolean.valueOf(newStatus));
    }

    /* compiled from: InventoryAndExchangeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$setInitState$1", m7120f = "InventoryAndExchangeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$setInitState$1 */
    /* loaded from: classes.dex */
    public static final class C42041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42041(Continuation<? super C42041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InventoryAndExchangeViewModel.this.new C42041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) InventoryAndExchangeViewModel.this.mutableOldPosFromInv.getValue();
                    List list2 = (List) InventoryAndExchangeViewModel.this.mutableInvItems.getValue();
                    List list3 = (List) InventoryAndExchangeViewModel.this.mutableMyExchangeItems.getValue();
                    if (list2 != null) {
                        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = InventoryAndExchangeViewModel.this;
                        if (list3 != null && list != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                if (((Number) list.get(i)).intValue() != -1) {
                                    InvItems finalItem = InventoryUtilsKt.getFinalItem((InvItems) list3.get(i), ((InvItems) list3.get(i)).getItemsValue() + ((InvItems) list2.get(((Number) list.get(i)).intValue())).getItemsValue());
                                    finalItem.setWhoseItem(0);
                                    list2.set(((Number) list.get(i)).intValue(), finalItem);
                                    list3.set(i, InventoryUtilsKt.emptyItem());
                                    list.set(i, Boxing.boxInt(-1));
                                }
                            }
                            inventoryAndExchangeViewModel.mutableInvItems.postValue(list2);
                            inventoryAndExchangeViewModel.mutableMyExchangeItems.postValue(list3);
                            inventoryAndExchangeViewModel.mutableOldPosFromInv.postValue(list);
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setInitState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C42041(null), 2, null);
    }

    public final void setNewMessage(@NotNull InvMessageObj newMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        this.mutableNewMessage.postValue(newMessage);
    }

    public final void returnToTheOldValueOfMoney() {
        this.mutableReturnToTheOldValueOfMoney.setValue(Boolean.TRUE);
    }

    public final void saveTheOldValueOfMoney() {
        this.mutableSaveTheOldValueOfMoney.setValue(Boolean.TRUE);
    }

    public final void setSkins(@NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.mutableSkinItems.setValue(skinsList);
    }
}
