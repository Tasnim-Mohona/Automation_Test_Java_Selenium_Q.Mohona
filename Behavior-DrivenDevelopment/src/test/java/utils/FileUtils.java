package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class FileUtils {
    public boolean isFileExists(File file) {
        try {
            Awaitility.await().atMost(SettingsTestData.getEnvData().getWait(), TimeUnit.SECONDS).until(file::exists);
        } catch (ConditionTimeoutException exception) {
            return false;
        }
        return true;
    }

    public boolean isFileDownloaded(String fileName) {
        String downloadDirectory = getBrowser().getDownloadDirectory();
        File file = new File(downloadDirectory + File.separator + fileName);
        return isFileExists(file);
    }
}
