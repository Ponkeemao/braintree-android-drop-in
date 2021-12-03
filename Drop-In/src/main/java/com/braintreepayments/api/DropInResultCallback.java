package com.braintreepayments.api;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/**
 * Callback for receiving the result of {@link DropInLauncher#registerForActivityResult(Fragment, DropInResultCallback)}
 * and {@link DropInLauncher#registerForActivityResult(FragmentActivity, DropInResultCallback)}
 */
public interface DropInResultCallback {
    /**
     * @param dropInResult {@link DropInResult}
     * @param error an exception that occurred while processing a DropInResult
     */
    void onResult(@Nullable DropInResult dropInResult, @Nullable Exception error);
}
