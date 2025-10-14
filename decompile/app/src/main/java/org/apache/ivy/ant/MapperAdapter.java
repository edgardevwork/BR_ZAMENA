package org.apache.ivy.ant;

import org.apache.ivy.core.retrieve.FileNameMapper;
import org.apache.tools.ant.types.Mapper;

/* loaded from: classes7.dex */
public class MapperAdapter implements FileNameMapper {
    public static final String[] EMPTY = new String[0];
    public Mapper mapper;

    public MapperAdapter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // org.apache.ivy.core.retrieve.FileNameMapper
    public String[] mapFileName(String str) {
        String[] strArrMapFileName = this.mapper.getImplementation().mapFileName(str);
        return strArrMapFileName == null ? EMPTY : strArrMapFileName;
    }
}
