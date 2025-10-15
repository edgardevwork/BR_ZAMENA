package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.MetadataUtil;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.p007ts.UserDataReader;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.entertainmentsystem.utils.EntertainmentConstants;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.apache.commons.codec.language.p055bm.Languages;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m7104d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, m7105d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", Languages.ANY, "", ExifInterface.LONGITUDE_EAST, "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", CatchStreamerKeys.COUNT_KEY, "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", FirebaseAnalytics.Param.INDEX, "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", FirebaseAnalytics.Param.DESTINATION, "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", ArchiveStreamFactory.ZIP, "other", "a", "b", "kotlinx-coroutines-core"}, m7106k = 5, m7107mv = {1, 8, 0}, m7109xi = 48, m7110xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n82#2,11:480\n82#2,11:491\n82#2,11:502\n82#2,11:513\n105#2:524\n82#2,6:525\n106#2:531\n92#2:532\n107#2:533\n88#2,3:534\n82#2,11:537\n105#2:548\n82#2,6:549\n106#2,2:555\n92#2:557\n88#2,3:558\n82#2,11:561\n82#2,11:572\n82#2,11:583\n105#2:594\n82#2,6:595\n106#2,2:601\n92#2:603\n88#2,3:604\n105#2:607\n82#2,6:608\n106#2,2:614\n92#2:616\n88#2,3:617\n105#2:620\n82#2,6:621\n106#2,2:627\n92#2:629\n88#2,3:630\n105#2:633\n82#2,6:634\n106#2,2:640\n92#2:642\n88#2,3:643\n105#2:646\n82#2,6:647\n106#2,2:653\n92#2:655\n88#2,3:656\n82#2,11:659\n105#2:670\n82#2,6:671\n106#2,2:677\n92#2:679\n88#2,3:680\n82#2,11:683\n82#2,11:694\n82#2,11:705\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n34#1:480,11\n49#1:491,11\n63#1:502,11\n73#1:513,11\n84#1:524\n84#1:525,6\n84#1:531\n84#1:532\n84#1:533\n84#1:534,3\n95#1:537,11\n110#1:548\n110#1:549,6\n110#1:555,2\n110#1:557\n110#1:558,3\n121#1:561,11\n134#1:572,11\n147#1:583,11\n232#1:594\n232#1:595,6\n232#1:601,2\n232#1:603\n232#1:604,3\n241#1:607\n241#1:608,6\n241#1:614,2\n241#1:616\n241#1:617,3\n277#1:620\n277#1:621,6\n277#1:627,2\n277#1:629\n277#1:630,3\n285#1:633\n285#1:634,6\n285#1:640,2\n285#1:642\n285#1:643,3\n298#1:646\n298#1:647,6\n298#1:653,2\n298#1:655\n298#1:656,3\n403#1:659,11\n411#1:670\n411#1:671,6\n411#1:677,2\n411#1:679\n411#1:680,3\n418#1:683,11\n432#1:694,11\n446#1:705,11\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0}, m7122l = {404}, m7123m = Languages.ANY, m7124n = {"$this$consume$iv"}, m7125s = {"L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 */
    /* loaded from: classes5.dex */
    public static final class C107371<E> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C107371(Continuation<? super C107371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {487}, m7123m = CatchStreamerKeys.COUNT_KEY, m7124n = {CatchStreamerKeys.COUNT_KEY, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 */
    /* loaded from: classes5.dex */
    public static final class C107401<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107401(Continuation<? super C107401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0}, m7122l = {38}, m7123m = "elementAt", m7124n = {"$this$consume$iv", FirebaseAnalytics.Param.INDEX, CatchStreamerKeys.COUNT_KEY}, m7125s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 */
    /* loaded from: classes5.dex */
    public static final class C107451<E> extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107451(Continuation<? super C107451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0}, m7122l = {53}, m7123m = "elementAtOrNull", m7124n = {"$this$consume$iv", FirebaseAnalytics.Param.INDEX, CatchStreamerKeys.COUNT_KEY}, m7125s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 */
    /* loaded from: classes5.dex */
    public static final class C107461<E> extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107461(Continuation<? super C107461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {487}, m7123m = "filterNotNullTo", m7124n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 */
    /* loaded from: classes5.dex */
    public static final class C107511<E, C extends Collection<? super E>> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107511(Continuation<? super C107511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (Collection) null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {487, 242}, m7123m = "filterNotNullTo", m7124n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 */
    /* loaded from: classes5.dex */
    public static final class C107523<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107523(Continuation<? super C107523> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (SendChannel) null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {65}, m7123m = "first", m7124n = {"$this$consume$iv", "iterator"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 */
    /* loaded from: classes5.dex */
    public static final class C107531<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107531(Continuation<? super C107531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {75}, m7123m = "firstOrNull", m7124n = {"$this$consume$iv", "iterator"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 */
    /* loaded from: classes5.dex */
    public static final class C107541<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107541(Continuation<? super C107541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0}, m7122l = {487}, m7123m = "indexOf", m7124n = {"element", FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 */
    /* loaded from: classes5.dex */
    public static final class C107561<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C107561(Continuation<? super C107561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {97, 100}, m7123m = "last", m7124n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 */
    /* loaded from: classes5.dex */
    public static final class C107571<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107571(Continuation<? super C107571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0, 0}, m7122l = {487}, m7123m = "lastIndexOf", m7124n = {"element", "lastIndex", FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 */
    /* loaded from: classes5.dex */
    public static final class C107581<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C107581(Continuation<? super C107581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 1}, m7122l = {123, 126}, m7123m = "lastOrNull", m7124n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 */
    /* loaded from: classes5.dex */
    public static final class C107591<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107591(Continuation<? super C107591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0, 1, 1, 1, 1}, m7122l = {420, 422}, m7123m = "maxWith", m7124n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 */
    /* loaded from: classes5.dex */
    public static final class C107621<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C107621(Continuation<? super C107621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 0, 1, 1, 1, 1}, m7122l = {UserDataReader.USER_DATA_START_CODE, 436}, m7123m = "minWith", m7124n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 */
    /* loaded from: classes5.dex */
    public static final class C107631<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C107631(Continuation<? super C107631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0}, m7122l = {447}, m7123m = "none", m7124n = {"$this$consume$iv"}, m7125s = {"L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 */
    /* loaded from: classes5.dex */
    public static final class C107641<E> extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C107641(Continuation<? super C107641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {136, 139}, m7123m = "single", m7124n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 */
    /* loaded from: classes5.dex */
    public static final class C107661<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107661(Continuation<? super C107661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {149, Cea708Decoder.COMMAND_DF0}, m7123m = "singleOrNull", m7124n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 */
    /* loaded from: classes5.dex */
    public static final class C107671<E> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C107671(Continuation<? super C107671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {487, 278}, m7123m = "toChannel", m7124n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 */
    /* loaded from: classes5.dex */
    public static final class C107701<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107701(Continuation<? super C107701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {487}, m7123m = "toCollection", m7124n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 */
    /* loaded from: classes5.dex */
    public static final class C107711<E, C extends Collection<? super E>> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107711(Continuation<? super C107711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m7120f = "Deprecated.kt", m7121i = {0, 0}, m7122l = {487}, m7123m = "toMap", m7124n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 */
    /* loaded from: classes5.dex */
    public static final class C107722<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C107722(Continuation<? super C107722> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "cause", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n75#2:480\n1#3:481\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n*L\n26#1:480\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1 */
    /* loaded from: classes5.dex */
    public static final class C107391 extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ ReceiveChannel<?>[] $channels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107391(ReceiveChannel<?>[] receiveChannelArr) {
            super(1);
            receiveChannelArr = receiveChannelArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) throws Throwable {
            Throwable th2 = null;
            for (ReceiveChannel<?> receiveChannel : receiveChannelArr) {
                try {
                    ChannelsKt.cancelConsumed(receiveChannel, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> consumesAll(@NotNull ReceiveChannel<?>... receiveChannelArr) {
        return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumesAll.1
            public final /* synthetic */ ReceiveChannel<?>[] $channels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C107391(ReceiveChannel<?>[] receiveChannelArr2) {
                super(1);
                receiveChannelArr = receiveChannelArr2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) throws Throwable {
                Throwable th2 = null;
                for (ReceiveChannel<?> receiveChannel : receiveChannelArr) {
                    try {
                        ChannelsKt.cancelConsumed(receiveChannel, th);
                    } catch (Throwable th3) {
                        if (th2 == null) {
                            th2 = th3;
                        } else {
                            ExceptionsKt__ExceptionsKt.addSuppressed(th2, th3);
                        }
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005f -> B:73:0x0064). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAt(ReceiveChannel receiveChannel, int i, Continuation continuation) throws Throwable {
        C107451 c107451;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        int i2;
        Object objHasNext;
        if (continuation instanceof C107451) {
            c107451 = (C107451) continuation;
            int i3 = c107451.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c107451.label = i3 - Integer.MIN_VALUE;
            } else {
                c107451 = new C107451(continuation);
            }
        }
        Object obj = c107451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c107451.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                if (i < 0) {
                    throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                }
                it = receiveChannel.iterator();
                i2 = 0;
                c107451.L$0 = receiveChannel;
                c107451.L$1 = it;
                c107451.I$0 = i;
                c107451.I$1 = i2;
                c107451.label = 1;
                objHasNext = it.hasNext(c107451);
                if (objHasNext != coroutine_suspended) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = c107451.I$1;
                i = c107451.I$0;
                ChannelIterator channelIterator = (ChannelIterator) c107451.L$1;
                receiveChannel2 = (ReceiveChannel) c107451.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = channelIterator.next();
                        int i6 = i5 + 1;
                        if (i == i5) {
                            ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return next;
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        i2 = i6;
                        c107451.L$0 = receiveChannel;
                        c107451.L$1 = it;
                        c107451.I$0 = i;
                        c107451.I$1 = i2;
                        c107451.label = 1;
                        objHasNext = it.hasNext(c107451);
                        if (objHasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        i5 = i2;
                        channelIterator = it;
                        obj = objHasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ChannelsKt.cancelConsumed(receiveChannel2, th);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:76:0x0068, B:78:0x0070, B:72:0x0053, B:71:0x004e), top: B:92:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0064 -> B:76:0x0068). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAtOrNull(ReceiveChannel receiveChannel, int i, Continuation continuation) throws Throwable {
        C107461 c107461;
        ChannelIterator it;
        int i2;
        Throwable th;
        ReceiveChannel receiveChannel2;
        Object objHasNext;
        if (continuation instanceof C107461) {
            c107461 = (C107461) continuation;
            int i3 = c107461.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c107461.label = i3 - Integer.MIN_VALUE;
            } else {
                c107461 = new C107461(continuation);
            }
        }
        Object obj = c107461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c107461.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (i >= 0) {
                try {
                    it = receiveChannel.iterator();
                    i2 = 0;
                    c107461.L$0 = receiveChannel;
                    c107461.L$1 = it;
                    c107461.I$0 = i;
                    c107461.I$1 = i2;
                    c107461.label = 1;
                    objHasNext = it.hasNext(c107461);
                    if (objHasNext != coroutine_suspended) {
                    }
                } catch (Throwable th2) {
                    receiveChannel2 = receiveChannel;
                    th = th2;
                    throw th;
                }
            } else {
                ChannelsKt.cancelConsumed(receiveChannel, null);
                return null;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = c107461.I$1;
            i = c107461.I$0;
            ChannelIterator channelIterator = (ChannelIterator) c107461.L$1;
            receiveChannel2 = (ReceiveChannel) c107461.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                i2 = i5;
                receiveChannel = receiveChannel2;
                C107461 c1074612 = c107461;
                ChannelIterator channelIterator2 = channelIterator;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = channelIterator2.next();
                    int i6 = i2 + 1;
                    if (i == i2) {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return next;
                    }
                    it = channelIterator2;
                    c107461 = c1074612;
                    i2 = i6;
                    c107461.L$0 = receiveChannel;
                    c107461.L$1 = it;
                    c107461.I$0 = i;
                    c107461.I$1 = i2;
                    c107461.label = 1;
                    objHasNext = it.hasNext(c107461);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    C107461 c1074613 = c107461;
                    channelIterator2 = it;
                    obj = objHasNext;
                    c1074612 = c1074613;
                    if (!((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object first(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107531 c107531;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (continuation instanceof C107531) {
            c107531 = (C107531) continuation;
            int i = c107531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107531.label = i - Integer.MIN_VALUE;
            } else {
                c107531 = new C107531(continuation);
            }
        }
        Object obj = c107531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107531.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (ChannelIterator) c107531.L$1;
            receiveChannel2 = (ReceiveChannel) c107531.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th3;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            ChannelIterator it = receiveChannel.iterator();
            c107531.L$0 = receiveChannel;
            c107531.L$1 = it;
            c107531.label = 1;
            Object objHasNext = it.hasNext(c107531);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel2 = receiveChannel;
            channelIterator = it;
            obj = objHasNext;
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object firstOrNull(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107541 c107541;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (continuation instanceof C107541) {
            c107541 = (C107541) continuation;
            int i = c107541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107541.label = i - Integer.MIN_VALUE;
            } else {
                c107541 = new C107541(continuation);
            }
        }
        Object obj = c107541.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107541.L$0 = receiveChannel;
                c107541.L$1 = it;
                c107541.label = 1;
                Object objHasNext = it.hasNext(c107541);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (ChannelIterator) c107541.L$1;
            receiveChannel2 = (ReceiveChannel) c107541.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Object next = channelIterator.next();
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return next;
        }
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0064 -> B:72:0x0067). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object indexOf(ReceiveChannel receiveChannel, Object obj, Continuation continuation) throws Throwable {
        C107561 c107561;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref.IntRef intRef;
        Object obj2;
        Object objHasNext;
        if (continuation instanceof C107561) {
            c107561 = (C107561) continuation;
            int i = c107561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107561.label = i - Integer.MIN_VALUE;
            } else {
                c107561 = new C107561(continuation);
            }
        }
        Object obj3 = c107561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            Ref.IntRef intRef2 = new Ref.IntRef();
            try {
                receiveChannel2 = receiveChannel;
                it = receiveChannel.iterator();
                intRef = intRef2;
                obj2 = obj;
                c107561.L$0 = obj2;
                c107561.L$1 = intRef;
                c107561.L$2 = receiveChannel2;
                c107561.L$3 = it;
                c107561.label = 1;
                objHasNext = it.hasNext(c107561);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107561.L$3;
            receiveChannel2 = (ReceiveChannel) c107561.L$2;
            intRef = (Ref.IntRef) c107561.L$1;
            Object obj4 = c107561.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                if (((Boolean) obj3).booleanValue()) {
                    if (Intrinsics.areEqual(obj4, it.next())) {
                        Integer numBoxInt = Boxing.boxInt(intRef.element);
                        ChannelsKt.cancelConsumed(receiveChannel2, null);
                        return numBoxInt;
                    }
                    intRef.element++;
                    obj2 = obj4;
                    c107561.L$0 = obj2;
                    c107561.L$1 = intRef;
                    c107561.L$2 = receiveChannel2;
                    c107561.L$3 = it;
                    c107561.label = 1;
                    objHasNext = it.hasNext(c107561);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj4 = obj2;
                    obj3 = objHasNext;
                    if (((Boolean) obj3).booleanValue()) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return Boxing.boxInt(-1);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.cancelConsumed(receiveChannel2, th);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:71:0x0032, B:95:0x008b, B:97:0x0093), top: B:109:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0087 -> B:95:0x008b). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object last(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107571 c107571;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object objHasNext;
        if (continuation instanceof C107571) {
            c107571 = (C107571) continuation;
            int i = c107571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107571.label = i - Integer.MIN_VALUE;
            } else {
                c107571 = new C107571(continuation);
            }
        }
        Object obj = c107571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107571.L$0 = receiveChannel;
                c107571.L$1 = it;
                c107571.label = 1;
                Object objHasNext2 = it.hasNext(c107571);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext2;
            } catch (Throwable th) {
                receiveChannel2 = receiveChannel;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            channelIterator = (ChannelIterator) c107571.L$1;
            receiveChannel2 = (ReceiveChannel) c107571.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c107571.L$2;
            channelIterator2 = (ChannelIterator) c107571.L$1;
            ReceiveChannel receiveChannel3 = (ReceiveChannel) c107571.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator2.next();
                    receiveChannel = receiveChannel3;
                    c107571.L$0 = receiveChannel;
                    c107571.L$1 = channelIterator2;
                    c107571.L$2 = next;
                    c107571.label = 2;
                    objHasNext = channelIterator2.hasNext(c107571);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    receiveChannel3 = receiveChannel;
                    obj2 = next;
                    obj = objHasNext;
                    if (!((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return obj2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            throw new NoSuchElementException("ReceiveChannel is empty.");
        }
        next = channelIterator.next();
        ReceiveChannel receiveChannel4 = receiveChannel2;
        channelIterator2 = channelIterator;
        receiveChannel = receiveChannel4;
        c107571.L$0 = receiveChannel;
        c107571.L$1 = channelIterator2;
        c107571.L$2 = next;
        c107571.label = 2;
        objHasNext = channelIterator2.hasNext(c107571);
        if (objHasNext != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0072 -> B:71:0x0075). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastIndexOf(ReceiveChannel receiveChannel, Object obj, Continuation continuation) throws Throwable {
        C107581 c107581;
        Ref.IntRef intRef;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref.IntRef intRef2;
        Object obj2;
        Object objHasNext;
        if (continuation instanceof C107581) {
            c107581 = (C107581) continuation;
            int i = c107581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107581.label = i - Integer.MIN_VALUE;
            } else {
                c107581 = new C107581(continuation);
            }
        }
        Object obj3 = c107581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.element = -1;
            intRef = new Ref.IntRef();
            try {
                receiveChannel2 = receiveChannel;
                it = receiveChannel.iterator();
                intRef2 = intRef3;
                obj2 = obj;
                c107581.L$0 = obj2;
                c107581.L$1 = intRef2;
                c107581.L$2 = intRef;
                c107581.L$3 = receiveChannel2;
                c107581.L$4 = it;
                c107581.label = 1;
                objHasNext = it.hasNext(c107581);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107581.L$4;
            receiveChannel2 = (ReceiveChannel) c107581.L$3;
            intRef = (Ref.IntRef) c107581.L$2;
            intRef2 = (Ref.IntRef) c107581.L$1;
            Object obj4 = c107581.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                if (((Boolean) obj3).booleanValue()) {
                    if (Intrinsics.areEqual(obj4, it.next())) {
                        intRef2.element = intRef.element;
                    }
                    intRef.element++;
                    obj2 = obj4;
                    c107581.L$0 = obj2;
                    c107581.L$1 = intRef2;
                    c107581.L$2 = intRef;
                    c107581.L$3 = receiveChannel2;
                    c107581.L$4 = it;
                    c107581.label = 1;
                    objHasNext = it.hasNext(c107581);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj4 = obj2;
                    obj3 = objHasNext;
                    if (((Boolean) obj3).booleanValue()) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return Boxing.boxInt(intRef2.element);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:72:0x0033, B:98:0x008f, B:100:0x0097), top: B:114:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008b -> B:98:0x008f). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastOrNull(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107591 c107591;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object objHasNext;
        if (continuation instanceof C107591) {
            c107591 = (C107591) continuation;
            int i = c107591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107591.label = i - Integer.MIN_VALUE;
            } else {
                c107591 = new C107591(continuation);
            }
        }
        Object obj = c107591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107591.L$0 = receiveChannel;
                c107591.L$1 = it;
                c107591.label = 1;
                Object objHasNext2 = it.hasNext(c107591);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext2;
            } catch (Throwable th) {
                receiveChannel2 = receiveChannel;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            channelIterator = (ChannelIterator) c107591.L$1;
            receiveChannel2 = (ReceiveChannel) c107591.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c107591.L$2;
            channelIterator2 = (ChannelIterator) c107591.L$1;
            ReceiveChannel receiveChannel3 = (ReceiveChannel) c107591.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator2.next();
                    receiveChannel = receiveChannel3;
                    c107591.L$0 = receiveChannel;
                    c107591.L$1 = channelIterator2;
                    c107591.L$2 = next;
                    c107591.label = 2;
                    objHasNext = channelIterator2.hasNext(c107591);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    receiveChannel3 = receiveChannel;
                    obj2 = next;
                    obj = objHasNext;
                    if (!((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return obj2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (((Boolean) obj).booleanValue()) {
            next = channelIterator.next();
            ReceiveChannel receiveChannel4 = receiveChannel2;
            channelIterator2 = channelIterator;
            receiveChannel = receiveChannel4;
            c107591.L$0 = receiveChannel;
            c107591.L$1 = channelIterator2;
            c107591.L$2 = next;
            c107591.label = 2;
            objHasNext = channelIterator2.hasNext(c107591);
            if (objHasNext != coroutine_suspended) {
            }
        } else {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object single(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107661 c107661;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj;
        if (continuation instanceof C107661) {
            c107661 = (C107661) continuation;
            int i = c107661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107661.label = i - Integer.MIN_VALUE;
            } else {
                c107661 = new C107661(continuation);
            }
        }
        Object obj2 = c107661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107661.L$0 = receiveChannel;
                c107661.L$1 = it;
                c107661.label = 1;
                Object objHasNext = it.hasNext(c107661);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objHasNext;
                if (((Boolean) obj2).booleanValue()) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else if (i2 == 1) {
            channelIterator = (ChannelIterator) c107661.L$1;
            receiveChannel2 = (ReceiveChannel) c107661.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                c107661.L$0 = receiveChannel2;
                c107661.L$1 = next;
                c107661.label = 2;
                Object objHasNext2 = channelIterator.hasNext(c107661);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj2 = objHasNext2;
                obj = next;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c107661.L$1;
            receiveChannel3 = (ReceiveChannel) c107661.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
            } catch (Throwable th4) {
                th = th4;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th5) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th5;
                }
            }
        }
        if (((Boolean) obj2).booleanValue()) {
            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
        }
        ChannelsKt.cancelConsumed(receiveChannel3, null);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object singleOrNull(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107671 c107671;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj;
        if (continuation instanceof C107671) {
            c107671 = (C107671) continuation;
            int i = c107671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107671.label = i - Integer.MIN_VALUE;
            } else {
                c107671 = new C107671(continuation);
            }
        }
        Object obj2 = c107671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107671.L$0 = receiveChannel;
                c107671.L$1 = it;
                c107671.label = 1;
                Object objHasNext = it.hasNext(c107671);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objHasNext;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c107671.L$1;
                receiveChannel3 = (ReceiveChannel) c107671.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    if (((Boolean) obj2).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return obj;
                    }
                    ChannelsKt.cancelConsumed(receiveChannel3, null);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    receiveChannel2 = receiveChannel3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        ChannelsKt.cancelConsumed(receiveChannel2, th);
                        throw th4;
                    }
                }
            }
            channelIterator = (ChannelIterator) c107671.L$1;
            receiveChannel2 = (ReceiveChannel) c107671.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
        if (((Boolean) obj2).booleanValue()) {
            Object next = channelIterator.next();
            c107671.L$0 = receiveChannel2;
            c107671.L$1 = next;
            c107671.label = 2;
            Object objHasNext2 = channelIterator.hasNext(c107671);
            if (objHasNext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel3 = receiveChannel2;
            obj2 = objHasNext2;
            obj = next;
            if (((Boolean) obj2).booleanValue()) {
            }
        } else {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 2}, m7122l = {164, MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT, 170}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, m7125s = {"L$0", "I$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 */
    public static final class C107431 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

        /* renamed from: $n */
        public final /* synthetic */ int f9801$n;
        public final /* synthetic */ ReceiveChannel<Object> $this_drop;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107431(int i, ReceiveChannel<Object> receiveChannel, Continuation<? super C107431> continuation) {
            super(2, continuation);
            this.f9801$n = i;
            this.$this_drop = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107431 c107431 = new C107431(this.f9801$n, this.$this_drop, continuation);
            c107431.L$0 = obj;
            return c107431;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107431) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
        
            if (r1 == 0) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0065 -> B:65:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00a4 -> B:50:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            int i;
            ChannelIterator<Object> it;
            ProducerScope producerScope2;
            ChannelIterator<Object> it2;
            ProducerScope producerScope3;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                i = this.f9801$n;
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
                }
                if (i > 0) {
                    it = this.$this_drop.iterator();
                    producerScope2 = producerScope;
                    this.L$0 = producerScope2;
                    this.L$1 = it;
                    this.I$0 = i;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                    producerScope = producerScope2;
                }
                it2 = this.$this_drop.iterator();
                this.L$0 = producerScope;
                this.L$1 = it2;
                this.label = 2;
                objHasNext = it2.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                }
            } else if (i2 == 1) {
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    it.next();
                    i--;
                }
                producerScope = producerScope2;
                it2 = this.$this_drop.iterator();
                this.L$0 = producerScope;
                this.L$1 = it2;
                this.label = 2;
                objHasNext = it2.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                }
            } else if (i2 == 2) {
                it2 = (ChannelIterator) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (ChannelIterator) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope3;
                this.L$0 = producerScope;
                this.L$1 = it2;
                this.label = 2;
                objHasNext = it2.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope3 = producerScope;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it2.next();
                    this.L$0 = producerScope3;
                    this.L$1 = it2;
                    this.label = 3;
                    if (producerScope3.send(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope = producerScope3;
                    this.L$0 = producerScope;
                    this.L$1 = it2;
                    this.label = 2;
                    objHasNext = it2.hasNext(this);
                    if (objHasNext != coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107431(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m7120f = "Deprecated.kt", m7121i = {0, 1, 1, 2, 3, 4}, m7122l = {181, H263Reader.START_CODE_VALUE_VOP, MatroskaExtractor.ID_CUE_TRACK_POSITIONS, MatroskaExtractor.ID_CUE_POINT, TsExtractor.TS_PACKET_SIZE}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, m7125s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 */
    public static final class C107441 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<Object, Continuation<? super Boolean>, Object> $predicate;
        public final /* synthetic */ ReceiveChannel<Object> $this_dropWhile;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107441(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C107441> continuation) {
            super(2, continuation);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107441 c107441 = new C107441(this.$this_dropWhile, this.$predicate, continuation);
            c107441.L$0 = obj;
            return c107441;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107441) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x009f -> B:64:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00ec -> B:58:0x0023). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<Object> it;
            ProducerScope producerScope;
            ProducerScope producerScope2;
            ChannelIterator<Object> it2;
            ProducerScope producerScope3;
            ChannelIterator<Object> channelIterator;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope4 = (ProducerScope) this.L$0;
                it = this.$this_dropWhile.iterator();
                producerScope = producerScope4;
                this.L$0 = producerScope;
                this.L$1 = it;
                this.L$2 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                ProducerScope producerScope5 = producerScope;
                ChannelIterator<Object> channelIterator2 = it;
                producerScope2 = producerScope5;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                objHasNext = it2.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } else if (i == 1) {
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope52 = producerScope;
                ChannelIterator<Object> channelIterator22 = it;
                producerScope2 = producerScope52;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                objHasNext = it2.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } else if (i == 2) {
                Object obj2 = this.L$2;
                ChannelIterator<Object> channelIterator3 = (ChannelIterator) this.L$1;
                ProducerScope producerScope6 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ChannelIterator<Object> channelIterator4 = channelIterator3;
                Object obj3 = obj2;
                it = channelIterator4;
                if (((Boolean) obj).booleanValue()) {
                    this.L$0 = producerScope6;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (producerScope6.send(obj3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope2 = producerScope6;
                    it2 = this.$this_dropWhile.iterator();
                    this.L$0 = producerScope2;
                    this.L$1 = it2;
                    this.label = 4;
                    objHasNext = it2.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    producerScope = producerScope6;
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ProducerScope producerScope522 = producerScope;
                    ChannelIterator<Object> channelIterator222 = it;
                    producerScope2 = producerScope522;
                    if (((Boolean) obj).booleanValue()) {
                        Object next = channelIterator222.next();
                        Function2<Object, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                        this.L$0 = producerScope2;
                        this.L$1 = channelIterator222;
                        this.L$2 = next;
                        this.label = 2;
                        Object objInvoke = function2.invoke(next, this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelIterator4 = channelIterator222;
                        obj3 = next;
                        obj = objInvoke;
                        producerScope6 = producerScope2;
                        it = channelIterator4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    it2 = this.$this_dropWhile.iterator();
                    this.L$0 = producerScope2;
                    this.L$1 = it2;
                    this.label = 4;
                    objHasNext = it2.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                }
            } else if (i == 3) {
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                objHasNext = it2.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } else if (i == 4) {
                channelIterator = (ChannelIterator) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                it2 = channelIterator;
                producerScope2 = producerScope3;
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                objHasNext = it2.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ProducerScope producerScope7 = producerScope2;
                channelIterator = it2;
                obj = objHasNext;
                producerScope3 = producerScope7;
                if (!((Boolean) obj).booleanValue()) {
                    Object next2 = channelIterator.next();
                    this.L$0 = producerScope3;
                    this.L$1 = channelIterator;
                    this.label = 5;
                    if (producerScope3.send(next2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it2 = channelIterator;
                    producerScope2 = producerScope3;
                    this.L$0 = producerScope2;
                    this.L$1 = it2;
                    this.label = 4;
                    objHasNext = it2.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107441(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m7120f = "Deprecated.kt", m7121i = {0, 1, 1, 2}, m7122l = {198, 199, 199}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m7125s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 */
    public static final class C107471<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        public final /* synthetic */ ReceiveChannel<E> $this_filter;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107471(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C107471> continuation) {
            super(2, continuation);
            this.$this_filter = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107471 c107471 = new C107471(this.$this_filter, this.$predicate, continuation);
            c107471.L$0 = obj;
            return c107471;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super E> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107471) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<E> it;
            ProducerScope producerScope;
            ProducerScope producerScope2;
            E e;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                it = this.$this_filter.iterator();
                producerScope = producerScope3;
            } else if (i == 1) {
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    E next = it.next();
                    Function2<E, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.L$2 = next;
                    this.label = 2;
                    Object objInvoke = function2.invoke(next, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ProducerScope producerScope4 = producerScope;
                    e = next;
                    obj = objInvoke;
                    producerScope2 = producerScope4;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i == 2) {
                Object obj2 = this.L$2;
                ChannelIterator<E> channelIterator = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                e = obj2;
                it = channelIterator;
                if (!((Boolean) obj).booleanValue()) {
                    this.L$0 = producerScope2;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.label = 3;
                    if (producerScope2.send(e, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope = producerScope2;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.L$2 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final <E> ReceiveChannel<E> filter(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107471(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, coroutineContext, function3);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 1, 2, 2}, m7122l = {211, 212, 212}, m7123m = "invokeSuspend", m7124n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", "e", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, m7125s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 */
    /* loaded from: classes5.dex */
    public static final class C107481 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function3<Integer, Object, Continuation<? super Boolean>, Object> $predicate;
        public final /* synthetic */ ReceiveChannel<Object> $this_filterIndexed;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107481(ReceiveChannel<Object> receiveChannel, Function3<? super Integer, Object, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super C107481> continuation) {
            super(2, continuation);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107481 c107481 = new C107481(this.$this_filterIndexed, this.$predicate, continuation);
            c107481.L$0 = obj;
            return c107481;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107481) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            ChannelIterator<Object> it;
            int i;
            ProducerScope producerScope2;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                it = this.$this_filterIndexed.iterator();
                i = 0;
            } else if (i2 == 1) {
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Function3<Integer, Object, Continuation<? super Boolean>, Object> function3 = this.$predicate;
                    int i3 = i + 1;
                    Integer numBoxInt = Boxing.boxInt(i);
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.L$2 = next;
                    this.I$0 = i3;
                    this.label = 2;
                    Object objInvoke = function3.invoke(numBoxInt, next, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope2 = producerScope;
                    obj2 = next;
                    obj = objInvoke;
                    i = i3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i2 == 2) {
                i = this.I$0;
                Object obj3 = this.L$2;
                ChannelIterator<Object> channelIterator = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj3;
                it = channelIterator;
                if (!((Boolean) obj).booleanValue()) {
                    this.L$0 = producerScope2;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 3;
                    if (producerScope2.send(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope = producerScope2;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107481(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m7120f = "Deprecated.kt", m7121i = {}, m7122l = {222}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 */
    /* loaded from: classes5.dex */
    public static final class C107491 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ Function2<Object, Continuation<? super Boolean>, Object> $predicate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107491(Function2<Object, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C107491> continuation) {
            super(2, continuation);
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107491 c107491 = new C107491(this.$predicate, continuation);
            c107491.L$0 = obj;
            return c107491;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(Object obj, @Nullable Continuation<? super Boolean> continuation) {
            return ((C107491) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                Function2<Object, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                this.label = 1;
                obj = function2.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(!((Boolean) obj).booleanValue());
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filter(receiveChannel, coroutineContext, new C107491(function2, null));
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m7120f = "Deprecated.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 */
    /* loaded from: classes5.dex */
    public static final class C107501<E> extends SuspendLambda implements Function2<E, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C107501(Continuation<? super C107501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107501 c107501 = new C107501(continuation);
            c107501.L$0 = obj;
            return c107501;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C107501<E>) obj, continuation);
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@Nullable E e, @Nullable Continuation<? super Boolean> continuation) {
            return ((C107501) create(e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.L$0 != null);
        }
    }

    @PublishedApi
    @NotNull
    public static final <E> ReceiveChannel<E> filterNotNull(@NotNull ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new C107501(null), 1, null);
        Intrinsics.checkNotNull(receiveChannelFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0059 -> B:71:0x005c). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) throws Throwable {
        C107511 c107511;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Collection collection2;
        Object objHasNext;
        if (continuation instanceof C107511) {
            c107511 = (C107511) continuation;
            int i = c107511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107511.label = i - Integer.MIN_VALUE;
            } else {
                c107511 = new C107511(continuation);
            }
        }
        Object obj = c107511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                receiveChannel2 = receiveChannel;
                it = receiveChannel.iterator();
                collection2 = collection;
                c107511.L$0 = collection2;
                c107511.L$1 = receiveChannel2;
                c107511.L$2 = it;
                c107511.label = 1;
                objHasNext = it.hasNext(c107511);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107511.L$2;
            receiveChannel2 = (ReceiveChannel) c107511.L$1;
            Collection collection3 = (Collection) c107511.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return collection3;
                }
                Object next = it.next();
                if (next != null) {
                    collection3.add(next);
                }
                collection2 = collection3;
                c107511.L$0 = collection2;
                c107511.L$1 = receiveChannel2;
                c107511.L$2 = it;
                c107511.label = 1;
                objHasNext = it.hasNext(c107511);
                if (objHasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection3 = collection2;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x007a -> B:86:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0088 -> B:86:0x008b). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) throws Throwable {
        C107523 c107523;
        ChannelIterator it;
        ChannelIterator channelIterator;
        SendChannel sendChannel2;
        SendChannel sendChannel3;
        Object objHasNext;
        if (continuation instanceof C107523) {
            c107523 = (C107523) continuation;
            int i = c107523.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107523.label = i - Integer.MIN_VALUE;
            } else {
                c107523 = new C107523(continuation);
            }
        }
        Object obj = c107523.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107523.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    it = receiveChannel.iterator();
                    sendChannel3 = sendChannel;
                    c107523.L$0 = sendChannel3;
                    c107523.L$1 = receiveChannel;
                    c107523.L$2 = it;
                    c107523.label = 1;
                    objHasNext = it.hasNext(c107523);
                    if (objHasNext == coroutine_suspended) {
                    }
                } catch (Throwable th) {
                    sendChannel = receiveChannel;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ChannelsKt.cancelConsumed(sendChannel, th);
                        throw th2;
                    }
                }
            } else if (i2 == 1) {
                channelIterator = (ChannelIterator) c107523.L$2;
                ReceiveChannel receiveChannel2 = (ReceiveChannel) c107523.L$1;
                sendChannel2 = (SendChannel) c107523.L$0;
                ResultKt.throwOnFailure(obj);
                sendChannel = receiveChannel2;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) c107523.L$2;
                ReceiveChannel receiveChannel3 = (ReceiveChannel) c107523.L$1;
                sendChannel2 = (SendChannel) c107523.L$0;
                ResultKt.throwOnFailure(obj);
                ReceiveChannel receiveChannel4 = receiveChannel3;
                it = channelIterator;
                receiveChannel = receiveChannel4;
                sendChannel3 = sendChannel2;
                c107523.L$0 = sendChannel3;
                c107523.L$1 = receiveChannel;
                c107523.L$2 = it;
                c107523.label = 1;
                objHasNext = it.hasNext(c107523);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SendChannel sendChannel4 = sendChannel3;
                sendChannel = receiveChannel;
                channelIterator = it;
                obj = objHasNext;
                sendChannel2 = sendChannel4;
                if (((Boolean) obj).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(sendChannel, null);
                    return sendChannel2;
                }
                Object next = channelIterator.next();
                receiveChannel4 = sendChannel;
                if (next != null) {
                    c107523.L$0 = sendChannel2;
                    c107523.L$1 = sendChannel;
                    c107523.L$2 = channelIterator;
                    c107523.label = 2;
                    receiveChannel4 = sendChannel;
                    if (sendChannel2.send(next, c107523) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                it = channelIterator;
                receiveChannel = receiveChannel4;
                sendChannel3 = sendChannel2;
                c107523.L$0 = sendChannel3;
                c107523.L$1 = receiveChannel;
                c107523.L$2 = it;
                c107523.label = 1;
                objHasNext = it.hasNext(c107523);
                if (objHasNext == coroutine_suspended) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {254, 255}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "remaining", "$this$produce", "remaining"}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 */
    /* loaded from: classes5.dex */
    public static final class C107681 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

        /* renamed from: $n */
        public final /* synthetic */ int f9802$n;
        public final /* synthetic */ ReceiveChannel<Object> $this_take;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107681(int i, ReceiveChannel<Object> receiveChannel, Continuation<? super C107681> continuation) {
            super(2, continuation);
            this.f9802$n = i;
            this.$this_take = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107681 c107681 = new C107681(this.f9802$n, this.$this_take, continuation);
            c107681.L$0 = obj;
            return c107681;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107681) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0078 -> B:44:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            int i;
            ChannelIterator<Object> it;
            ProducerScope producerScope2;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                i = this.f9802$n;
                if (i == 0) {
                    return Unit.INSTANCE;
                }
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
                }
                it = this.$this_take.iterator();
                this.L$0 = producerScope;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                }
            } else if (i2 == 1) {
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope2;
                i--;
                if (i == 0) {
                    return Unit.INSTANCE;
                }
                this.L$0 = producerScope;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope2 = producerScope;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    this.L$0 = producerScope2;
                    this.L$1 = it;
                    this.I$0 = i;
                    this.label = 2;
                    if (producerScope2.send(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope = producerScope2;
                    i--;
                    if (i == 0) {
                    }
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.I$0 = i;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107681(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m7120f = "Deprecated.kt", m7121i = {0, 1, 1, 2}, m7122l = {269, BottomAppBarTopEdgeTreatment.ANGLE_UP, 271}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m7125s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 */
    /* loaded from: classes5.dex */
    public static final class C107691 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<Object, Continuation<? super Boolean>, Object> $predicate;
        public final /* synthetic */ ReceiveChannel<Object> $this_takeWhile;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107691(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C107691> continuation) {
            super(2, continuation);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107691 c107691 = new C107691(this.$this_takeWhile, this.$predicate, continuation);
            c107691.L$0 = obj;
            return c107691;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107691) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0097 -> B:45:0x004d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<Object> it;
            ProducerScope producerScope;
            ProducerScope producerScope2;
            ChannelIterator<Object> channelIterator;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                it = this.$this_takeWhile.iterator();
                producerScope = producerScope3;
            } else if (i == 1) {
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Function2<Object, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.L$2 = next;
                    this.label = 2;
                    Object objInvoke = function2.invoke(next, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ChannelIterator<Object> channelIterator2 = it;
                    obj2 = next;
                    obj = objInvoke;
                    producerScope2 = producerScope;
                    channelIterator = channelIterator2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i == 2) {
                obj2 = this.L$2;
                channelIterator = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.L$0 = producerScope2;
                this.L$1 = channelIterator;
                this.L$2 = null;
                this.label = 3;
                if (producerScope2.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = channelIterator;
                producerScope = producerScope2;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107691(receiveChannel, function2, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0088 -> B:62:0x0037). Please report as a decompilation issue!!! */
    @PublishedApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends SendChannel<? super E>> Object toChannel(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) throws Throwable {
        C107701 c107701;
        ChannelIterator<? extends E> it;
        ChannelIterator<? extends E> channelIterator;
        SendChannel sendChannel;
        SendChannel sendChannel2;
        Object objHasNext;
        if (continuation instanceof C107701) {
            c107701 = (C107701) continuation;
            int i = c107701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107701.label = i - Integer.MIN_VALUE;
            } else {
                c107701 = new C107701(continuation);
            }
        }
        Object obj = c107701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107701.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    it = receiveChannel.iterator();
                    sendChannel2 = c;
                    c107701.L$0 = sendChannel2;
                    c107701.L$1 = receiveChannel;
                    c107701.L$2 = it;
                    c107701.label = 1;
                    objHasNext = it.hasNext(c107701);
                    if (objHasNext == coroutine_suspended) {
                    }
                } catch (Throwable th) {
                    c = receiveChannel;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ChannelsKt.cancelConsumed(c, th);
                        throw th2;
                    }
                }
            } else if (i2 == 1) {
                channelIterator = (ChannelIterator) c107701.L$2;
                boolean z = (C) ((ReceiveChannel) c107701.L$1);
                sendChannel = (SendChannel) c107701.L$0;
                ResultKt.throwOnFailure(obj);
                c = z;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (ChannelIterator) c107701.L$2;
                ReceiveChannel<? extends E> receiveChannel2 = (C) ((ReceiveChannel) c107701.L$1);
                sendChannel = (SendChannel) c107701.L$0;
                ResultKt.throwOnFailure(obj);
                ReceiveChannel<? extends E> receiveChannel3 = receiveChannel2;
                it = channelIterator;
                receiveChannel = receiveChannel3;
                sendChannel2 = (C) sendChannel;
                c107701.L$0 = sendChannel2;
                c107701.L$1 = receiveChannel;
                c107701.L$2 = it;
                c107701.label = 1;
                objHasNext = it.hasNext(c107701);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SendChannel sendChannel3 = sendChannel2;
                boolean z2 = (C) receiveChannel;
                channelIterator = it;
                obj = objHasNext;
                sendChannel = sendChannel3;
                c = z2;
                if (!((Boolean) obj).booleanValue()) {
                    E next = channelIterator.next();
                    c107701.L$0 = sendChannel;
                    c107701.L$1 = (Object) c;
                    c107701.L$2 = channelIterator;
                    c107701.label = 2;
                    receiveChannel3 = c;
                    if (sendChannel.send(next, c107701) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = channelIterator;
                    receiveChannel = receiveChannel3;
                    sendChannel2 = (C) sendChannel;
                    c107701.L$0 = sendChannel2;
                    c107701.L$1 = receiveChannel;
                    c107701.L$2 = it;
                    c107701.label = 1;
                    objHasNext = it.hasNext(c107701);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed((ReceiveChannel) c, null);
                    return sendChannel;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please report as a decompilation issue!!! */
    @PublishedApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object toCollection(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) throws Throwable {
        C107711 c107711;
        ReceiveChannel<? extends E> receiveChannel2;
        Throwable th;
        ChannelIterator it;
        C c2;
        Object objHasNext;
        if (continuation instanceof C107711) {
            c107711 = (C107711) continuation;
            int i = c107711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107711.label = i - Integer.MIN_VALUE;
            } else {
                c107711 = new C107711(continuation);
            }
        }
        Object obj = c107711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                receiveChannel2 = receiveChannel;
                it = receiveChannel.iterator();
                c2 = c;
                c107711.L$0 = c2;
                c107711.L$1 = receiveChannel2;
                c107711.L$2 = it;
                c107711.label = 1;
                objHasNext = it.hasNext(c107711);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107711.L$2;
            receiveChannel2 = (ReceiveChannel) c107711.L$1;
            Collection collection = (Collection) c107711.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                ?? r2 = collection;
                if (!((Boolean) obj).booleanValue()) {
                    r2.add(it.next());
                    c2 = r2;
                    c107711.L$0 = c2;
                    c107711.L$1 = receiveChannel2;
                    c107711.L$2 = it;
                    c107711.label = 1;
                    objHasNext = it.hasNext(c107711);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r2 = c2;
                    obj = objHasNext;
                    if (!((Boolean) obj).booleanValue()) {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel2, null);
                        return r2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please report as a decompilation issue!!! */
    @PublishedApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(@NotNull ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, @NotNull M m, @NotNull Continuation<? super M> continuation) throws Throwable {
        C107722 c107722;
        ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel2;
        Throwable th;
        ChannelIterator it;
        M m2;
        Object objHasNext;
        if (continuation instanceof C107722) {
            c107722 = (C107722) continuation;
            int i = c107722.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107722.label = i - Integer.MIN_VALUE;
            } else {
                c107722 = new C107722(continuation);
            }
        }
        Object obj = c107722.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                receiveChannel2 = receiveChannel;
                it = receiveChannel.iterator();
                m2 = m;
                c107722.L$0 = m2;
                c107722.L$1 = receiveChannel2;
                c107722.L$2 = it;
                c107722.label = 1;
                objHasNext = it.hasNext(c107722);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107722.L$2;
            receiveChannel2 = (ReceiveChannel) c107722.L$1;
            Map map = (Map) c107722.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                ?? r2 = map;
                if (!((Boolean) obj).booleanValue()) {
                    Pair pair = (Pair) it.next();
                    r2.put(pair.getFirst(), pair.getSecond());
                    m2 = r2;
                    c107722.L$0 = m2;
                    c107722.L$1 = receiveChannel2;
                    c107722.L$2 = it;
                    c107722.label = 1;
                    objHasNext = it.hasNext(c107722);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r2 = m2;
                    obj = objHasNext;
                    if (!((Boolean) obj).booleanValue()) {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel2, null);
                        return r2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m7120f = "Deprecated.kt", m7121i = {0, 1, 2}, m7122l = {321, 322, 322}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "$this$produce", "$this$produce"}, m7125s = {"L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 */
    /* loaded from: classes5.dex */
    public static final class C107551 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ReceiveChannel<Object> $this_flatMap;
        public final /* synthetic */ Function2<Object, Continuation<? super ReceiveChannel<Object>>, Object> $transform;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107551(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<? super ReceiveChannel<Object>>, ? extends Object> function2, Continuation<? super C107551> continuation) {
            super(2, continuation);
            this.$this_flatMap = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107551 c107551 = new C107551(this.$this_flatMap, this.$transform, continuation);
            c107551.L$0 = obj;
            return c107551;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<Object> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107551) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x007f -> B:39:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<Object> it;
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                it = this.$this_flatMap.iterator();
                producerScope = producerScope2;
            } else if (i == 1) {
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Function2<Object, Continuation<? super ReceiveChannel<Object>>, Object> function2 = this.$transform;
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.label = 2;
                    obj = function2.invoke(next, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = producerScope;
                    this.L$1 = it;
                    this.label = 3;
                    if (ChannelsKt.toChannel((ReceiveChannel) obj, producerScope, this) == coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i == 2) {
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope;
                this.L$1 = it;
                this.label = 3;
                if (ChannelsKt.toChannel((ReceiveChannel) obj, producerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107551(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {487, 333, 333}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, m7125s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n332#1:480\n332#1:481,6\n332#1:487,2\n332#1:489\n332#1:490,3\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 */
    /* loaded from: classes5.dex */
    public static final class C107601<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ReceiveChannel<E> $this_map;
        public final /* synthetic */ Function2<E, Continuation<? super R>, Object> $transform;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107601(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C107601> continuation) {
            super(2, continuation);
            this.$this_map = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107601 c107601 = new C107601(this.$this_map, this.$transform, continuation);
            c107601.L$0 = obj;
            return c107601;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super R> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107601) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00c0 -> B:75:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ReceiveChannel receiveChannel;
            ProducerScope producerScope;
            Function2 function2;
            ChannelIterator it;
            ReceiveChannel receiveChannel2;
            ProducerScope producerScope2;
            Function2 function22;
            ChannelIterator channelIterator;
            ProducerScope producerScope3;
            ProducerScope producerScope4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    producerScope = (ProducerScope) this.L$0;
                    receiveChannel = this.$this_map;
                    function2 = this.$transform;
                    it = receiveChannel.iterator();
                } else if (i == 1) {
                    it = (ChannelIterator) this.L$3;
                    receiveChannel = (ReceiveChannel) this.L$2;
                    function2 = (Function2) this.L$1;
                    producerScope4 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        this.L$0 = producerScope4;
                        this.L$1 = function2;
                        this.L$2 = receiveChannel;
                        this.L$3 = it;
                        this.L$4 = producerScope4;
                        this.label = 2;
                        obj = function2.invoke(next, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        producerScope2 = producerScope4;
                        function22 = function2;
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        producerScope3 = producerScope2;
                        this.L$0 = producerScope2;
                        this.L$1 = function22;
                        this.L$2 = receiveChannel2;
                        this.L$3 = channelIterator;
                        this.L$4 = null;
                        this.label = 3;
                        if (producerScope3.send(obj, this) != coroutine_suspended) {
                        }
                    } else {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return unit;
                    }
                } else if (i == 2) {
                    producerScope3 = (ProducerScope) this.L$4;
                    channelIterator = (ChannelIterator) this.L$3;
                    receiveChannel2 = (ReceiveChannel) this.L$2;
                    function22 = (Function2) this.L$1;
                    producerScope2 = (ProducerScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        this.L$0 = producerScope2;
                        this.L$1 = function22;
                        this.L$2 = receiveChannel2;
                        this.L$3 = channelIterator;
                        this.L$4 = null;
                        this.label = 3;
                        if (producerScope3.send(obj, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        function2 = function22;
                        producerScope = producerScope2;
                    } catch (Throwable th) {
                        th = th;
                        receiveChannel = receiveChannel2;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th2;
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) this.L$3;
                    receiveChannel = (ReceiveChannel) this.L$2;
                    function2 = (Function2) this.L$1;
                    ProducerScope producerScope5 = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    producerScope = producerScope5;
                }
                this.L$0 = producerScope;
                this.L$1 = function2;
                this.L$2 = receiveChannel;
                this.L$3 = it;
                this.label = 1;
                Object objHasNext = it.hasNext(this);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope4 = producerScope;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final <E, R> ReceiveChannel<R> map(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107601(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {344, TarConstants.XSTAR_PREFIX_OFFSET, TarConstants.XSTAR_PREFIX_OFFSET}, m7123m = "invokeSuspend", m7124n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, m7125s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 */
    /* loaded from: classes5.dex */
    public static final class C107611<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        public final /* synthetic */ Function3<Integer, E, Continuation<? super R>, Object> $transform;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107611(ReceiveChannel<? extends E> receiveChannel, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super C107611> continuation) {
            super(2, continuation);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107611 c107611 = new C107611(this.$this_mapIndexed, this.$transform, continuation);
            c107611.L$0 = obj;
            return c107611;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super R> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107611) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a6 -> B:42:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            ChannelIterator it;
            int i;
            ProducerScope producerScope2;
            ChannelIterator channelIterator;
            ProducerScope producerScope3;
            ProducerScope producerScope4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                it = this.$this_mapIndexed.iterator();
                i = 0;
            } else if (i2 == 1) {
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                producerScope4 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Function3<Integer, E, Continuation<? super R>, Object> function3 = this.$transform;
                    int i3 = i + 1;
                    Integer numBoxInt = Boxing.boxInt(i);
                    this.L$0 = producerScope4;
                    this.L$1 = it;
                    this.L$2 = producerScope4;
                    this.I$0 = i3;
                    this.label = 2;
                    obj = function3.invoke(numBoxInt, next, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    producerScope2 = producerScope4;
                    i = i3;
                    channelIterator = it;
                    producerScope3 = producerScope2;
                    this.L$0 = producerScope2;
                    this.L$1 = channelIterator;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 3;
                    if (producerScope3.send(obj, this) != coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else if (i2 == 2) {
                i = this.I$0;
                producerScope3 = (ProducerScope) this.L$2;
                channelIterator = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope2;
                this.L$1 = channelIterator;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 3;
                if (producerScope3.send(obj, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = channelIterator;
                producerScope = producerScope2;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                it = (ChannelIterator) this.L$1;
                ProducerScope producerScope5 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope5;
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.I$0 = i;
            this.label = 1;
            Object objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            producerScope4 = producerScope;
            obj = objHasNext;
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final <E, R> ReceiveChannel<R> mapIndexed(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull CoroutineContext coroutineContext, @NotNull Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107611(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, coroutineContext, function2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1}, m7122l = {370, 371}, m7123m = "invokeSuspend", m7124n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 */
    /* loaded from: classes5.dex */
    public static final class C107731 extends SuspendLambda implements Function2<ProducerScope<? super IndexedValue<Object>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ReceiveChannel<Object> $this_withIndex;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107731(ReceiveChannel<Object> receiveChannel, Continuation<? super C107731> continuation) {
            super(2, continuation);
            this.$this_withIndex = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107731 c107731 = new C107731(this.$this_withIndex, continuation);
            c107731.L$0 = obj;
            return c107731;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super IndexedValue<Object>> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107731) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x007b -> B:34:0x0044). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            ChannelIterator<Object> it;
            int i;
            ProducerScope producerScope2;
            ChannelIterator<Object> channelIterator;
            int i2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.L$0;
                it = this.$this_withIndex.iterator();
                i = 0;
            } else if (i3 == 1) {
                i2 = this.I$0;
                channelIterator = (ChannelIterator) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    int i4 = i2 + 1;
                    IndexedValue indexedValue = new IndexedValue(i2, channelIterator.next());
                    this.L$0 = producerScope2;
                    this.L$1 = channelIterator;
                    this.I$0 = i4;
                    this.label = 2;
                    if (producerScope2.send(indexedValue, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = channelIterator;
                    producerScope = producerScope2;
                    i = i4;
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.I$0;
                ChannelIterator<Object> channelIterator2 = (ChannelIterator) this.L$1;
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                producerScope = producerScope3;
                i = i5;
                it = channelIterator2;
            }
            this.L$0 = producerScope;
            this.L$1 = it;
            this.I$0 = i;
            this.label = 1;
            Object objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            producerScope2 = producerScope;
            obj = objHasNext;
            int i6 = i;
            channelIterator = it;
            i2 = i6;
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107731(receiveChannel, null), 6, null);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ExifInterface.LONGITUDE_EAST, "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", m7120f = "Deprecated.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 */
    public static final class C107411 extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C107411(Continuation<? super C107411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107411 c107411 = new C107411(continuation);
            c107411.L$0 = obj;
            return c107411;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(Object obj, @Nullable Continuation<Object> continuation) {
            return ((C107411) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.L$0;
        }
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m7120f = "Deprecated.kt", m7121i = {0, 0, 1, 1, 1, 2, 2, 2}, m7122l = {387, 388, 390}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 */
    public static final class C107421<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<E, Continuation<? super K>, Object> $selector;
        public final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107421(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2, Continuation<? super C107421> continuation) {
            super(2, continuation);
            this.$this_distinctBy = receiveChannel;
            this.$selector = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107421 c107421 = new C107421(this.$this_distinctBy, this.$selector, continuation);
            c107421.L$0 = obj;
            return c107421;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super E> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107421) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a1 -> B:61:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00b4 -> B:60:0x00b6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ProducerScope producerScope;
            HashSet hashSet;
            ChannelIterator<E> it;
            ProducerScope producerScope2;
            HashSet hashSet2;
            E e;
            boolean zContains;
            HashSet hashSet3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                HashSet hashSet4 = new HashSet();
                producerScope = producerScope3;
                hashSet = hashSet4;
                it = this.$this_distinctBy.iterator();
                this.L$0 = producerScope;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else if (i == 1) {
                it = (ChannelIterator) this.L$2;
                hashSet = (HashSet) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                ?? r1 = this.L$3;
                ChannelIterator<E> channelIterator = (ChannelIterator) this.L$2;
                HashSet hashSet5 = (HashSet) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                e = r1;
                it = channelIterator;
                hashSet2 = hashSet5;
                zContains = hashSet2.contains(obj);
                hashSet3 = hashSet2;
                if (!zContains) {
                }
                hashSet = hashSet3;
                producerScope = producerScope2;
                this.L$0 = producerScope;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$3;
                ChannelIterator<E> channelIterator2 = (ChannelIterator) this.L$2;
                HashSet hashSet6 = (HashSet) this.L$1;
                producerScope2 = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ?? r6 = hashSet6;
                r6.add(obj2);
                it = channelIterator2;
                hashSet3 = r6;
                hashSet = hashSet3;
                producerScope = producerScope2;
                this.L$0 = producerScope;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    E next = it.next();
                    Function2 function2 = this.$selector;
                    this.L$0 = producerScope;
                    this.L$1 = hashSet;
                    this.L$2 = it;
                    this.L$3 = next;
                    this.label = 2;
                    Object objInvoke = function2.invoke(next, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HashSet hashSet7 = hashSet;
                    e = next;
                    obj = objInvoke;
                    producerScope2 = producerScope;
                    hashSet2 = hashSet7;
                    zContains = hashSet2.contains(obj);
                    hashSet3 = hashSet2;
                    if (!zContains) {
                        this.L$0 = producerScope2;
                        this.L$1 = hashSet2;
                        this.L$2 = it;
                        this.L$3 = obj;
                        this.label = 3;
                        if (producerScope2.send(e, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelIterator2 = it;
                        obj2 = obj;
                        r6 = hashSet2;
                        r6.add(obj2);
                        it = channelIterator2;
                        hashSet3 = r6;
                    }
                    hashSet = hashSet3;
                    producerScope = producerScope2;
                    this.L$0 = producerScope;
                    this.L$1 = hashSet;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final <E, K> ReceiveChannel<E> distinctBy(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C107421(receiveChannel, function2, null), 6, null);
    }

    @PublishedApi
    @Nullable
    public static final <E> Object toMutableSet(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull Continuation<? super Set<E>> continuation) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object any(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107371 c107371;
        if (continuation instanceof C107371) {
            c107371 = (C107371) continuation;
            int i = c107371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107371.label = i - Integer.MIN_VALUE;
            } else {
                c107371 = new C107371(continuation);
            }
        }
        Object objHasNext = c107371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107371.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                c107371.L$0 = receiveChannel;
                c107371.label = 1;
                objHasNext = it.hasNext(c107371);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (ReceiveChannel) c107371.L$0;
                ResultKt.throwOnFailure(objHasNext);
            }
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return objHasNext;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x005d -> B:72:0x0060). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object count(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107401 c107401;
        ReceiveChannel receiveChannel2;
        Throwable th;
        Ref.IntRef intRef;
        ReceiveChannel receiveChannel3;
        ChannelIterator it;
        Object objHasNext;
        if (continuation instanceof C107401) {
            c107401 = (C107401) continuation;
            int i = c107401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107401.label = i - Integer.MIN_VALUE;
            } else {
                c107401 = new C107401(continuation);
            }
        }
        Object obj = c107401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                intRef = new Ref.IntRef();
                receiveChannel3 = receiveChannel;
                it = receiveChannel.iterator();
                c107401.L$0 = intRef;
                c107401.L$1 = receiveChannel3;
                c107401.L$2 = it;
                c107401.label = 1;
                objHasNext = it.hasNext(c107401);
                if (objHasNext != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) c107401.L$2;
            receiveChannel2 = (ReceiveChannel) c107401.L$1;
            intRef = (Ref.IntRef) c107401.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    it.next();
                    intRef.element++;
                    receiveChannel3 = receiveChannel2;
                    try {
                        c107401.L$0 = intRef;
                        c107401.L$1 = receiveChannel3;
                        c107401.L$2 = it;
                        c107401.label = 1;
                        objHasNext = it.hasNext(c107401);
                        if (objHasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel3;
                        obj = objHasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return Boxing.boxInt(intRef.element);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object maxWith(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) throws Throwable {
        C107621 c107621;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object objHasNext;
        if (continuation instanceof C107621) {
            c107621 = (C107621) continuation;
            int i = c107621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107621.label = i - Integer.MIN_VALUE;
            } else {
                c107621 = new C107621(continuation);
            }
        }
        Object obj = c107621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107621.L$0 = comparator;
                c107621.L$1 = receiveChannel;
                c107621.L$2 = it;
                c107621.label = 1;
                Object objHasNext2 = it.hasNext(c107621);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext2;
                comparator2 = comparator;
            } catch (Throwable th) {
                receiveChannel2 = receiveChannel;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            channelIterator = (ChannelIterator) c107621.L$2;
            receiveChannel2 = (ReceiveChannel) c107621.L$1;
            comparator2 = (Comparator) c107621.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c107621.L$3;
            channelIterator2 = (ChannelIterator) c107621.L$2;
            ReceiveChannel receiveChannel3 = (ReceiveChannel) c107621.L$1;
            comparator3 = (Comparator) c107621.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                C107621 c1076212 = c107621;
                Object obj3 = obj2;
                receiveChannel = receiveChannel3;
                C107621 c1076213 = c1076212;
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator2.next();
                    if (comparator3.compare(obj3, next) >= 0) {
                        next = obj3;
                    }
                    c107621 = c1076213;
                    c107621.L$0 = comparator3;
                    c107621.L$1 = receiveChannel;
                    c107621.L$2 = channelIterator2;
                    c107621.L$3 = next;
                    c107621.label = 2;
                    objHasNext = channelIterator2.hasNext(c107621);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c1076212 = c107621;
                    obj3 = next;
                    obj = objHasNext;
                    C107621 c10762132 = c1076212;
                    if (!((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return obj3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (((Boolean) obj).booleanValue()) {
            next = channelIterator.next();
            comparator3 = comparator2;
            ReceiveChannel receiveChannel4 = receiveChannel2;
            channelIterator2 = channelIterator;
            receiveChannel = receiveChannel4;
            c107621.L$0 = comparator3;
            c107621.L$1 = receiveChannel;
            c107621.L$2 = channelIterator2;
            c107621.L$3 = next;
            c107621.label = 2;
            objHasNext = channelIterator2.hasNext(c107621);
            if (objHasNext != coroutine_suspended) {
            }
        } else {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object minWith(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) throws Throwable {
        C107631 c107631;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object objHasNext;
        if (continuation instanceof C107631) {
            c107631 = (C107631) continuation;
            int i = c107631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107631.label = i - Integer.MIN_VALUE;
            } else {
                c107631 = new C107631(continuation);
            }
        }
        Object obj = c107631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c107631.L$0 = comparator;
                c107631.L$1 = receiveChannel;
                c107631.L$2 = it;
                c107631.label = 1;
                Object objHasNext2 = it.hasNext(c107631);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext2;
                comparator2 = comparator;
            } catch (Throwable th) {
                receiveChannel2 = receiveChannel;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            channelIterator = (ChannelIterator) c107631.L$2;
            receiveChannel2 = (ReceiveChannel) c107631.L$1;
            comparator2 = (Comparator) c107631.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c107631.L$3;
            channelIterator2 = (ChannelIterator) c107631.L$2;
            ReceiveChannel receiveChannel3 = (ReceiveChannel) c107631.L$1;
            comparator3 = (Comparator) c107631.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                C107631 c1076312 = c107631;
                Object obj3 = obj2;
                receiveChannel = receiveChannel3;
                C107631 c1076313 = c1076312;
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator2.next();
                    if (comparator3.compare(obj3, next) <= 0) {
                        next = obj3;
                    }
                    c107631 = c1076313;
                    c107631.L$0 = comparator3;
                    c107631.L$1 = receiveChannel;
                    c107631.L$2 = channelIterator2;
                    c107631.L$3 = next;
                    c107631.label = 2;
                    objHasNext = channelIterator2.hasNext(c107631);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c1076312 = c107631;
                    obj3 = next;
                    obj = objHasNext;
                    C107631 c10763132 = c1076312;
                    if (!((Boolean) obj).booleanValue()) {
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return obj3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (((Boolean) obj).booleanValue()) {
            next = channelIterator.next();
            comparator3 = comparator2;
            ReceiveChannel receiveChannel4 = receiveChannel2;
            channelIterator2 = channelIterator;
            receiveChannel = receiveChannel4;
            c107631.L$0 = comparator3;
            c107631.L$1 = receiveChannel;
            c107631.L$2 = channelIterator2;
            c107631.L$3 = next;
            c107631.label = 2;
            objHasNext = channelIterator2.hasNext(c107631);
            if (objHasNext != coroutine_suspended) {
            }
        } else {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object none(ReceiveChannel receiveChannel, Continuation continuation) throws Throwable {
        C107641 c107641;
        if (continuation instanceof C107641) {
            c107641 = (C107641) continuation;
            int i = c107641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107641.label = i - Integer.MIN_VALUE;
            } else {
                c107641 = new C107641(continuation);
            }
        }
        Object objHasNext = c107641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107641.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                c107641.L$0 = receiveChannel;
                c107641.label = 1;
                objHasNext = it.hasNext(c107641);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (ReceiveChannel) c107641.L$0;
                ResultKt.throwOnFailure(objHasNext);
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(!((Boolean) objHasNext).booleanValue());
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return boolBoxBoolean;
        } finally {
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ExifInterface.LONGITUDE_EAST, "", "it"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", m7120f = "Deprecated.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 */
    /* loaded from: classes5.dex */
    public static final class C107651 extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {
        public final /* synthetic */ ReceiveChannel<Object> $this_requireNoNulls;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107651(ReceiveChannel<Object> receiveChannel, Continuation<? super C107651> continuation) {
            super(2, continuation);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107651 c107651 = new C107651(this.$this_requireNoNulls, continuation);
            c107651.L$0 = obj;
            return c107651;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable Object obj, @Nullable Continuation<Object> continuation) {
            return ((C107651) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "Lkotlin/Pair;", ExifInterface.LONGITUDE_EAST, "R", EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_1, EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_2, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$1 */
    /* loaded from: classes5.dex */
    public static final class C107741 extends Lambda implements Function2<Object, Object, Pair<Object, Object>> {
        public static final C107741 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Pair<Object, Object> invoke(Object obj, Object obj2) {
            return TuplesKt.m7112to(obj, obj2);
        }
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "R", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/channels/ProducerScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m7120f = "Deprecated.kt", m7121i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m7122l = {487, 469, 471}, m7123m = "invokeSuspend", m7124n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, m7125s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n468#1:480\n468#1:481,6\n468#1:487,2\n468#1:489\n468#1:490,3\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 */
    /* loaded from: classes5.dex */
    public static final class C107752<V> extends SuspendLambda implements Function2<ProducerScope<? super V>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ReceiveChannel<R> $other;
        public final /* synthetic */ ReceiveChannel<E> $this_zip;
        public final /* synthetic */ Function2<E, R, V> $transform;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107752(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, Function2<? super E, ? super R, ? extends V> function2, Continuation<? super C107752> continuation) {
            super(2, continuation);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C107752 c107752 = new C107752(this.$other, this.$this_zip, this.$transform, continuation);
            c107752.L$0 = obj;
            return c107752;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super V> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C107752) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:61:0x0026, B:77:0x0088, B:80:0x009d, B:82:0x00a5, B:92:0x00ef, B:73:0x006b, B:76:0x0080), top: B:103:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:86:0x00c5, B:88:0x00cd, B:68:0x004b), top: B:99:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:61:0x0026, B:77:0x0088, B:80:0x009d, B:82:0x00a5, B:92:0x00ef, B:73:0x006b, B:76:0x0080), top: B:103:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ReceiveChannel receiveChannel;
            Function2 function2;
            ProducerScope producerScope;
            ChannelIterator channelIterator;
            ChannelIterator it;
            ReceiveChannel receiveChannel2;
            ProducerScope producerScope2;
            ChannelIterator channelIterator2;
            Function2 function22;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProducerScope producerScope3 = (ProducerScope) this.L$0;
                    ChannelIterator it2 = this.$other.iterator();
                    receiveChannel = this.$this_zip;
                    function2 = this.$transform;
                    producerScope = producerScope3;
                    channelIterator = it2;
                    it = receiveChannel.iterator();
                } else if (i == 1) {
                    it = (ChannelIterator) this.L$4;
                    receiveChannel = (ReceiveChannel) this.L$3;
                    function2 = (Function2) this.L$2;
                    channelIterator = (ChannelIterator) this.L$1;
                    producerScope = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        this.L$0 = producerScope;
                        this.L$1 = channelIterator;
                        this.L$2 = function2;
                        this.L$3 = receiveChannel;
                        this.L$4 = it;
                        this.L$5 = next;
                        this.label = 2;
                        Object objHasNext = channelIterator.hasNext(this);
                        if (objHasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ReceiveChannel receiveChannel3 = receiveChannel;
                        obj2 = next;
                        obj = objHasNext;
                        producerScope2 = producerScope;
                        channelIterator2 = channelIterator;
                        function22 = function2;
                        receiveChannel2 = receiveChannel3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        Unit unit = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        return unit;
                    }
                } else if (i == 2) {
                    Object obj3 = this.L$5;
                    ChannelIterator channelIterator3 = (ChannelIterator) this.L$4;
                    receiveChannel2 = (ReceiveChannel) this.L$3;
                    function22 = (Function2) this.L$2;
                    channelIterator2 = (ChannelIterator) this.L$1;
                    producerScope2 = (ProducerScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj3;
                        it = channelIterator3;
                        if (!((Boolean) obj).booleanValue()) {
                            Object objInvoke = function22.invoke(obj2, channelIterator2.next());
                            this.L$0 = producerScope2;
                            this.L$1 = channelIterator2;
                            this.L$2 = function22;
                            this.L$3 = receiveChannel2;
                            this.L$4 = it;
                            this.L$5 = null;
                            this.label = 3;
                            if (producerScope2.send(objInvoke, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel = receiveChannel2;
                            function2 = function22;
                            channelIterator = channelIterator2;
                            producerScope = producerScope2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        receiveChannel = receiveChannel2;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th2;
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) this.L$4;
                    receiveChannel = (ReceiveChannel) this.L$3;
                    function2 = (Function2) this.L$2;
                    channelIterator = (ChannelIterator) this.L$1;
                    producerScope = (ProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                this.L$0 = producerScope;
                this.L$1 = channelIterator;
                this.L$2 = function2;
                this.L$3 = receiveChannel;
                this.L$4 = it;
                this.L$5 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @PublishedApi
    @NotNull
    public static final <E, R, V> ReceiveChannel<V> zip(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull ReceiveChannel<? extends R> receiveChannel2, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super R, ? extends V> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new C107752(receiveChannel2, receiveChannel, function2, null), 6, null);
    }

    /* compiled from: Deprecated.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "cause", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1 */
    /* loaded from: classes5.dex */
    public static final class C107381 extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ ReceiveChannel<?> $this_consumes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107381(ReceiveChannel<?> receiveChannel) {
            super(1);
            receiveChannel = receiveChannel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            ChannelsKt.cancelConsumed(receiveChannel, th);
        }
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> consumes(@NotNull ReceiveChannel<?> receiveChannel) {
        return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumes.1
            public final /* synthetic */ ReceiveChannel<?> $this_consumes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C107381(ReceiveChannel<?> receiveChannel2) {
                super(1);
                receiveChannel = receiveChannel2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
            }
        };
    }
}
