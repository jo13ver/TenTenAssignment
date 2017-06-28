package com.magdaleno.tenten.util.computer.command.contract;

import android.support.annotation.NonNull;

import com.magdaleno.tenten.util.computer.Computer;

/**
 * Created by John Oliver "Jover" Magdaleno on 6/28/2017.
 */

public interface CommandWithComputer extends Command {
    void addComputer(@NonNull final Computer computer);
}
