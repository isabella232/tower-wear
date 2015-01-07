package com.o3dr.android.dp.wear.fragment;

import android.content.Context;
import android.content.Intent;

import com.o3dr.android.dp.wear.R;
import com.o3dr.android.dp.wear.lib.utils.WearUtils;
import com.o3dr.android.dp.wear.services.WearReceiverService;

/**
 * Created by fhuya on 1/3/15.
 */
public class TakeOffActionFragment extends BaseActionFragment {
    @Override
    protected int getActionImageResource() {
        return R.drawable.ic_file_upload_white_48dp;
    }

    @Override
    protected CharSequence getActionLabel() {
        return getText(R.string.take_off);
    }

    @Override
    protected void onActionClicked() {
        final Context context = getContext();
        context.startService(new Intent(context, WearReceiverService.class).setAction(WearUtils.ACTION_TAKE_OFF));
    }
}
