import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LandingPage from "./componentPages/LandingPage";
import CasePage from "./componentPages/CasePage";
import Footer from "./components/Footer";
import React from "react";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<LandingPage />} />

        <Route path="/carcase" element={<CasePage />} />
        <Route path="/coolere" element={<LandingPage />} />
        <Route path="/desktop-uri" element={<LandingPage />} />
        <Route path="/hard-disk-uri" element={<LandingPage />} />
        <Route path="/laptopuri" element={<LandingPage />} />
        <Route path="/memorii" element={<LandingPage />} />
        <Route path="/placi-de-baza" element={<LandingPage />} />
        <Route path="/placi-video" element={<LandingPage />} />
        <Route path="/procesoare" element={<LandingPage />} />
        <Route path="/ssd-uri" element={<LandingPage />} />
        <Route path="/surse" element={<LandingPage />} />
        <Route path="/ventilatoare" element={<LandingPage />} />

        <Route path="/add-case" element={<Footer />} />
        <Route path="/cases" element={<Footer />}>
          <Route path=":caseId" element={<Footer />}></Route>
        </Route>
        <Route path="*" element={<Footer />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
