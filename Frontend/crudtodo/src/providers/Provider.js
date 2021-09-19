import React, { useReducer } from "react";
import { initialState } from "../Store/Store";
import reducer from "../reducers/Reducer";
import { Store } from "../Store/Store";

export const StoreProvider = ({ children }) => {
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <Store.Provider value={{ state, dispatch }}>{children}</Store.Provider>
  );
};
