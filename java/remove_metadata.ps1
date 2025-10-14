Get-ChildItem -Path 'app/src/main/java' -Recurse -Filter '*.java' | ForEach-Object {
    $content = Get-Content $_.FullName -Raw
    $newContent = $content -replace '(?m)^@Metadata\(.*\r?\n', ''
    if ($newContent -ne $content) {
        Set-Content $_.FullName $newContent
        Write-Host 'Updated:' $_.FullName
    }
}
