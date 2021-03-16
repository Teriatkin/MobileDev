package ua.kpi.comsys.iv8226.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Calendar;
import java.util.GregorianCalendar;

import ua.kpi.comsys.iv8226.lab1_2.TimeNT;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        String error = "";
        try{
            TimeNT lastTest = new TimeNT(23, 62, 60);
        }catch (IllegalArgumentException e){
            error = e.getMessage();
        }

        TimeNT test1 = new TimeNT(4, 7, 49);
        TimeNT test2 = new TimeNT(16, 11, 48);
        TimeNT test2_1 = new TimeNT(23, 59, 59);
        mText = new MutableLiveData<>();
        Calendar calendar = new GregorianCalendar(2001, 9, 11);
        calendar.set(Calendar.HOUR, 13);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 51);


        mText.setValue(test1.getTime() +
                "\n" + test2.getTime() + "+" + test2_1.getTime() + "=" + test2.plus2Time(test2_1).getTime() +
                "\n" + test2.getTime() + "-" + test2_1.getTime() + "=" + test2.minus2Time(test2_1).getTime() +
                "\n" + TimeNT.minus2Time(new TimeNT(), new TimeNT(6, 5, 50)).getTime() +
                "\n" + TimeNT.plus2Time(new TimeNT(12, 10, 0), new TimeNT(calendar)).getTime()+
                "\n" + error);

    }
    public LiveData<String> getText() {
        return mText;
    }

}