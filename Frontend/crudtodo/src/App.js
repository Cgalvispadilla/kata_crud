import React, { useContext, useEffect, useRef, useState } from "react";
import { StoreProvider } from "./providers/Provider";
import Form from "./components/form";

function App() {
  return (
    <StoreProvider>
      <h3>To-Do List</h3>
      <Form />
    </StoreProvider>
  );
}

export default App;
