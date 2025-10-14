# Script to fix 'm9to' to 'to' in Java files
# Logs the changes made

$logFile = "fix_m9to_log.txt"
$javaDir = "app\src\main\java"

Write-Host "Starting fix for 'm9to' to 'to' in Java files..."
"Starting fix for 'm9to' to 'to' in Java files at $(Get-Date)" | Out-File -FilePath $logFile -Append

Get-ChildItem -Path $javaDir -Recurse -Filter "*.java" | ForEach-Object {
    $filePath = $_.FullName
    $content = Get-Content $filePath -Raw
    if ($content -match 'm9to') {
        Write-Host "Processing file: $filePath"
        "$filePath" | Out-File -FilePath $logFile -Append
        $newContent = $content -replace 'm9to', 'to'
        $newContent | Set-Content $filePath
        Write-Host "Replaced 'm9to' in $filePath"
        "Replaced 'm9to' in $filePath" | Out-File -FilePath $logFile -Append
    }
}

Write-Host "Fix completed. Check $logFile for details."
"Fix completed at $(Get-Date)" | Out-File -FilePath $logFile -Append
