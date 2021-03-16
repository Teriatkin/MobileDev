package ua.kpi.comsys.iv8226.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Теряткін Назарій\nГрупа ІВ-82\nЗК ІВ-8226");
    }

    public LiveData<String> getText() {
        return mText;
    }
}