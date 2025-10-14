package org.jfrog.filespecs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfrog.filespecs.aql.AqlConverter;
import org.jfrog.filespecs.entities.FilesGroup;
import org.jfrog.filespecs.entities.InvalidFileSpecException;

/* loaded from: classes5.dex */
public class FileSpec {
    public List<FilesGroup> files = new ArrayList();

    public List<FilesGroup> getFiles() {
        return this.files;
    }

    public void addFilesGroup(FilesGroup filesGroup) {
        this.files.add(filesGroup);
    }

    public List<String> toAql() throws InvalidFileSpecException {
        FileSpecsValidation.validateSearchBasedFileSpec(this);
        ArrayList arrayList = new ArrayList();
        Iterator<FilesGroup> it = getFiles().iterator();
        while (it.hasNext()) {
            arrayList.add(AqlConverter.convertFilesGroupToAql(it.next()));
        }
        return arrayList;
    }

    public static FileSpec fromString(String str) throws InvalidFileSpecException {
        ObjectMapper objectMapper = new ObjectMapper();
        String strReplace = str.replace("\\", "\\\\");
        try {
            FileSpec fileSpec = (FileSpec) objectMapper.readValue(strReplace, FileSpec.class);
            FileSpecsParsingUtils.pathToUnixFormat(fileSpec);
            return fileSpec;
        } catch (JsonProcessingException e) {
            throw new InvalidFileSpecException(String.format("Parsing of file spec failed:\n%s", strReplace), e);
        }
    }
}
