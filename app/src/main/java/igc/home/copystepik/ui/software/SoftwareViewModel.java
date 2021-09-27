package igc.home.copystepik.ui.software;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import igc.home.copystepik.ui.notifications.NotificationsViewModel;

public class SoftwareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SoftwareViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

