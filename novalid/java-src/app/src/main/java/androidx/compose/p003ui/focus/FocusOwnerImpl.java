package androidx.compose.p003ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p003ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p003ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusOwnerImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u001a\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000208H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u001aH\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\u001a\u0010:\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010'J\u001a\u0010<\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u00103J\u000e\u0010>\u001a\u0004\u0018\u00010?*\u00020@H\u0002JY\u0010A\u001a\u00020\u0005\"\n\b\u0000\u0010B\u0018\u0001*\u00020@*\u00020@2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0D2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchKeyEvent-ZmokQxo", "dispatchRotaryEvent", "event", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "validateKeyEvent", "validateKeyEvent-ZmokQxo", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", ExifInterface.GPS_DIRECTION_TRUE, "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,335:1\n266#1:420\n267#1:492\n268#1:499\n269#1:546\n270#1:593\n271#1:600\n266#1:671\n267#1:743\n268#1:750\n269#1:797\n270#1:844\n271#1:851\n266#1:922\n267#1:994\n268#1:1001\n269#1:1048\n270#1:1095\n271#1:1102\n39#2,7:336\n46#2,4:346\n1#3:343\n1#3:358\n1#3:429\n1#3:609\n1#3:680\n1#3:860\n1#3:931\n1#3:1111\n1#3:1281\n1#3:1293\n728#4,2:344\n96#5:350\n96#5:419\n104#5:601\n104#5:670\n98#5:852\n98#5:921\n90#5,7:1272\n90#5:1288\n262#6:351\n230#6,5:352\n58#6:357\n59#6,8:359\n385#6,5:367\n263#6:372\n390#6:373\n395#6,2:375\n397#6,8:380\n405#6,9:391\n414#6,8:403\n68#6,7:411\n265#6:418\n253#6,2:421\n230#6,5:423\n58#6:428\n59#6,8:430\n385#6,5:438\n255#6,3:443\n390#6:446\n395#6,2:448\n397#6,8:453\n405#6,9:464\n414#6,8:476\n68#6,7:484\n258#6:491\n385#6,12:500\n397#6,8:515\n405#6,9:526\n414#6,8:538\n385#6,12:547\n397#6,8:562\n405#6,9:573\n414#6,8:585\n262#6:602\n230#6,5:603\n58#6:608\n59#6,8:610\n385#6,5:618\n263#6:623\n390#6:624\n395#6,2:626\n397#6,8:631\n405#6,9:642\n414#6,8:654\n68#6,7:662\n265#6:669\n253#6,2:672\n230#6,5:674\n58#6:679\n59#6,8:681\n385#6,5:689\n255#6,3:694\n390#6:697\n395#6,2:699\n397#6,8:704\n405#6,9:715\n414#6,8:727\n68#6,7:735\n258#6:742\n385#6,12:751\n397#6,8:766\n405#6,9:777\n414#6,8:789\n385#6,12:798\n397#6,8:813\n405#6,9:824\n414#6,8:836\n262#6:853\n230#6,5:854\n58#6:859\n59#6,8:861\n385#6,5:869\n263#6:874\n390#6:875\n395#6,2:877\n397#6,8:882\n405#6,9:893\n414#6,8:905\n68#6,7:913\n265#6:920\n253#6,2:923\n230#6,5:925\n58#6:930\n59#6,8:932\n385#6,5:940\n255#6,3:945\n390#6:948\n395#6,2:950\n397#6,8:955\n405#6,9:966\n414#6,8:978\n68#6,7:986\n258#6:993\n385#6,12:1002\n397#6,8:1017\n405#6,9:1028\n414#6,8:1040\n385#6,12:1049\n397#6,8:1064\n405#6,9:1075\n414#6,8:1087\n253#6,2:1103\n230#6,5:1105\n58#6:1110\n59#6,8:1112\n385#6,5:1120\n255#6,3:1125\n390#6:1128\n395#6,2:1130\n397#6,8:1135\n405#6,9:1146\n414#6,8:1158\n68#6,7:1166\n258#6:1173\n385#6,6:1180\n395#6,2:1187\n397#6,8:1192\n405#6,9:1203\n414#6,8:1215\n385#6,6:1223\n395#6,2:1230\n397#6,8:1235\n405#6,9:1246\n414#6,8:1258\n190#6:1280\n191#6,6:1282\n198#6,3:1290\n261#7:374\n261#7:447\n261#7:625\n261#7:698\n261#7:876\n261#7:949\n261#7:1129\n261#7:1186\n261#7:1229\n261#7:1289\n234#8,3:377\n237#8,3:400\n234#8,3:450\n237#8,3:473\n234#8,3:512\n237#8,3:535\n234#8,3:559\n237#8,3:582\n234#8,3:628\n237#8,3:651\n234#8,3:701\n237#8,3:724\n234#8,3:763\n237#8,3:786\n234#8,3:810\n237#8,3:833\n234#8,3:879\n237#8,3:902\n234#8,3:952\n237#8,3:975\n234#8,3:1014\n237#8,3:1037\n234#8,3:1061\n237#8,3:1084\n234#8,3:1132\n237#8,3:1155\n234#8,3:1189\n237#8,3:1212\n234#8,3:1232\n237#8,3:1255\n1208#9:388\n1187#9,2:389\n1208#9:461\n1187#9,2:462\n1208#9:523\n1187#9,2:524\n1208#9:570\n1187#9,2:571\n1208#9:639\n1187#9,2:640\n1208#9:712\n1187#9,2:713\n1208#9:774\n1187#9,2:775\n1208#9:821\n1187#9,2:822\n1208#9:890\n1187#9,2:891\n1208#9:963\n1187#9,2:964\n1208#9:1025\n1187#9,2:1026\n1208#9:1072\n1187#9,2:1073\n1208#9:1143\n1187#9,2:1144\n1208#9:1200\n1187#9,2:1201\n1208#9:1243\n1187#9,2:1244\n51#10,6:493\n33#10,6:594\n51#10,6:744\n33#10,6:845\n51#10,6:995\n33#10,6:1096\n51#10,6:1174\n33#10,6:1266\n47#11:1279\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n212#1:420\n212#1:492\n212#1:499\n212#1:546\n212#1:593\n212#1:600\n225#1:671\n225#1:743\n225#1:750\n225#1:797\n225#1:844\n225#1:851\n240#1:922\n240#1:994\n240#1:1001\n240#1:1048\n240#1:1095\n240#1:1102\n138#1:336,7\n138#1:346,4\n138#1:343\n210#1:358\n212#1:429\n223#1:609\n225#1:680\n238#1:860\n240#1:931\n266#1:1111\n282#1:1281\n138#1:344,2\n210#1:350\n213#1:419\n223#1:601\n226#1:670\n238#1:852\n241#1:921\n282#1:1272,7\n283#1:1288\n210#1:351\n210#1:352,5\n210#1:357\n210#1:359,8\n210#1:367,5\n210#1:372\n210#1:373\n210#1:375,2\n210#1:380,8\n210#1:391,9\n210#1:403,8\n210#1:411,7\n210#1:418\n212#1:421,2\n212#1:423,5\n212#1:428\n212#1:430,8\n212#1:438,5\n212#1:443,3\n212#1:446\n212#1:448,2\n212#1:453,8\n212#1:464,9\n212#1:476,8\n212#1:484,7\n212#1:491\n212#1:500,12\n212#1:515,8\n212#1:526,9\n212#1:538,8\n212#1:547,12\n212#1:562,8\n212#1:573,9\n212#1:585,8\n223#1:602\n223#1:603,5\n223#1:608\n223#1:610,8\n223#1:618,5\n223#1:623\n223#1:624\n223#1:626,2\n223#1:631,8\n223#1:642,9\n223#1:654,8\n223#1:662,7\n223#1:669\n225#1:672,2\n225#1:674,5\n225#1:679\n225#1:681,8\n225#1:689,5\n225#1:694,3\n225#1:697\n225#1:699,2\n225#1:704,8\n225#1:715,9\n225#1:727,8\n225#1:735,7\n225#1:742\n225#1:751,12\n225#1:766,8\n225#1:777,9\n225#1:789,8\n225#1:798,12\n225#1:813,8\n225#1:824,9\n225#1:836,8\n238#1:853\n238#1:854,5\n238#1:859\n238#1:861,8\n238#1:869,5\n238#1:874\n238#1:875\n238#1:877,2\n238#1:882,8\n238#1:893,9\n238#1:905,8\n238#1:913,7\n238#1:920\n240#1:923,2\n240#1:925,5\n240#1:930\n240#1:932,8\n240#1:940,5\n240#1:945,3\n240#1:948\n240#1:950,2\n240#1:955,8\n240#1:966,9\n240#1:978,8\n240#1:986,7\n240#1:993\n240#1:1002,12\n240#1:1017,8\n240#1:1028,9\n240#1:1040,8\n240#1:1049,12\n240#1:1064,8\n240#1:1075,9\n240#1:1087,8\n266#1:1103,2\n266#1:1105,5\n266#1:1110\n266#1:1112,8\n266#1:1120,5\n266#1:1125,3\n266#1:1128\n266#1:1130,2\n266#1:1135,8\n266#1:1146,9\n266#1:1158,8\n266#1:1166,7\n266#1:1173\n268#1:1180,6\n268#1:1187,2\n268#1:1192,8\n268#1:1203,9\n268#1:1215,8\n269#1:1223,6\n269#1:1230,2\n269#1:1235,8\n269#1:1246,9\n269#1:1258,8\n282#1:1280\n282#1:1282,6\n282#1:1290,3\n210#1:374\n212#1:447\n223#1:625\n225#1:698\n238#1:876\n240#1:949\n266#1:1129\n268#1:1186\n269#1:1229\n283#1:1289\n210#1:377,3\n210#1:400,3\n212#1:450,3\n212#1:473,3\n212#1:512,3\n212#1:535,3\n212#1:559,3\n212#1:582,3\n223#1:628,3\n223#1:651,3\n225#1:701,3\n225#1:724,3\n225#1:763,3\n225#1:786,3\n225#1:810,3\n225#1:833,3\n238#1:879,3\n238#1:902,3\n240#1:952,3\n240#1:975,3\n240#1:1014,3\n240#1:1037,3\n240#1:1061,3\n240#1:1084,3\n266#1:1132,3\n266#1:1155,3\n268#1:1189,3\n268#1:1212,3\n269#1:1232,3\n269#1:1255,3\n210#1:388\n210#1:389,2\n212#1:461\n212#1:462,2\n212#1:523\n212#1:524,2\n212#1:570\n212#1:571,2\n223#1:639\n223#1:640,2\n225#1:712\n225#1:713,2\n225#1:774\n225#1:775,2\n225#1:821\n225#1:822,2\n238#1:890\n238#1:891,2\n240#1:963\n240#1:964,2\n240#1:1025\n240#1:1026,2\n240#1:1072\n240#1:1073,2\n266#1:1143\n266#1:1144,2\n268#1:1200\n268#1:1201,2\n269#1:1243\n269#1:1244,2\n212#1:493,6\n212#1:594,6\n225#1:744,6\n225#1:845,6\n240#1:995,6\n240#1:1096,6\n267#1:1174,6\n270#1:1266,6\n282#1:1279\n*E\n"})
/* loaded from: classes3.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;

    @NotNull
    private final FocusInvalidationManager focusInvalidationManager;

    @Nullable
    private MutableLongSet keysCurrentlyDown;
    public LayoutDirection layoutDirection;

    @NotNull
    private FocusTargetNode rootFocusNode = new FocusTargetNode();

    @NotNull
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();

    @NotNull
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object other) {
            return other == this;
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void update(@NotNull FocusTargetNode node) {
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        @NotNull
        public FocusTargetNode create() {
            return this.this$0.getRootFocusNode();
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode().hashCode();
        }
    };

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.focusInvalidationManager = new FocusInvalidationManager(function1);
    }

    @NotNull
    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(@NotNull FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @NotNull
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.p003ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (!force) {
                int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m11047performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.INSTANCE.m11027getExitdhqQ8s()).ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    focusTransactionManager.commitTransaction();
                    return;
                }
            }
            FocusStateImpl focusState = this.rootFocusNode.getFocusState();
            if (FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                int i2 = WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    focusStateImpl = FocusStateImpl.Active;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    focusStateImpl = FocusStateImpl.Inactive;
                }
                focusTargetNode.setFocusState(focusStateImpl);
            }
            Unit unit = Unit.INSTANCE;
            focusTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManager.commitTransaction();
            throw th;
        }
    }

    @Override // androidx.compose.p003ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo11033moveFocus3ESFkO8(final int focusDirection) {
        final FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode == null) {
            return false;
        }
        FocusRequester focusRequesterM11051customFocusSearchOMvw8 = FocusTraversalKt.m11051customFocusSearchOMvw8(focusTargetNodeFindActiveFocusNode, focusDirection, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (focusRequesterM11051customFocusSearchOMvw8 != companion.getDefault()) {
            return focusRequesterM11051customFocusSearchOMvw8 != companion.getCancel() && focusRequesterM11051customFocusSearchOMvw8.focus$ui_release();
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zM11052focusSearchsMXa3k8 = FocusTraversalKt.m11052focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1

            /* compiled from: FocusOwnerImpl.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CustomDestinationResult.values().length];
                    try {
                        iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CustomDestinationResult.None.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FocusTargetNode focusTargetNode) {
                Modifier.Node node;
                boolean zPerformRequestFocus;
                NodeChain nodes;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeFindActiveFocusNode)) {
                    return Boolean.FALSE;
                }
                int iM12816constructorimpl = NodeKind.m12816constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop0: while (true) {
                    node = null;
                    zPerformRequestFocus = true;
                    if (layoutNodeRequireLayoutNode == null) {
                        break;
                    }
                    if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & iM12816constructorimpl) != 0) {
                                Modifier.Node nodePop = parent;
                                MutableVector mutableVector = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        node = nodePop;
                                        break loop0;
                                    }
                                    if ((nodePop.getKindSet() & iM12816constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nodePop = delegate;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                    parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
                }
                if (node == null) {
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                FocusTransactionManager focusTransactionManager = this.getFocusTransactionManager();
                int i2 = focusDirection;
                Ref.BooleanRef booleanRef2 = booleanRef;
                try {
                    if (focusTransactionManager.ongoingTransaction) {
                        focusTransactionManager.cancelTransaction();
                    }
                    focusTransactionManager.beginTransaction();
                    int i3 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m11050performCustomRequestFocusMxy_nc0(focusTargetNode, i2).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2 || i3 == 3) {
                            booleanRef2.element = true;
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zPerformRequestFocus = FocusTransactionsKt.performRequestFocus(focusTargetNode);
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(zPerformRequestFocus);
                    focusTransactionManager.commitTransaction();
                    return boolValueOf;
                } catch (Throwable th) {
                    focusTransactionManager.commitTransaction();
                    throw th;
                }
            }
        });
        if (booleanRef.element) {
            return false;
        }
        return zM11052focusSearchsMXa3k8 || m11038wrapAroundFocus3ESFkO8(focusDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    @Override // androidx.compose.p003ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo11035dispatchKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        if (!m11037validateKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        Modifier.Node nodeLastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetNodeFindActiveFocusNode);
        if (nodeLastLocalKeyInputNode == null) {
            int iM12816constructorimpl = NodeKind.m12816constructorimpl(8192);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNodeFindActiveFocusNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM12816constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = parent;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof KeyInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) delegatingNodePop;
            nodeLastLocalKeyInputNode = keyInputModifierNode != null ? keyInputModifierNode.getNode() : null;
        }
        if (nodeLastLocalKeyInputNode != null) {
            int iM12816constructorimpl2 = NodeKind.m12816constructorimpl(8192);
            if (!nodeLastLocalKeyInputNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent2 = nodeLastLocalKeyInputNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(nodeLastLocalKeyInputNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & iM12816constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent2;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof KeyInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM12816constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM12816constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((KeyInputModifierNode) arrayList.get(size)).mo7741onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node = nodeLastLocalKeyInputNode.getNode();
            MutableVector mutableVector3 = null;
            while (node != 0) {
                if (node instanceof KeyInputModifierNode) {
                    if (((KeyInputModifierNode) node).mo7741onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node.getKindSet() & iM12816constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node.getDelegate();
                    int i4 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM12816constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector3.add(node);
                                    node = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i4 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node2 = nodeLastLocalKeyInputNode.getNode();
            MutableVector mutableVector4 = null;
            while (node2 != 0) {
                if (node2 instanceof KeyInputModifierNode) {
                    if (((KeyInputModifierNode) node2).mo7739onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM12816constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node2.getDelegate();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM12816constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector4.add(node2);
                                    node2 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((KeyInputModifierNode) arrayList.get(i6)).mo7739onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.p003ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo11034dispatchInterceptedSoftKeyboardEventZmokQxo(@NotNull KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM12816constructorimpl = NodeKind.m12816constructorimpl(131072);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNodeFindActiveFocusNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM12816constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = parent;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNodePop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int iM12816constructorimpl2 = NodeKind.m12816constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent2 = softKeyboardInterceptionModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & iM12816constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent2;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM12816constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM12816constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo12036onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node != 0) {
                if (node instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node).mo12036onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node.getKindSet() & iM12816constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node.getDelegate();
                    int i4 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM12816constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector3.add(node);
                                    node = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i4 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node2 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node2 != 0) {
                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node2).mo12035onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM12816constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node2.getDelegate();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM12816constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector4.add(node2);
                                    node2 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo12035onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.p003ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNodePop;
        NodeChain nodes2;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            int iM12816constructorimpl = NodeKind.m12816constructorimpl(16384);
            if (!focusTargetNodeFindActiveFocusNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNodeFindActiveFocusNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNodeFindActiveFocusNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    delegatingNodePop = 0;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM12816constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNodePop = parent;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodePop.getKindSet() & iM12816constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12816constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNodePop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int iM12816constructorimpl2 = NodeKind.m12816constructorimpl(16384);
            if (!rotaryInputModifierNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent2 = rotaryInputModifierNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM12816constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & iM12816constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent2;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet() & iM12816constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iM12816constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node != 0) {
                if (node instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node.getKindSet() & iM12816constructorimpl2) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node.getDelegate();
                    int i4 = 0;
                    node = node;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iM12816constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector3.add(node);
                                    node = 0;
                                }
                                mutableVector3.add(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node = node;
                    }
                    if (i4 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node2 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iM12816constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node2.getDelegate();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iM12816constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    mutableVector4.add(node2);
                                    node2 = 0;
                                }
                                mutableVector4.add(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.p003ui.focus.FocusOwner
    @Nullable
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindActiveFocusNode);
        }
        return null;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8 */
    private final boolean m11038wrapAroundFocus3ESFkO8(int focusDirection) {
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.m11019equalsimpl0(focusDirection, companion.m11029getNextdhqQ8s()) ? true : FocusDirection.m11019equalsimpl0(focusDirection, companion.m11030getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.rootFocusNode.getFocusState().isFocused()) {
                    return mo11033moveFocus3ESFkO8(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: validateKeyEvent-ZmokQxo */
    private final boolean m11037validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM12348getKeyZmokQxo = KeyEvent_androidKt.m12348getKeyZmokQxo(keyEvent);
        int iM12349getTypeZmokQxo = KeyEvent_androidKt.m12349getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        if (KeyEventType.m12341equalsimpl0(iM12349getTypeZmokQxo, companion.m12345getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(jM12348getKeyZmokQxo);
        } else if (KeyEventType.m12341equalsimpl0(iM12349getTypeZmokQxo, companion.m12346getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(jM12348getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(jM12348getKeyZmokQxo);
            }
        }
        return true;
    }

    /* renamed from: traverseAncestors-Y-YKmho */
    private final /* synthetic */ <T extends DelegatableNode> void m11036traverseAncestorsYYKmho(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        int size;
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        for (Modifier.Node nodePop = parent; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i2 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = DelegatableNodeKt.pop(null)) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
        }
        for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            function12.invoke(node2);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function12.invoke((Object) arrayList.get(i3));
            }
        }
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM12816constructorimpl = NodeKind.m12816constructorimpl(1024) | NodeKind.m12816constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & iM12816constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM12816constructorimpl) != 0) {
                    if ((NodeKind.m12816constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }
}
