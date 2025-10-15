package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes4.dex */
public class zzms extends Enum<zzms> {
    public static final zzms zza;
    public static final zzms zzb;
    public static final zzms zzc;
    public static final zzms zzd;
    public static final zzms zze;
    public static final zzms zzf;
    public static final zzms zzg;
    public static final zzms zzh;
    public static final zzms zzi;
    public static final zzms zzj;
    public static final zzms zzk;
    public static final zzms zzl;
    public static final zzms zzm;
    public static final zzms zzn;
    public static final zzms zzo;
    public static final zzms zzp;
    public static final zzms zzq;
    public static final zzms zzr;
    private static final /* synthetic */ zzms[] zzs;
    private final zzmz zzt;
    private final int zzu;

    public /* synthetic */ zzms(String str, int i, zzmz zzmzVar, int i2, zzmy zzmyVar) {
        this(str, i, zzmzVar, i2);
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzmz zzb() {
        return this.zzt;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.measurement.zzmu.<init>(java.lang.String, int, com.google.android.gms.internal.measurement.zzmz, int, com.google.android.gms.internal.measurement.zzmy):void, class status: NOT_LOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    static {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzms.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    zzms(String str, int i, zzmz zzmzVar, int i2) {
        super(str, i);
        this.zzt = zzmzVar;
        this.zzu = i2;
    }

    public static zzms[] values() {
        return (zzms[]) zzs.clone();
    }
}
